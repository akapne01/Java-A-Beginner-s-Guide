/*
 * p. 183
 * Ch 5 Self test (7)
 * Expand Encode cipher class, modify so that it uses
 * 8-char string as the key
 */
package Ch5_More_Data_Types_And_Operators;

public class EncodeSelfTest {

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

        public static void main(String[] args) {
            String msg = "This is a test Javaaaaa is so cool";
            String encmsg = "";
            String decmsg = "";
            String str_key = "abcdefgh";
            int key = 0;
            for (int i = 0; i < str_key.length(); i++) {
                key += str_key.charAt(i);
            }
            System.out.println(key);
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
