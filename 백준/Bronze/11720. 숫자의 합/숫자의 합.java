import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String number = scan.next();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += Integer.parseInt(number.substring(i, i+1));
    }
    System.out.println(sum);
  }
}