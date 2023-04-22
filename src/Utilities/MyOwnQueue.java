package Utilities;

import Model.Readers;


public class MyOwnQueue implements ArrayQueue {
    
    private Readers[] data;
    private int queueSize;
    private int capacity;
    private int front; //Front element index
    private int back; // Back element index

    public MyOwnQueue() {
        this.capacity = capacity;
        this.data = new Readers[capacity];
        this.queueSize = 0;
        this.front = -1;
        this.back = -1;
    }

    @Override
    public Boolean Enqueue(Readers newReader) {
        
        if (queueSize >= capacity ) {
            
            return false;
        }
        //If the queue is empty, move the front pointer
        if (front == -1) {
            front++;
        }
        //back pointer increases +1
        back++;
        data[back] = newReader;
        queueSize++;
        return true;
    }

    @Override
    public Readers Dequeue() {
        
        if(queueSize == 0) {
            return null;
            
        }
        //Saving the element to be removed. 
        Readers toReturn = data[front];
        //deletes the element in the front position.
        data[front] = null;
        front++;
        queueSize--;
        return toReturn;
    }

    @Override
    public Readers First() {
        if (queueSize == 0) {
            return null;
        }
        return data[front];
    }

    @Override
    public Readers Last() {
        if (queueSize == 0) {
            return null;
        }
        return data[back];
    }

    @Override
    public int size() {
        
        return queueSize;
    }

    @Override
    public boolean isEmpty() {
        if (queueSize == 0) {
            
            return true;
        }
        
        return false;
    }
    @Override
    public String toString() {
        
        String toReturn = "[ ";
        
        for (int i = front; i < back; i++) {
            
            toReturn += data[i] + ", ";
        }
        
        return toReturn += " ]";
    }
    
    public Readers[] getFullQueue(){
       Readers[] returnArray = new Readers[queueSize];
        for (int i=0; i<=back; i++){
            returnArray[i] = data[i];
            }
        
        return returnArray;
    }

    
    
    
    
}
