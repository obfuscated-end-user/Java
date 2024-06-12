public class LoopingProgram {
    public static void main (String[] args) {

        /*
        while loop:
        
        while (boolean value) {
            your crap here;
            something that updates the condition, because you don't want infinite loops;
        }

        do-while
        do {
            your crap here, will be executed at least once;
        } while (boolean value);
        */

        // this bit here approximates the value of pi\
        /*
            pi = 4/(2i+1) +/- 4/(2i+1) this is wrong
            when i = 0, this becomes 4
            when i = 1, this becomes 4/3
            when i = 2, this becomes 4/5
            and so on
        */
        double customPi = 4.0;
        double seed = 3.0;
        while (seed < 20000) {
            customPi = customPi - (4/seed) + (4/(seed + 2));
            seed += 4;
            // System.out.println(customPi);
        }
        // System.out.println(Math.PI);

        /*
        for loop
        for (int variable; condition; update variable) {
            do something;
        }
        */
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // for loop using two variables
        for (int i = 0, j = 0; i < 10; i++, j+=2) {
            System.out.println(i + "\t" + j);
        }
/*         int i = 0;
        while (i <= 20){
            System.out.println(i);
            if ((i % 2) == 0){
                i+=2;
                continue;
            }
        } */
    }
}
