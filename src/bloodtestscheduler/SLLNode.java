/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author seanb
 */

//class for representing nodes in a SLL
public class SLLNode<T> {
    
    
    private T element; //the data thats being stored in each node
    private SLLNode<T> next; //gives a reference to the next node in a SLL

    public SLLNode(T element, SLLNode<T> next) { //constructor
        this.element = element;
        this.next = next;
    }

    
    //getters and setters
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public SLLNode<T> getNext() {
        return next;
    }

    public void setNext(SLLNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element: " + element;
    }
    
    
}
