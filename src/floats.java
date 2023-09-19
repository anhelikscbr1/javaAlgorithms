public class floats {
    public static void main(String[] args) {
        // ? Floats
        float real = 1;
        float real2 = 1.5F;
        float real3 = 1.12e-4f; // ! e notation
        float real4 = 1.12e4f; // ! e notation
        System.out.println("Float info:");
        System.out.println("Float bytes: " + Float.BYTES);
        System.out.println("Float size in bits: " + Float.SIZE);
        System.out.println("Min val: " + Float.MIN_VALUE);
        System.out.println("Max val: " + Float.MAX_VALUE);
        System.out.println("\n");

        // ?Doubles
        double myDouble = 1;
        double myDouble1 = 1.9494e38;
        double myDouble2 = 1.0230e-6;
        double myDouble3 = 1.49;
        System.out.println("Double info:");
        System.out.println("Double bytes: " + Double.BYTES);
        System.out.println("Double size in bits: " + Double.SIZE);
        System.out.println("Min val: " + Double.MIN_VALUE);
        System.out.println("Max val: " + Double.MAX_VALUE);
        System.out.println("\n");

        // ?Var
        var pi = 3.1416;
        System.out.println(pi);
    }
}
