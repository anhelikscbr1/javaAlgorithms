import java.util.Arrays;

public class arrays_01Strings {
    public static void main(String[] args) {
        String[] myArr = { "Hola", "Arios", "Nose", "Menos se", "Juan", "Laura" };
        for (String i : myArr) {
            System.out.println(i);
        }

        // ?Sort array
        System.out.println("\nSorted array: ");
        Arrays.sort(myArr);
        for (String i : myArr) {
            System.out.println(i);
        }

        // ?Sort example:
        int[] myIntArray = { 0, 2, 76, -1, 94 };
        System.out.println("\nSorted array of numbers");
        Arrays.sort(myIntArray);
        for (int i : myIntArray) {
            System.out.println(i);
        }

        String a = "a";
        String b = "a";
        System.out.println("\n" + a.compareTo(a));
    }
}
