public class RemoveChar {
    public static void main(String[] args) {
        String str = "programming";
        char remove = 'g';
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove)
                result += str.charAt(i);
        }

        System.out.println("Result: " + result);
    }
}