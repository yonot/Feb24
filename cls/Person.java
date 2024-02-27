package cls;

public class Person {

    private String name;
    private int age;
    private int num;


    public Person (int age, int num) throws Exception {
        setAge(age);
        setNum(num);
    }


    // SETTERS etc.

    public void setName (String name) throws Exception {
        if (name.equals("Joe")) {
            throw new Exception("Joe sounds fake. ");
        }
        this.name = name;
    }
    public void setAge (int age) throws Exception {
        if (age<=18) {
            throw new Exception("Age must be bigger than 18. ");
        }
        this.age = age;
    }
    public void setNum (int num) throws Exception {
        if (num>100) {
            throw new Exception("Cannot be bigger than 100. ");
        }
        this.num = num;
    }


    public String toString(){
        return name+" "+age;
    }

public class NameException extends Exception {
    public NameException(){
        super("This name sucks. ");
    }
}


}
