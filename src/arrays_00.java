public class arrays_00 {
    public static void main(String[] args) {
        // ? First way of declaration
        int[] myArr = { 1, 2, 3 };
        System.out.println("First array: ");
        for (int arr : myArr) {
            System.out.println(arr);
        }

        // ? Second way of declaration
        System.out.println("\nSecond array: ");
        int[] myArr2 = new int[3];
        myArr2[0] = Integer.valueOf(0);
        myArr2[1] = (int) 1.0f;
        myArr2[2] = 2;
        for (short i = 0; i < myArr2.length; i++) {
            System.out.println(myArr2[i]);
        }
    }
}
