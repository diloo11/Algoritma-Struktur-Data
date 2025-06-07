package CaseStudy2;

public class GasStQueue {
    Node front;
    Node rear;
    int size;
    int max = 10;
    Transaction[] servedArray = new Transaction[100];
    int count = 0;

    public GasStQueue() {
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

    public void enqueue(Vehicle vhc) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more vehicles");
            return;
        }

        Node newNode = new Node(vhc);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(">> Vehicle has been added to the queue");
    }

    public Vehicle dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No vehicle to serve");
            return null;
        }

        Vehicle servedVhc = front.vehicle;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return servedVhc;
    }

    public int getSize() {
        return size;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Vehicle Queue: ");
        Node temp = front;
        while (temp != null) {
            temp.vehicle.print();
            temp = temp.next;
        }
    }

    public void addHistory(Transaction transaction) {
        if (count < servedArray.length) {
            servedArray[count] = transaction;
            count++;
        } else {
            System.out.println("Full History");
        }

    }

    public void displayHistory() {
        if (count < 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Transaction History");
        for (int index = 0; index < count; index++) {
            servedArray[index].print();
        }
    }

}