// https://techstudy.org/java/Write-a-Java-program-to-display-the-system-time

public class SystemTime {
    public static void main(String[] args){
        System.out.format("\nCurrent Date time of Your system is: %tc%n\n", System.currentTimeMillis());
    }
}
