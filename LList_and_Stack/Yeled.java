package LList_and_Stack;

public class Yeled {
    int ser;
    Yeled next = null;

    public Yeled (){
        this.ser = (int)(Math.random()*1000)-500;
    }

    public String toString (){return ser+" ";}
}