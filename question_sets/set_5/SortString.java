import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "programming";
        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        System.out.println("Ascending: " + new String(arr));

        System.out.print("Descending: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }
}