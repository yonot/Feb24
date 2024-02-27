import java.util.Scanner;



public class Kollatz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*while (true){
            String y = scanner.next();
            if (y.equals("t")){
                System.out.println("!!!");
            }
            break;
        }*/

        Kol K1 = new Kol();

        K1.start = 12;

        Kol[] Ko = new Kol[5];
        System.out.println("Please enter an integer.");

        int num = scanner.nextInt();




        K1.start = num;
        int count = 0;
        while (num>1) {
            count++;
            System.out.printf("%d ",num);
            num = getNext(num);

        }
        System.out.println(" "+num);
        System.out.printf("It took %d steps.",count);
        K1.steps = count;
        scanner.close();
    }

    public static int getNext (int num){

        int nextNum = (num%2==00)? num/2 : num*3+1;
        return nextNum;
    }

}
