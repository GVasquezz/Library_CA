package Utilities;


public class MyOwnQueue implements ArrayQueue {
    
    private String[] data;
    private int queueSize;
    private int capacity;
    private int front; //Front element index
    private int back; // Back element index

    public MyOwnQueue() {
        this.capacity = capacity;
        this.data = new String[capacity];
        this.queueSize = 0;
        this.front = -1;
        this.back = -1;
    }

    @Override
    public boolean Enqueue(String newElement) {
        
        if (queueSize >= capacity ) {
            
            return false;
        }
        //If the queue is empty, move the front pointer
        if (front == -1) {
            front++;
        }
        //back pointer increases +1
        back++;
        data[back] = newElement;
        queueSize++;
        return true;
    }

    @Override
    public String Dequeue() {
        
        if(queueSize == 0) {
            return null;
            
        }
        //Saving the element to be removed. 
        String toReturn = data[front];
        //deletes the element in the front position.
        data[front] = null;
        front++;
        queueSize--;
        return toReturn;
    }

    @Override
    public String First() {
        if (queueSize == 0) {
            return null;
        }
        return data[front];
    }

    @Override
    public String Last() {
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
    
    public String[] getFullQueue(){
       String[] returnArray = new String[queueSize];
        for (int i=0; i<=back; i++){
            returnArray[i] = data[i];
            }
        
        return returnArray;
    }
    
    
    
}
