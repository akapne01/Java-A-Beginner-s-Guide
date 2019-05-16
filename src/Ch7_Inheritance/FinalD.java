package Ch7_Inheritance;

/*
 * p. 268
 * Using fina with Data Members
 */

class ErrorMsg {
    // Error codes
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-bounds",
    };

    // Return the error message
    String getErrorMessage(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code!";
    }
}


public class FinalD {
    public static void main(String[] args) {

        ErrorMsg errorMsg = new ErrorMsg();

        System.out.println(errorMsg.getErrorMessage(errorMsg.OUTERR));
        System.out.println(errorMsg.getErrorMessage(errorMsg.DISKERR));
    }
}
