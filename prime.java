import java.util.Scanner;
public class prime {

    public static void main(String[] args) {
      // Input number
      
      System.out.println("enter the number");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();


  
      // Holds the count of values
      int count = 0;
  
      // There is no prime number less than 2.
      if (n <= 1) {
        System.out.println("The number is not prime");
        return;
      }
  
      // Do a for loop
      for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0) {
          count++;
        }
      }
  
      // If the number of factors is greater than 1,
      // the number is not prime.
      if (count > 1) {
          System.out.println("The number is not prime");
      }
      else {
        System.out.println("The number is prime");
      }
    }
  }
  
  