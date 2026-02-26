class StringReverse {
    public static void main(String[] args) {
        String data = "Hello World";
        String reverse_data = "";
        for (int i = 0; i < data.length(); i++) {
            reverse_data += data.charAt(data.length() - i - 1);
        }
        System.out.println("Data: " + data);
        System.out.println("Reverse: " + reverse_data);
    }
}