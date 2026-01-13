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
      else if(userInput.equals("9/11"))
      {
          return new HistoryEvemt(
            "On September 11, 2001, 19 terrorists associated with "
            + "the extremist group al-Qaeda hijacked four commercial "
            + "airplanes and carried out coordinated suicide attacks "
            + "against targets in the United States, the deadliest terrorist "
            + "attacks on American soil in history."
            );
      }
    return null; //not found
    }
  }
