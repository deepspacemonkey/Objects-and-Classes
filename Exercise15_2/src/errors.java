import java.util.Scanner;

public class errors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String endWord = "end";

        String data;

        boolean go = true;

        do {
            data = input.nextLine();
            if (data.equals(endWord))
                go = false;
            if (go) {
                try {
                    sum += Integer.parseInt(data);
                } catch (NumberFormatException e) {
                    System.out.println("Input is not a number, try again");
                }
            }
        } while (go);

        System.out.println(sum);
    }
}
