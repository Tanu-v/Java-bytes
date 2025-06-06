
public class Varargs {

    // static int sum(int a, int b) {
    //     return a + b;
    // }
    // static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    // static int sum(int a, int b, int c, int d) {
    //     return a + b + c + d;
    // }
    // Varargs
    // static int sum(int... arr) {
    static int sum(int x, int... arr) {  // at least 1 integer requires
        // Available as int[] arr;
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs!");
        // System.out.println("The sum of nothing is :" + sum()); // provide error with (int x,int ...arr)
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4 and 5 and 6 is :" + sum(4, 5, 6));
        System.out.println("The sum of 4 , 5 , 6 and 7 is: " + sum(4, 5, 6, 7));
    }

}
