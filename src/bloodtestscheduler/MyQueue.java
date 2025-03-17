/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author seanb
 */
public class MyQueue<T> implements QueueInterface<T> {
    
    
    private ArrayList<T> queue;
    
    public MyQueue(){
        queue = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    @Override
    public int size(){
        return queue.size();
    }
    
    @Override
    public void enqueue(T element){
        queue.add(element);
    }
    
    @Override
    public T dequeue(){
        return queue.remove(0);
    }
    
    @Override
    public String peek(){
        String result = "";
        result += queue.get(0);
        return result;
    }
    
    @Override
    public String displayQueue(){
    String result = "";
    
    if(queue.isEmpty()){
        return "";
    } else {
        for(int i = 0; i < queue.size(); i++){
            result += queue.get(i) + "\n";
        }
    }
    return result;
    }
}
