public class PigLatin
{
   public static void main(String[] args)
   {
       System.out.println(pigLatin("league of legends"));
   }
   public static String pigLatin(String input) 
   {
    String[] output = input.split(" ");
    String finalOutput = "";
    for (int i = 0; i < output.length; i++) {
      if (output[i].length() >= 3) {
      output[i] = "" + output[i].substring(1) + output[i].charAt(0) + "ay";
    }
      else if (output[i].length() <= 2) {
      output[i] = "" + output[i];
    }
      finalOutput = finalOutput + " " + output[i];
    }
    return finalOutput;
   }
}