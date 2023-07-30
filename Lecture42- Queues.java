
class MyQueue{
    final int size = 10;
    int arr[] = new int[size];
    int front = -1;
    int rear = -1;
    boolean isEmpty(){
        return (front==-1 && rear==-1);
    }
    
    int peek(){
        if(this.sEmpty()){
            System.out.println("Empty Queue!! Nothing at Front");
            return -1;
        }
        return arr[front];
    }
    
    void enqueue(int data){
        
        if(this.isEmpty()){
            front++;
        }
        
        if(rear == size -1){
            System.out.println("Queue is full!! Cannot Enqueue.");
            return;
        }
        
        
        arr[++rear] = data;
    }
    
    int dequeue(){
        if(this.isEmpty()){
            System.out.println("Empty Queue!! Nothing to dequeue.");
            return -1;
        }
        if(front == rear){
            int x = arr[front];
            front = -1;
            rear = -1;
            return x;
        }
        return arr[front++];
    }
}

public class ArrayImp{
    public static void main(String[] args){
        MyQueue q = new MyQueue();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        Systemout,println(q.dequeue());
        q.enqueue(7);
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
    }
}