import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        double e = Math.E;
       double p = Math.PI;
//        System.out.println(Math.random()*10);
//        Random random = new Random();
//        { int i = random.nextInt(-10,25);
//        System.out.println(i);
//        System.out.println(Math.toDegrees(488)); }
        int[] arr = new int[10];
        arr[0] =1;
        arr[1] =11;
        arr[2] =15;
        arr[3] =13;
//        Random r1 = new Random();
//        int i = r1.nextInt(-10,25);
//        int arr2[] = new int[i];
       // System.out.println(arr2[i]);

        //---------------------
        int count = 10;
        int[] arr3 = new int[count];
        for (int j = 0; j <arr3.length ; j++) {
            arr3[j] = j;
        }
        for (int j = 0; j <arr3.length ; j++) {
            System.out.println(arr3[j]);
        }
        for (int temp: arr3){
            System.out.print(temp);
        }
    }
}
