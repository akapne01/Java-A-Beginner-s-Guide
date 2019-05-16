package Ch5_More_Data_Types_And_Operators;

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];

        for (int i = 0; i < 10; i++) {
            sample[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("This is sample[" + i + "]: " + sample[i]);
        }
    }
}
