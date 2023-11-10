import java.util.Random;

public class Zadacha1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        int sqr = 0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt();
            System.out.println(arr[i]* arr[i]);
        }
    }
}
