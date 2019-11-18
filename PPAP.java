import java.util.Scanner;
public class PPAP 
{
    public static void main(String[] args)
    {
        System.out.println(PPAPMethod("I have a pen, I have a apple"));
        System.out.println(PPAPMethod("I have a shoe, I have a shoelace"));
    }
    public static String PPAPMethod(String input)
    {
       String returnPPAP = "", firstWord = "", secondWord = "";
       String[] phrases = input.split(",", 2);
       firstWord = phrases[0].substring(9);
       secondWord = phrases[1].substring(10);
       returnPPAP = "Uh! " + secondWord + firstWord;
       return returnPPAP;
    }
}