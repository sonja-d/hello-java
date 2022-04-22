import java.util.Scanner;

public class WeekDays1 {
  public static void main(String[] args) {
    System.out.println("Enter day number: ");
    Scanner myObj = new Scanner(System.in);
    int dayNumber;
    
    dayNumber = myObj.nextInt();

    if (dayNumber == 1) {
      System.out.println("It is Monday");
    } else if (dayNumber == 2) {
      System.out.println("It is Tuesday");
    } else if (dayNumber == 3) {
      System.out.println("It is Wednesday");
    } else if (dayNumber == 4) {
      System.out.println("It is Thursday");
    } else if (dayNumber == 5) {
      System.out.println("It is Friday");
    } else if (dayNumber == 6) {
      System.out.println("It is Saturday");
    } else if (dayNumber == 7) {
      System.out.println("It is Sunday");
    } else {
      System.out.println("Number must be from 1-7");
  }
}
}
