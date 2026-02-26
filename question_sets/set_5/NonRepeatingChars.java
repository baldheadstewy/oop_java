public class NonRepeatingChars {
    public static void main(String[] args) {
        String str = "programming";
        String non_repeating_char = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }

            if (count == 1)
                non_repeating_char += str.charAt(i);
        }
        System.out.println("Data: " + str);
        System.out.println("Non Repeating Char: " + non_repeating_char);
    }
}