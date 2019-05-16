/*
    p. 164
    Use String to control the switch statement
 */

package Ch5_More_Data_Types_And_Operators;

public class StringSwitch {
    public static void main(String[] args) {

        String command = "cancel";

        switch(command) {
            case "connect" :
                System.out.println("Connecting");
                break;
            case "cancel" :
                System.out.println("Cancelling");
                break;
            case "disconnect" :
                System.out.println("Disconnecting");
                break;
            default :
                System.out.println("Command error!");
                break;



        }
    }
}
