/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author seanb
 */
public interface PQInterface<T> {
    
    public boolean isEmpty();
    public int size();
    public void enqueue(int priority, T item);
    public T dequeue();
    public String peek();
    
}
