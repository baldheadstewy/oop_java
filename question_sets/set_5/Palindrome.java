class Palindrome {
    public static void main(String[] args) {
        String data = "121";
        boolean is_palindrome = true;
        for (int i = 0; i < (data.length() / 2); i++) {
            if (data.charAt(i) != data.charAt(data.length() - i - 1)) {
                is_palindrome = false;
                break;
            }
        }
        if (is_palindrome) {
            System.out.println(data + " is palindrome.");
        }
        else {
            System.out.println(data + " is not palindrome.");
        }
    }
}