import java.util.Scanner;

public class AgeGroup {
  public static void main(String[] args) {
    System.out.println("Koliko godina imate?");
    Scanner sc = new Scanner(System.in);
    int personAge = sc.nextInt();

    System.out.println("Uneli ste:" + personAge);

    //0-2 -> beba
        //3-12 -> dete
        //13-17 -> tenejdzer
        //18+ -> odrasli
        if (personAge <= 2) { 
          System.out.println("Ti si beba");
      } else if (personAge <= 12) {
           System.out.println("Ti si dete");
      } else if (personAge <= 17) {
           System.out.println("Ti si tenejdzer");
      } else {
          System.out.println("Vi ste odrasli");
      }

  }
}
