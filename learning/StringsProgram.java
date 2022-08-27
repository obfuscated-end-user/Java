// ignore the retarded syntax error. the package import only fucks up this program and does not help.

import java.util.*;
public class StringsProgram {
    public static void main(String[] args)  {

        // this is casting
        for (int i = 0; i < 10; i++) {
            int something = (int) (Math.random() * 100);
            System.out.print(something + " ");
            if (something > 50) {
                System.out.print(" ape sex ");
            }
        }
    }
}
