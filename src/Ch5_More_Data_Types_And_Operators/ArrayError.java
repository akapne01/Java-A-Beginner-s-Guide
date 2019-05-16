package Ch5_More_Data_Types_And_Operators;

public class ArrayError {
    public static void main(String[] args) {
        int sample[] = new int[10];
        
        // generate array overrun exception
        for (int i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
