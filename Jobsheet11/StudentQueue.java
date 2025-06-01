package Jobsheet11;

public class StudentQueue {
    Student[] data;
    int front, rear, size, max;

    public StudentQueue(int n){
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    void peek(){
        if(!isEmpty()){
            System.out.println("Front data: " +data[front]);
        }else{
            System.out.println("Queue is empty!!");
        }
    }

    void print() {
        if(!isEmpty()){
            int i = front;
            while(i != rear) {
                System.out.println(data[i]+" ");
                i = (i+1)%max;
            }
            System.out.println(data[i]+" ");
            System.out.println("Number of element: " + size);
        }else{
            System.out.println("Queue is empty!!!");
        }
    }

    void clear(){
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        }else{
            System.out.println("Queue is already empty!!!");
        }
    }

    void enqueue(Student dt){
        if(!isFull()){
            System.out.println("Queue is full!!!");
            return;
        }
        rear = (rear+1)%max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
    }

    Student dequeue() {
        if(isEmpty())
    }
}
