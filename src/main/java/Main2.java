import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 5, 6, 4, 8, 9, 9, 3, 2, 7, 54};
        int numero = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numero) {
                System.out.println("encontrei o " + numero +" no index " + i);
            }
        }
    }
}