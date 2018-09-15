import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        System.out.println("Number of zeros in " + num + " factorial are " + findZeros(num));
    }
    // number of zeros in N! = (N/5) + (N/25) + (N/125) + (N/625) + ....
    private static int findZeros(int num){
        int numZeros = 0;
        while (num != 0) {
            numZeros += num / 5;
            num /= 5;
        }
        return numZeros;
    }
}
