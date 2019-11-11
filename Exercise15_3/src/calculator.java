import java.util.*;

public class calculator {

    public static int getIndexOf(int[] array, int number) throws Exception {
        for(int i = 0; i < array.length; i++)
            if (array[i] == number)
                return i;
            throw new Exception("This element is not part of the array");
    }

    public static int pickNumber(int[] array, Scanner input){
        boolean valid;
        int x = 0;
        do {
            valid = true;
            try {
                x = array[getIndexOf(array, input.nextInt())];
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again");
                valid = false;
                input.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds, try again");
                valid = false;
            } catch (NullPointerException e) {
                System.out.println("Element is null, try again");
                valid = false;
            } catch (Exception e){
                System.out.println("Element not in array, try again");
                valid = false;
            }
        } while (!valid);
        return x;
    }

    public static void main(String[] args) {
        System.out.println("How many numbers do you want to input?: ");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        int[] array = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            boolean valid;
            do {
                valid = true;
                try {
                    array[i] = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, try again");
                    valid = false;
                    input.nextLine();
                }
            } while (!valid);
        }

        for (int x : array)
            System.out.print(x + " ");

        System.out.println("\nSelect two of the numbers\nNumber 1 (index): ");
        int a, b;
        a = pickNumber(array, input);
        System.out.println("Number 2 (index): ");
        b = pickNumber(array, input);

        String option;
        ArrayList<String> options = new ArrayList<String>();
        Collections.addAll(options, "ADD", "SUBTRACT", "MULTIPLY", "DIVISION");
        System.out.println("Choose operation: ADD, SUBTRACT, MULTIPLY, DIVISION");
        boolean valid;
        do {
            valid = true;
            option = input.nextLine();
            if(!options.contains(option)) {
                valid = false;
                System.out.println("Operation not defined try again");
            }
        } while (!valid);

        switch (option) {
            case "ADD":
                System.out.println(a+b);
                break;
            case "SUBTRACT":
                System.out.println(a-b);
                break;
            case "MULTIPLY":
                System.out.println(a*b);
                break;
            case "DIVISION":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Somehow you managed to crash it, congrats");
        }
    }
}
