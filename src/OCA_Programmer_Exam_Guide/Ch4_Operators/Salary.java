package OCA_Programmer_Exam_Guide.Ch4_Operators;

/**
 * p. 250
 * Conditional or Ternary Operator
 * x = (bool expr) ? true : false
 */
public class Salary {
    public static void main(String[] args) {
        int numOfPets = 3;
        String status = (numOfPets < 4) ? "Pet limit not exceeded" : "Too many pets";
        System.out.println("Your pet status is " + status);
    }
}
