public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        for (int i = 0; i <= 10; i++) {
            double x = 0.1 * i;
            double fx = x * x - 2 + x - 3;
            System.out.println(" | " + x + " | " + fx + " | ");
        }
        System.out.println("---------------------------");
    }
}