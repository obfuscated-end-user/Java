import javax.swing.JOptionPane;

public class Reverse {
    public static void main(String args[]){
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
        int reversedNumber = reverse(number);
        JOptionPane.showMessageDialog(null, "You entered: " + number + "\nReversed: " + reversedNumber, "Output", JOptionPane.INFORMATION_MESSAGE);
    }

public static int reverse(int n) {
        // reversed number
        int nReversed = 0;
        // check if n has any more digits left
        while (n > 0) {
            // nReversed is multiplied by 10 to make room for the last digit in n
            // n % 10 is equal to the last digit of n
            nReversed = nReversed * 10 + n % 10;
            // divide n by 10 to remove the rightmost number
            n /= 10;
        }
        return nReversed;
    }
}

/*
    ewan ko tangina kung anong ui daw gago
    pero ito ipasa mo kung gusto talaga sa main() tatawagin yung reverse()

    don kasi sa isa, hindi mo lang pwede basta basta na ilipat yung code ng mga button don sa main
*/