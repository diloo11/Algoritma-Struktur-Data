package Jobsheet12;

public class StudentQueue {
    Node front;
    Node rear;
    int size;
    int max = 100;

    public StudentQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Student std) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more students");
            return;
        }

        Node newNode = new Node(std);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Student " + std.name + " has been added to the queue");
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No students to serve");
            return null;
        } 

        Student servedStudent = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return servedStudent;
    }

    public Student peekFront() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    public Student peekRear() {
        if (isEmpty()) {
            return null;
        }
        return rear.data;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue has been cleared");
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }   

        System.out.println("Current Queue:");
        System.out.println();

        Node current = front;
        while (current != null) {
            current.data.display();
            current = current.next;        }
    }
}
