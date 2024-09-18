public class Main {
    public static void main(String[] args) {
        int x = 23;
        String bin = "";

        while (x > 0) {
            int a = x % 2;
            bin = bin + a;
            x = x / 2;
        }

        System.out.println(bin);
    }
}