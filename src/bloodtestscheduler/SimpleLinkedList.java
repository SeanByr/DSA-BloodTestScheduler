/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author seanb
 */

//SSL will hold all the details for each patient in the queue

public class SimpleLinkedList<T> implements SLLInterface<T> {
    
    private SLLNode<T> head, curr, prev;
    private int size;
    
    
    public SimpleLinkedList(){ //constructor for creating an empty SLL
        size = 0;
        head = null;
        curr = prev = null;
    }
    
    
    @Override
    public boolean isEmpty(){ //method for if the SLL is empty
        return size == 0; 
    }
    
    @Override
    public int size(){ //method for checking how many elements are in the SLL
        return size;
    }
    
    private void setCurrent(int index){ //sets the pointers for the node based on the index
        
        curr = head;
        prev = null;
        
        for(int k = 1; k < index; k++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    @Override
    public void add(T element){ //method for added elements to the SLL
        SLLNode<T> newNode = new SLLNode(element, null);
        if(head == null){ //if the list is empty set the newNode as the new head
            head = newNode;
        } else { //go to the last node and add the newNode
            setCurrent(size);
            curr.setNext(newNode);
        }
        size++; //increases the size of the SLL 
    }
    
    @Override
    public void add(int index, T element){ //method for adding elements at a given index
        if(index == 1){ //if for adding elements at the start of a node
            SLLNode<T> newNode = new SLLNode(element, head);
            head = newNode;
        } else if(index > size){ //if for adding elements that are bigger then the current size of the SSL
            setCurrent(size);
            SLLNode<T> newNode = new SLLNode(element, null);
            curr.setNext(newNode);
        } else { //if for adding elements within the size of the SLL
            setCurrent(index);
            SLLNode<T> newNode = new SLLNode(element, curr);
            prev.setNext(newNode);
        }
        size++; //increases the size of the SLL
    }
    
    @Override
    public void remove(int index){ //method for removing elements at a given index
        
        if(index == 1){ //if for removing elements at the head
            head = head.getNext();
        } else { // if for removing element from the rest of the SLL
            setCurrent(index);
            prev.setNext(curr.getNext());
        }
        size--; //decrease the size of the SLL
    }
    
    @Override
    public T get(int index){ //method for getting the element at the given index
        
        setCurrent(index);
        return curr.getElement();
    }
    
    @Override
    public String print(){ //method for printing all the elements in the SLL
        StringBuilder sb = new StringBuilder();
        int i = 1;
        SLLNode<T> temp = head;
        while(temp != null){
            sb.append("Patient " + i + ":\n" + temp.getElement().toString()).append("\n");
            temp = temp.getNext();
            i++;
        }
        return sb.toString();
    }
}
