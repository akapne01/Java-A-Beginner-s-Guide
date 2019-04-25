/*
    p. 93
    Another example that uses break with label
 */

package Ch3_Program_Control_Statements;

public class BreakWithLabelAnotherExample {
    public static void main(String[] args) {

        done: // this label applies to outer loop for i
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done; // jump to done
                } // for - k

                System.out.println("After k loop"); // won't execute
            } // for - j

            System.out.println("After j loop"); // won't execute
        } // for - i

        System.out.println("After i loop");
    } // main
} // class
