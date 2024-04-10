// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj długość boku: ");
    int bok = scanner.nextInt();

      for(int i=0; i<bok; i++) {
      for(int j = 0; j<bok; j++) {
        if(i==0 || j==0 || i==bok-1 || j==bok-1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

      
  }

  
}