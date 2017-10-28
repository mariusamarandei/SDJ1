
public class PriorityNote
{
   public String note;
   public boolean highPriority;

   public PriorityNote(String note)
   {
      this.note = note;
   }

   public String getNote()
   {
      return note;
   }

   public void setNote(String note)
   {
      this.note = note;
   }

   public boolean isHighPriority()
   {
      return highPriority;
   }

   public void setHighPriority(String note)
   {
      highPriority = true;
   }

   public void setLowPriority(String note)
   {
      highPriority = false;
   }

   public PriorityNote copy()
   {
      PriorityNote copy = new PriorityNote(note);
      if (highPriority)
      {
         copy.setHighPriority(note);
      }
      return copy;
   }

   public String toString()
   {
      String s = note;
      if (highPriority)
         s += " (high priority)";
      return s;
   }

}
