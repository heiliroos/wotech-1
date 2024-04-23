    import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String[] names = { "Anna", "Kati", "Mari", "Riina" }; 
    System.out.println("Please write your name ");
    
    Scanner scanner = new Scanner(System.in);
    String guestName = scanner.nextLine();

    boolean isInList = false;

    for (int i = 0; i < names.length; i++) {

        if (guestName.equals(names[i])) {
        isInList = true;
        break; 
      }

    }
    if(isInList){
      System.out.println("you are invited");
    } else {
      System.out.println("you are not invited");
    }

    scanner.close();
  }
}
