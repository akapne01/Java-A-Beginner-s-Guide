package practice_tests.ch3_operators_decision_contructs;

// p. 34. 3-4

public class ThePlan {
    public static void main(String[] args) {
        int plan = 1;
        /**
         * If (plan = plan++) =>  then plan is 1 and ++ is lost
         * If (plan = plan --) => plan is 1 and -- is lost
         * If (plan = ++plan) => plan is 2
         * If (plan = --plan) => plan is 0;
         */
        plan = plan++ - --plan; // plan becomes 1 - (2-1) => 0

        System.out.println(plan++ == plan--); // prints out false
        System.out.println(plan);
//        System.out.println("plan++ " + plan++); // returns and increments
//        System.out.println("--plan " + --plan); // decrements and then returns
        if (plan == 1) {
            System.out.println("Plan A");
        } else {
            if (plan == 2) System.out.println("Plan B");
//        } else System.out.println("Plan C"); xNC because if statement above didn't have {}
        }

    }
}
