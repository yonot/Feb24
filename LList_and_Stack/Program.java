package LList_and_Stack;

public class Program {

    public static void main(String[] args) {

        MyStack ms = new MyStack();

        ms.push(new LLNode("Dan"));
        ms.push(new LLNode("Aviv"));
        ms.push(new LLNode("Moshe"));
        ms.push(new LLNode("Sima"));
        ms.push(new LLNode("Dudu"));

        ms.print();
        System.out.println("popping "+ms.pop());
        //ms.push(new LLNode("Benny"));

        ms.print();

        
    }    // end of main



}
