public class OOP_06_ex3 {

    public static void main(String[] args) {



        Person[] per = new Person[10];
        per[0] = new Person("moshe", 88,99);
        per[1] = new Person();    //"generic", 170, 70
        per[2] = new Person("j j", 1007, 2007);
         per[3] = new Person("three", 103, 53);
         per[4] = new Person("four", 103, 54);
         per[5] = new Person("five", 103, 155);
         per[6] = new Person("six", 103, 103);
         per[7] = new Person("seven", 103, 505);
         per[8] = new Person("eight", 103, 258);
         per[9] = new Person("nine", 103, 59);



// hghhhhhhhhhhhhhhhhh
        for (int i = 0; i < per.length; i++) {
            System.out.printf("\n%d: %s",i,per[i].show());
        }
        System.out.println("\n**************");

        Person[] persSorted = thin2fat(per);
        /*System.out.println(persSorted[0].show());
        System.out.println(persSorted[1].show());
        System.out.println(persSorted[2].show());*/

        System.out.println();
        for (int i = 0; i < per.length; i++) {
            System.out.printf("\n%d: %s",i,persSorted[i].show());
        }
    }

    public static Person[] thin2fat (Person[] pers){

        for (int i = 0; i < pers.length-1; i++) {

            //System.out.print(pers[i].getWeight()+" ");
            //System.out.print("\ni "+i+" ");
            //System.out.println();

            for (int j = i; j >= 0; j--) {

                //System.out.print(pers[j].getWeight()+" ");
                //System.out.print(pers[j].getWeight() +" "+ pers[j+1].getWeight()+" | ");
                if (pers[j].getWeight() > pers[j+1].getWeight()){
                    //System.out.print(" >>> ");
                    //System.out.print(pers[j].getWeight() +" "+ pers[j+1].getWeight()+" | ");

                    Person p_ = pers[j];
                    pers[j] = pers[j+1];
                    pers[j+1] = p_;
                } else {
                break;
                }
              }
        }

        return pers;
    }
    
        


}
