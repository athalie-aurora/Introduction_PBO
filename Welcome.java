/**
 * 2A_221511003_Athalie Aurora Puspanegara
 * 
 * Ini program yang menyambut pembaca
 * @version 1
 * @author Athalie Aurora Puspanegara
 * 
 */

public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i=0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();

    }
}