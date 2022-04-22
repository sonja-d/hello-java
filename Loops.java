import javax.annotation.processing.SupportedOptions;

/**
 * Loops
 */
public class Loops {

  public static void main(String[] args){
    int i = 5;
    while (i < 10) {
      System.out.println("Vrednost broja i je: " + i); 
      i = i + 1;
    }

    int j = 2;
    while (j >= -4) {
        System.out.println("Vrednost broja j je: " + j);
        j = j - 1;
    }
  
  int k = 100;
  while (k < 100) {
      System.out.println("K: " + k);
      k = k + 1;
    }

  do {
      System.out.println("K: " + k);
      k = k + 1;
    } while (k<100);

  for (int t = 15; t < 20; t++) {
    System.out.print("t:"+t);
    System.out.println();
  }
  for (int g = 0; g <= 10; g++) {
    for (int l = 0; l < g; l++) {
       System.out.print("*");
    }
    System.out.println();
  }
  for (int g = 1; g <= 10; g++) {
    for (int l = 1; l <= 10; l++) {
       System.out.print("(" + g + "," + l + ")" + "   ");
    }
    System.out.println();
  }
}
}