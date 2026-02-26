public class DeleteVowels {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if ("aeiouAEIOU".indexOf(str.charAt(i)) == -1)
                result += str.charAt(i);
        }

        System.out.println("Result: " + result);
    }
}