public class CountCharType {
    public static void main(String[] args) {
        String str = "Hello123@#";
        int alphabets = 0, digits = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch))
                alphabets++;
            else if (Character.isDigit(ch))
                digits++;
            else
                special++;
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}