public class Kish {

    public static void main(String[] args) {

        String s1 = "QWERTY";
        System.out.println(s1);
        //print(s);
        String s2 = "QWERTY";
        String s3 = s1;



        int[] a = new int[3];
        a[0] = 100;
        int[] b = {100,7,0};
        int[] c = a;
        c[1] = 7;
        System.out.print("a: "); print(a);
        System.out.print("b: "); print(b);
        System.out.print("c: "); print(c);
        System.out.println();


        System.out.println(a==b ? "a=b" : "a!=b");
        System.out.println(a==c ? "a=c" : "a!=c");

        System.out.println(a.equals(b)? "a.equals(b)" : "a does not equals(b)");
        System.out.println(a.equals(c)? "a.equals(c)" : "a does not equals(c)");


    }

    public static void print (int[] a){

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void print (String a){

        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i)+" ");
        }
        System.out.println();
    }


}
