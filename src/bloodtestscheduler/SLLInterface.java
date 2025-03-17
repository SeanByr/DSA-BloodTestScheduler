/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author seanb
 */

//interface for a SLL
public interface SLLInterface<T> {
    
    public boolean isEmpty(); //method for if the SLL is empty
    public int size(); //method for checking how many elements are in the SLL
    public void add(T element); //method for added elements to the SLL
    public void add(int index, T element); //method for adding elements at a given index
    public void remove(int index); //method for removing elements at a given index
    public T get(int index); //method for getting the element at the given index
    public String print(); //method for printing all the elements in the SLL
}
