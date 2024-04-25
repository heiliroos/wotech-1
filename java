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


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //Creating scanner
    Scanner scanner = new Scanner(System.in);

    //Calling method for getting title
    String title = getTitle();

    //Calling method to get description
    String description = getDescription();

    //Calling method to get printout with lines
    getPrintout(title, description);

    //Closing scanner
    scanner.close();
  }

  // Method to ask user for title
  public static String getTitle() {

    Scanner scanner = new Scanner(System.in);
    // Ask for title
    System.out.print("Enter a title: ");

    //Read title
    String title = scanner.nextLine();

    //Return title
    return title;
  }

  // Method to ask user for description
  public static String getDescription() {

    Scanner scanner = new Scanner(System.in);
    // Ask for descript
    System.out.print("Enter a description: ");

    //Read descript
    String description = scanner.nextLine();

    //Return descript
    return description;
  }

    // Method to display the result with the title wrapped in = characters + description

  public static void getPrintout(String title, String description) {

    // Calc length
    int length = title.length();
    // Create top border
    for (int i = 0; i < (length); i++) {
      System.out.print("=");
    }
    System.out.println("");
    // Display the title
    System.out.print(title);

    System.out.println("");
    // Create bottom border
    for (int i = 0; i < (length); i++) {
      System.out.print("=");
    }
    System.out.println("");

    // Display the description
    System.out.println("");
    System.out.println(description);

  }
}
