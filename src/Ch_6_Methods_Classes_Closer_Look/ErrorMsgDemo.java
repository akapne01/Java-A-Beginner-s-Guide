/*
    p. 196
    Methods can return objects

    Output:
    Disk Full
    Invalid Error Code
 */

package Ch_6_Methods_Classes_Closer_Look;

class ErrorMsg{
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    // Return the error message
    String getError(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}

public class ErrorMsgDemo {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getError(2));
        System.out.println(err.getError(19));
    }
}
