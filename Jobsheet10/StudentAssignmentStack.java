package Jobsheet10;

public class StudentAssignmentStack {
    Student[] stack;
    int top, size;

    public StudentAssignmentStack(int size) {
        this.size = size;
        top = -1;
        stack = new Student[size];
    }

    boolean isFull(){
        if(top == size - 1){
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        } else{
            return false;
        }
    }

    void push (Student std){
        if (!isFull()) {
            top++;
            stack[top] = std;
        } else{
            System.out.println("Stack is already full!!");
        }
    }

    Student pop(){
        if (!isEmpty()) {
            Student std = stack[top];
            top--;
            return std;
        } else{
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    Student peek(){
        if (!isEmpty()) {
            return stack[top];
        } else{
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println();
    }

    Student getFirsAssignment(){
        if(!isEmpty()){
            return stack[0];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    int totAssignment(){
        return top + 1;
    }

    String convertToBinary(int grade){
        ConversionStack stack = new ConversionStack();
        while (grade > 0){
            int mod = grade % 2;
            stack.push(mod);
            grade = grade/2;
        }

        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }
    
}
