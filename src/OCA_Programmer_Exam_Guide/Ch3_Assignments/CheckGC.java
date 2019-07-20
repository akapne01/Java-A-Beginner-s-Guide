package OCA_Programmer_Exam_Guide.Ch3_Assignments;

// p. 217

import java.util.Date;

public class CheckGC {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory:              " + rt.totalMemory());
        System.out.println("Before Memory (free memory) =  " + rt.freeMemory());
        Date d = null;
        for (int i = 0; i < 10_000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("After Memory left =            " + rt.freeMemory());
        rt.gc(); // An alternate to System.gc()
        System.out.println("After GC Memory =              " + rt.freeMemory());

        Object a;
    }
}
