public class HistoryDatabase
  {
    public static HistoryEvent searchEvent(String userInput)
    {
      if(userInput.equals("300"))
      {
        return new HistoryEvent(
          "300",
          "Battle of Termopylae",
          "In 480 BC, King Leonidas of Sparta led 300 Spartans "
          + "against the Persian army at Thermopylae. Alothough "
          + "outnumbered (some estimates going to 3 to 10,000), the Spartans held the narrow pass for days, "
          + "becoming a symbol of courage, sacrifice, and resistance."
          );
      }
    return null; //not found
    }
  }
