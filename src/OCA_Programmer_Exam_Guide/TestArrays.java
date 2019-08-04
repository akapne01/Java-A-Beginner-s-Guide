package OCA_Programmer_Exam_Guide;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TestArrays {

    static int i = 5;
    int j = 7;
    public static void main(String[] args) {
        int[] [] a = {{1,2}, {2,3}};
        int[] b = (int[]) a[1];
        int[] c = (int[]) b;

        ArrayList<Object> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add(1, "c");

        DateTimeFormatter f;


    }


    public void testing() {
        System.out.println(i+j);
    }


    public interface A {}
}
