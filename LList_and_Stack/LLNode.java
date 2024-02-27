package LList_and_Stack;

public class LLNode {

    //int ser;
    String name;
    LLNode next = null;

    public LLNode (String name){
        this.name = name;
    }
    public LLNode (){
        this.name = "name"+ String.valueOf((int)(Math.random()*1000));
    }

    public String toString (){
        return this.name;
        //ser+" ";
    }

    public void print (){
        System.out.println(toString());
    }

}