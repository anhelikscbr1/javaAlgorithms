public class arrays_02Example {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        short aux = 0;
        for (short i = aux; i < arr.length / 2; i++) {
            System.out.println(arr[i] + "\t" + arr[arr.length - 1 - i]);
        }
    }
}
