public class PALINDROME
{
    public static void main(String[] args) 
    {
        System.out.println(PALINDROMEMethod("anna"));
    }
    public static String reverseString(String input)
    {
      int length = input.length();
      String reverse = "";
      for (int i = length - 1 ; i >= 0 ; i--)
         reverse = reverse + input.charAt(i);
      return reverse;
    } 
    public static String PALINDROMEMethod(String input)
    {
        String s = input.toLowerCase();
        s = s.replace(" ", "");
        s = s.replace(",", "");
        s = s.replace("?", "");
        s = s.replace(".", "");
        s = s.replace(";", "");
        int middleChar = s.length()/2;
        if (s.length() % 2 == 1 && s.substring(0, middleChar).equals(reverseString(s.substring(middleChar+1)))) {
            System.out.println("This string is a palindrome.");
        } else if (s.length() % 2 == 0 && s.substring(0, middleChar).equals(reverseString(s.substring(middleChar)))) {
            System.out.println("This String is a palindrome.");
        }
        else System.out.println("This string is not a palindrome.");
        return null;
    }
}