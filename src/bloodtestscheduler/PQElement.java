/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author seanb
 */
public class PQElement<T>{
    
    private int priority;
    private T element;
    
    public PQElement(int priority, T element){
        this.priority = priority;
        this.element = element;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public T getElement(){
        return element;
    }

    @Override
    public String toString() {
        return element + "";
    }
    
}
