import java.util.Scanner;

public class WeekDays2 {
  public static void main(String[] args) {
    System.out.print("Enter day number: ");
    Scanner myDay = new Scanner(System.in);
    int myNumber;

    myNumber = myDay.nextInt();

    switch (myNumber) {
        case 1: 
            System.out.println("It's Monday");
            break;
        case 2:
            System.out.println("It's Tuesday");
            break;
        case 3:
            System.out.println("It's Wednesday");
            break;
        case 4:
            System.out.println("It's Thursday");
            break;
        case 5:
            System.out.println("It's Friday");
            break;
        case 6:
            System.out.println("It's Saturday");
            break;
        case 7:
            System.out.println("It's Sunday");
            break;
        default:
            System.out.println("Number of Weekdays are between 1-7");
      }

    }

  }
