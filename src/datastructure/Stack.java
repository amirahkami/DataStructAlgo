package datastructure;

public class Stack
{
    private char[] stack;
    private int top;
    private int size;

    public Stack(int size)
    {
        this.size = size;
        this.stack = new char[size];
        this.top = -1;
    }

    public void push(char element)
    {
        if (top == size - 1) {
            System.out.println("Stack is full!");
            return;
        }

        stack[++top] = element;
    }

    public char pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return ' ';
        }

        return stack[top--];
    }

    public char peek()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return ' ';
        }

        return stack[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int getSize()
    {
        return top + 1;
    }
}