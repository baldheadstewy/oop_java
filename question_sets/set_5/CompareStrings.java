public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        if (str1.equals(str2))
            System.out.println("Strings are equal");
        else if (str1.equalsIgnoreCase(str2))
            System.out.println("Equal ignoring case");
        else
            System.out.println("Not equal");
    }
}