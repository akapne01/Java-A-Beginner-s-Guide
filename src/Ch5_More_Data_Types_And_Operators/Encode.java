/*
    p. 175
    Demonstrates bitwise XOR
    Applying XOR 2x results to the same value as original value
    This can be used to encode and decode message.
    This code is easy to break

    Output:
    Original message: This is a test
    Encoded message: 01+x1+x9x,=+,
    Decoded message: This is a test

 */

package Ch5_More_Data_Types_And_Operators;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        for (int i = 0; i < msg.length(); i++)
            encmsg += (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        for (int i = 0; i < msg.length(); i++)
            decmsg += (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
