import java.util.InputMismatchException;
import java.util.Scanner;

public class errors {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            boolean valid;
            do{
                valid = true;
                try {
                    array[i] = input.nextInt();
                    if(array[i] < 10 || array[i] > 99){
                        System.out.println("The input is not an integer in the range 10-99, try again");
                        valid = false;
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("The input is not an integer in the range 10-99, try again");
                    input.nextLine();
                    valid = false;
                }
            } while (!valid);
        }

        System.out.println("Program succesfully finished");
    }
}
