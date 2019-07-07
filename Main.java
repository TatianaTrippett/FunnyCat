import java.util.Scanner;
 
public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Введите число:");
      int a = scan.nextInt();
      scan.close();
      switch (a) {
      case 1:
         System.out.println("Один");
         break;
      case 2:
         System.out.println("Два");
         break;
      case 3:
         System.out.println("Три");
         break;
      case 4:
         System.out.println("Четыре");
         break;
      case 5:
         System.out.println("Пять");
         break;
      default:
         System.out.println("Неверное число");
      }
   }
}
