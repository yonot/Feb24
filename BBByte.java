public class BBByte {

    public static void main(String[] args) {

        byte x;
        for (int i = 0; i < 400; i++) {
            x = (byte) i;
            System.out.printf("%d ",x);
            if (x%30==0) {
                System.out.println();
            }

        }

    }
}
