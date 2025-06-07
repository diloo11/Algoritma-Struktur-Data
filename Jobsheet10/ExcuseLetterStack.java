package Jobsheet10;

public class ExcuseLetterStack {
    ExcuseLetter09[] letterStack;
    int top, size;

    public ExcuseLetterStack(int size) {
        this.size = size;
        top = -1;
        letterStack = new ExcuseLetter09[size];
    }

    boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push (ExcuseLetter09 ltr) {
        if (!isFull()) {
            top++;
            letterStack[top] = ltr;
        } else {
            System.out.println("Stack is already full");
        }
    }

    ExcuseLetter09 pop() {
        if (!isEmpty()) {
            ExcuseLetter09 ltr = letterStack[top];
            top--;
            return ltr;
        } else {
            System.out.println("There is no data in Stack");
            return null;
        }
    }

    ExcuseLetter09 peek() {
        if (!isEmpty()) {
            return letterStack[top];
        } else {
            System.out.println("There is no data in Stack");
            return null;
        }
    }

    ExcuseLetter09 searchLetter(String searchName) {
        for (int i = 0; i <= top; i++) {
            if (letterStack[i].name.equalsIgnoreCase(searchName)) {
                return letterStack[i];
            }
        }
        System.out.println("Letter for name " + searchName + " not found");
        return null;
    }
}
