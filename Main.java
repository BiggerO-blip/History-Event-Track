import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

      System.out.printn("=== History Search ===");
      System.out.print("Enter a historical event keyword: ";

      String input = scanner.nextLine();

      HistoryEvent event = HistoryDatabase.searchEvent(input);

      if (event == null)
      {
        System.out.println("Event not found.");
      }
      else
      {
        System.out.println("\n" + event.getTitle());
        System.out.println(event.getDescription());
      }
      scanner.close()
        }
  }
