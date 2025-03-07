/*
    p. 197
    Return a programmer defined object
 */
package Ch6_Methods_Classes_Closer_Look;

class Err {
    String msg; // error message
    int severity; // code indicating severity of error

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index-Out-Of-Bounds"
    };
    int howbad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i<msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Invalid Error Code ", 0);
    }
}

public class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println((e.msg + " severity " + e.severity));

        e = err.getErrorInfo(19);
        System.out.println((e.msg + " severity " + e.severity));
    }
}
