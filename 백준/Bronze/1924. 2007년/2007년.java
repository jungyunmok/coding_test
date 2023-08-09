import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int month = scan.nextInt();
    int day = scan.nextInt();
    for(int i=1; i<month; i++) {
      if(i == 1 || i == 3 ||i == 5 ||i == 7 ||i == 8 ||i == 10 ||i == 12) {
        day += 31;
      } else if(i == 2) {
        day += 28;
      } else {
        day += 30;
      }
    }
    switch(day%7) {
      case 1 : System.out.println("MON");
      break;
      case 2 : System.out.println("TUE");
      break;
      case 3 : System.out.println("WED");
      break;
      case 4 : System.out.println("THU");
      break;
      case 5 : System.out.println("FRI");
      break;
      case 6 : System.out.println("SAT");
      break;
      default : System.out.println("SUN");
      break;
    }
  }
}