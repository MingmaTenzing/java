public class loops {
    public static void main(String[] args) {

        // int i = 1; 
        // while(i<10) {

        //     System.out.println("hello");
        //     i++;
        // }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        // for (int i = 5; i > 0; i--) {
        //     System.out.println(i);
        // }

        //nested 
        // for (int i = 0; i < 2; i++) {
        //     System.out.println("i'm outer loop" + " " + i);
        //     for (int j = 0; j <= 3; j++) {
        //     System.out.println("i'm inner loop " + " " + j + " " + "with inner loop" + " " + i);
        // }

        // }


        for (int i = 0; i <=10; i++) {

            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
    }



}
