public class App {
    public static void main(String[] args) throws Exception {
        // ? bytes:
        byte myByte = 0;
        System.out.println("Byte info:");
        System.out.println("Bytes bytes: " + Byte.BYTES);
        System.out.println("Byte size in bits: " + Byte.SIZE);
        System.out.println("Min val: " + Byte.MIN_VALUE);
        System.out.println("Max val: " + Byte.MAX_VALUE);
        System.out.println("\n");

        // ? Shorts:
        short myShort = 0;
        System.out.println("Short info:");
        System.out.println("Short bytes: " + Short.BYTES);
        System.out.println("Short size in bits: " + Short.SIZE);
        System.out.println("Min val: " + Short.MIN_VALUE);
        System.out.println("Max val: " + Short.MAX_VALUE);
        System.out.println("\n");

        // ?Ints:
        int myInt = 0;
        System.out.println("Integer info:");
        System.out.println("Integer bytes: " + Integer.BYTES);
        System.out.println("Integer size in bits: " + Integer.SIZE);
        System.out.println("Min val: " + Integer.MIN_VALUE);
        System.out.println("Max val: " + Integer.MAX_VALUE);
        System.out.println("\n");

        // ?Longs:
        long myLong = 92989882882988282L;
        System.out.println("Long info:");
        System.out.println("Long bytes: " + Long.BYTES);
        System.out.println("Long size in bits: " + Long.SIZE);
        System.out.println("Min val: " + Long.MIN_VALUE);
        System.out.println("Max val: " + Long.MAX_VALUE);
        System.out.println("\n");

        // ? For 10+ Java version = var
        var a = 129;
        var b = 1.23;
        var c = -0.122;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
