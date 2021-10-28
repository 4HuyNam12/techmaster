    import java.util.Scanner;

public class Exercise_01 {
    public static void testArray(){
        System.out.println("Nhập vào số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = " , i);
            array[i] = sc.nextInt();
        }
        System.out.print("Các phần tử của mảng : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}