
public class Break_and_continue_loops {

    public static void main(String[] args) {
        // Break and continue loops
        /*   for (int i = 0; i < 5; i++) {

            System.out.println(i);
            System.out.println("Java is great!");
            if (i == 2) {
                System.out.println("Ending the loop!");
                break;
            }
        }*/
 /* int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Java is great!");
            if (i == 2) {
                System.out.println("Ending the loop!");
                break;
            }
            i++;
        }
        System.out.println("Loop ends here!");  */


 /*   int i = 0;
        do {
            System.out.println(i);
            System.out.println("Java is great!");
            if (i == 2) {
                System.out.println("Ending the loop!");
                break;
            }
            i++;
        } while (i < 5);
        System.out.println("Loop ends here!"); */
        // continue

        /* 
        for (int i = 0; i < 50; i++) {
            if (i == 2) {
                System.out.println("Ending the loop!");
                continue;
            }

            System.out.println(i);
            System.out.println("Java is great!");

        } */
        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop!");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great!");

        } while (i < 5);
        System.out.println("Loop ends here!");

    }

}
