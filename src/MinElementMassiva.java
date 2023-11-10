import java.util.Random;

public class MinElementMassiva {
    public static void main(String[] args) {
       // Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 100) );
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.print("\n");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Миниальный: " + min);
    }
}
