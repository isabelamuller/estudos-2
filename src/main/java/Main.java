 import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int[] arr = {1, 4, 5, 6, 4, 8, 9, 9};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 9) {
                    System.out.println("encontrei o 9 no index " + i);
                }
            }
        }
    }
    // criou uma array de numeros e quer saber em qual index ta um numero x
}
