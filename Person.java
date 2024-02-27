public class Person {

    private String name;
    private int height, weight;
    //private int x = 127;

    public Person (){
        this ("generic", 170, 70);
    }
    public Person (String name, int height, int weight){
        //System.out.println();
        this.setName(name);
        this.setHeight(height);
        this.setWeight(weight);
    }
    public Person (Person other){
        this (other.name, other.weight, other.height);
    }






    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String show(){
        //String ret = this+" "+this.getName()+" "+this.getHeight()+" "+this.getWeight();
        String ret = //this+" "+
                name+" "+height+" "+weight;
        return ret;
    };



}
