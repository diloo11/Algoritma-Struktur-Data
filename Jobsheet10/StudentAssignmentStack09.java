package Jobsheet10;

public class StudentAssignmentStack09 {
    Student09[] stack;
    int size, top;

    StudentAssignmentStack09 (int size) {
        this.size = size;
        top = -1;
        stack = new Student09[size];
    }

    boolean isFull() {
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    void push(Student09 std){
        if(!isFull()){
            top++;
            stack[top] = std;
        }else{
            System.out.println("Stack is already full!");
        }
    }

    Student09 pop(){
        if(!isEmpty()){
            Student09 std = stack[top];
            top--;
            return std;
        }else{
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student09 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    void print(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"+stack[i].className);
        }
        System.out.println("");
    }
}
