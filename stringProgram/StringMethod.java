
import java.lang.*;

public class StringMethod {

    public static void main(String[] args) {
        String name = "Anand Raj Bind";
        System.out.printf("Your  string is : %s \n", name);
        System.out.format("Your  string is : %s \n", name);

        int value = name.length();
        System.out.println("Length of the string is : " + value);

        String lstring = name.toLowerCase();
        System.out.println("Lower case of the string is : " + lstring);

        String ustring = name.toUpperCase();
        System.out.println("Lower case of the string is : " + ustring);

        String nonTrimeString = "    Anand      ";
        String trimeString = nonTrimeString.trim();
        System.out.println(trimeString);
        System.out.println(" Trimed string is " + nonTrimeString.trim());

        // String subString = name.substring(6);
        System.out.println("SubString is : " + name.substring(1));
        System.out.println("SubString is : " + name.substring(6, 9));

        System.out.println("Replace : " + name.replace(
                'A', 'B'));

        System.out.println("Replace : " + name.replace(
                "anand", "Anurag"));

        System.out.println(name.startsWith("Anand"));// shi hoga to true return karega  nhi to false 
        System.out.println(name.endsWith("Bind"));

        System.out.println(name.charAt(6));// 6th index pe kaun sa character hai

        System.out.println(name.indexOf("an"));// a ka index kya hai

        String modifiedString = "Ananand";
// System.out.println(name);
        System.out.println(modifiedString.indexOf("an", 3));// an ka index kya hai 3rd index se start karte hue

        System.out.println(modifiedString.lastIndexOf("an"));// an ka index kya hai last se start karte hue

        System.out.println(modifiedString.lastIndexOf("an", 3));// an ka index kya hai 3rd index se start karte hue

        System.out.println(name.equals("Anand Raj Bind"));//  kya name String Anand String ke equals hai 
        System.out.println(name.equalsIgnoreCase("anand raj bind"));//  kya name String Anand String ke equals hai case sensitive ko ignore karte huye 

        System.out.print("I am \n escape \''  \" sequence\t character \\ ");

    }
}
