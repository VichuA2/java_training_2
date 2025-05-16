import java.util.Scanner;

public class String1 {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        System.out.println("Length: "+s1.length());
        System.out.println("CharAt(0): "+s1.charAt(0));
        System.out.println("Index(e): "+s1.indexOf('e'));
        System.out.println("LastIndexOf: "+s1.lastIndexOf('l'));
        System.out.println("Uppercase: "+s1.toUpperCase());
        System.out.println("Lowercase: "+s1.toLowerCase());
        System.out.println("Empty: "+s1.isEmpty());
        System.out.println("SubString: "+s1.substring(0,2));
        System.out.println("StartsWith: "+s1.startsWith("h"));
        System.out.println("EndsWith: "+s1.endsWith("o"));
        System.out.println("Contains: "+s1.contains("llo"));
        System.out.println("Equals: "+s1.equals("hello"));
        System.out.println("EqualsIgnore: "+s1.equalsIgnoreCase("HELLO"));
        System.out.println("Compare: "+s1.compareTo(s2));
        System.out.println("Replace: "+s1.replace(s1,s2));
        System.out.println("Trim: "+s1.trim());
        System.out.println("split: "+s1.split(" "));
        System.out.println("Concat: "+s1.concat(" hi"));
        System.out.println("ReplaceAll: "+s1.replaceAll(s1,s2));


    }
}
        
