import java.util.Scanner;

public class ElevatorTest
{
  public static void main(String[] args)
  {
    System.out.println("Negative capacity will be switched to positive.");
    System.out.println("Enter starting floor and capacity of elevator:");
    Scanner input = new Scanner(System.in);
    Elevator lift = new Elevator(input.nextInt(), input.nextInt());
    boolean isRunning = true;
    while(isRunning)
    {
      int option;
      System.out.print("\n\nPress 0 to exit program. \nPress 1 for enter person options. \nPress 2 for exit person options. \nPress 3 to move to another floor. \nOption: ");
      option = input.nextInt();

      switch (option)
      {
        default:
          System.out.println("Invalid input.");
          break;
        case 0:
          System.out.println("Goodbye!");
          isRunning = false;
          break;
        case 1:
          System.out.println("\n\nPress 0 to go back.\nPress 1 to add average person.\nPress 2 to add person with specific weight. ");
          int enterOption = input.nextInt();
          switch (enterOption)
          {
            default:
              System.out.println("Invalid input, going to main menu.");
              break;
            case 0:
              break;
            case 1:
              System.out.println("Person added, weight = 75kg");
              lift.personEnter();
              break;
            case 2:
              System.out.print("Enter weight: ");
              int personWeight = input.nextInt();
              lift.personEnter(personWeight);
              System.out.println("Person added, weight = " + personWeight + "kg");
              break;
          }
          break;
        case 2:
          System.out.println("\n\nPress 0 to go back.\nPress 1 to remove average person.\nPress 2 to add remove with specific weight. ");
          int exitOption = input.nextInt();
          switch (exitOption)
          {
            default:
              System.out.println("Invalid input, going to main menu.");
              break;
            case 0:
              break;
            case 1:
              System.out.println("Person exited, weight removed = 75kg");
              lift.personExit();
              break;
            case 2:
              System.out.print("Enter weight: ");
              int personWeight = input.nextInt();
              lift.personExit(personWeight);
              System.out.println("Person exited, weight removed = " + personWeight + "kg");
              break;
          }
          break;
        case 3:
          System.out.print("Enter floor: ");
          int newFloor = input.nextInt();
          if(!lift.moveToFloor(newFloor))
            System.out.println("Elevator capacity exceeded!");
      }

      System.out.println(lift);
    }
  }
}
