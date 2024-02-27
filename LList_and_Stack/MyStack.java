package LList_and_Stack;

/**
 * Using private LList_and_Stack.LList stack
 */
public class MyStack {

    private LList stack = new LList();

    public void push (LLNode newNode) {
        if (stack.getSize()==0) {
            stack.add(newNode);
        } else {
            stack.add(newNode, 0);
        }
    }
    public LLNode pop (){
        if (stack.getSize()==0) {
            return null;
        } else {
            return stack.pull(0);
        }
    }
    public int size (){
        return stack.getSize();
    }
    /*public String toString (){
        return stack.toString();
    }*/
    public void print(){
        stack.print();
    }

}
