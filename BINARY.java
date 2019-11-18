public class BINARY
{
    public static void main(String[] args) 
    {
        System.out.println(convertBinary(100));
    }
    public static String reverseString(String input)
    {
      int length = input.length();
      String reverse = "";
      for (int i = length-1 ; i >= 0 ; i--)
         reverse = reverse + input.charAt(i);
      return reverse;
    } 
    public static String convertBinary(int n) 
    {
        String binaryNumber = "";
        while (n > 0) {
            if (n % 2 == 1) {
                binaryNumber = binaryNumber + "1";
            } else if (n % 2 == 0) {
                binaryNumber = binaryNumber + "0";
            }
            n = n/2;
        }
        return reverseString(binaryNumber);
    }
}