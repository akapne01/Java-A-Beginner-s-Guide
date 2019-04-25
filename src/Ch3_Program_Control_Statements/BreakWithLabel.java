/*
    p.92 - BG
    Break with Label
    For loop contains 3 labels: one - two - three;
    break one: prints after 1 and goes to next iteration
    break two: prints after 2 and after 1 and then goes to the next iteration
    break three : prints after 3, after 2, after 1 and then end loop
    Then after FOR is printed.
 */

package Ch3_Program_Control_Statements;

public class BreakWithLabel {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        // this is never reached
                        System.out.println("won't print");


                    } // three

                    System.out.println("After block three");

                } // two

                System.out.println("After block two");
            } // one

            System.out.println("After block one");
        } // for

        System.out.println("After for");
    } // main
} // class
