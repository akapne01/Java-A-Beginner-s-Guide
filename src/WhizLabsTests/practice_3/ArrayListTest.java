package WhizLabsTests.practice_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

   public static void main(String[] args) {
      ArrayList myList = new ArrayList();

      ArrayList<Integer> list2 = new ArrayList<>();
      List list3 = new ArrayList<>();
      List<String> list4 = new ArrayList<>();

      List<String> pets = new ArrayList<>();
      pets.add("dog");
      System.out.println(pets);
      pets.add(0, "cat");
      System.out.println(pets);
      pets.add(1, "parrot");
      System.out.println(pets);

   }

}
