import cls.Person;

import java.util.Scanner;

public class TestExceptions {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int age=100;
        String name;
        Person person;

        while (true) {
            System.out.println("Please enter age. ");
            age = sca.nextInt();
            if (age==0) break;
            System.out.println("Please enter name. ");
            name = sca.nextLine();

            try {
                person = new Person(age,50);
                /*person.setAge(age);*/
                person.setName(name);
                System.out.println(">>>" + person);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }
    }

}
