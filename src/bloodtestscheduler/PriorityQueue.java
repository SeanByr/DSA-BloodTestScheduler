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

//PQ will hold all the details for all the Patients in the PQ in order based on priority
public class PriorityQueue<T> implements PQInterface<T> {
    
    private ArrayList <PQElement<T>> pq;
    
    public PriorityQueue(){
        pq = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty(){
        return pq.isEmpty();
    }
    
    @Override
    public int size(){
        return pq.size();
    }
    
    @Override
    public void enqueue(int priorityKey, T item){
        PQElement<T> newElement = new PQElement(priorityKey, item);
            int i = 0;
            while(i < pq.size() && pq.get(i).getPriority() <= priorityKey){
                i++;
            }
            pq.add(i, newElement);
        }
    
    @Override
    public T dequeue(){
        if(pq.isEmpty()){
            return null;
        }
        return pq.remove(0).getElement();
    }
    
    @Override
    public String peek(){
        String result = "";
        result += pq.get(0);
            return result;
    }
    
   
    }

