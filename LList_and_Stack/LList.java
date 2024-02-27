package LList_and_Stack;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class LList {

    private LLNode head = null;
    private int size = 0;

    public int getSize() {
        return size;
    }

    private void addNode (LLNode newNode, int idx){           // non-recursive
        //
        if (size==0) {
            head=newNode;
        } else if (idx==0) {
            newNode.next = head;
            head = newNode;
        } else {
            LLNode current = head;
            int counter = idx;
            while (nonNull(current.next) && counter>1){
                current = current.next;
                counter--;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    /**
     * Adds a node inside the range, so that existing nodes must be moved forward.
     * (To add a node after all existing nodes, or when there are no nodes yet,
     * use this method without an index.)
     * @param newNode
     * @param idx
     */
    public void add (LLNode newNode, int idx){
        if (!indexOK(idx)) {
            System.out.println("index out of range");
        } else {
            addNode(newNode,idx);
        }
    }

    /**
     * Adds a node after all existing nodes, or when there are no nodes yet.
     * (To add a node inside the range, so that existing nodes must be moved forward,
     * use this method with an index.)
     * @param newNode
     */
    public void add (LLNode newNode){
        // this will add a node at the end of the list.
        addNode(newNode,size);
    }

    public LLNode pull (int idx){
        if (size==0 || !indexOK(idx)) {
            System.out.println("index out of range");
            return null;
        }
        LLNode current = head;
        // in case there is only one node, or we are pulling the node whose idx=0
        if (isNull(current.next) || idx==0) {
            head = head.next;
            size--;
            return current;
        }
        // when there is more than one node:
        for (int i = 0; i < idx-1 ; i++) {
            current = current.next;
        }
        LLNode nodeToPull = current.next;
        current.next = current.next.next;
        size--;
        return nodeToPull;
    }

    private boolean indexOK (int idx) {
        return (idx>=0 && idx<size);
    }

    /*public String toString (){
        return (isNull(head)? "" : head.ser+" ");
    }*/

    public String toString () { // non recursive
        if (head == null) return "";
        else {
            String lStr = "";
            LLNode current = head;
            while (nonNull(current.next)){
                //lStr += current.ser + " ";
                lStr += current.toString() + " -> ";
                current = current.next;
            }
            lStr += current.toString() + " ";
            return lStr;
        }
    }
    public void print (){
        System.out.println(toString() +
                "    (Size: " + size+")");
    }

}
