public class CountVowelConsonant {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}