public class ReplaceSpace {
    public static void main(String[] args) {
        String str = "abababbaabbaababa";
        String replace_char = "a";
        String replace_with = "b";
        String result = str.replace(replace_char, replace_with);
        System.out.println(result);
    }
}