package Jobsheet13;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student("114", "Rizki", "TI-1I",
        3.8));
        dll.print();
        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I",
        3.6));
        dll.print();
        dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I",
        3.4));
        dll.print();    
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();

        dll.add(0, new Student("333", "Aulia", "TI-1C", 3.99)); 
        dll.add(1, new Student("444", "Resty", "TI-1C", 3.98));
        System.out.println("Size: " + dll.getSize());
        dll.print();
        System.out.println("Index of 444: " + dll.indexOf("444"));
        dll.removeAfter("444");
        dll.print();

        Student first = dll.getFirst();
        System.out.println("First: ");
        first.print();

        Student last = dll.getLast();
        System.out.println("Last: ");
        last.print();

        Student searchedIdx = dll.getIndex(2);  
        System.out.println("Index 2: ");
        searchedIdx.print();                          

    }
}
