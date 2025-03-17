/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author seanb
 */
public interface QueueInterface<T> {
    
    public boolean isEmpty();
    public int size();
    public void enqueue(T element);
    public T dequeue();
    public String peek();
    public String displayQueue();
}
