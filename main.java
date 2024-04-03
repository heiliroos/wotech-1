

public class Main {
  public static void main(String[] args) {

    // +5, wear super warm, +5 to 15 warm, 15 to 30 normal, 30+ cooling


      double temperature = 17;

      if (temperature <= 5) {
        System.out.println("Wear super warm!");
      }
      else if (temperature <= 15) {
        System.out.println("Warm!");
      }
      else if (temperature <= 30) {
        System.out.println("Wear a swimming suite!");
      }
    
      else  {
        System.out.println("You need cooling");
      }
    }
  }

 
