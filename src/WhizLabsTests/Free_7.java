package WhizLabsTests;

public class Free_7 {

}

class Exam {
   void method() {}
}

/**
 * Below method needs to have the same return type as the method in the
 * parent class.
 * From the below keywords:
 * abstract
 * final (VALID)
 * private
 * default
 * int
 */
class OCAJP extends Exam {
   final void method() {}
}
