package algo;

import java.util.Random;

public class LottoApp {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random random = new Random();
        int i = 0;

        while (i < arr.length) {
            int n = random.nextInt(45) + 1;
            int a = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == n) {
                    a = 1;
                    break;
                }
            }

            if(a == 1)
                continue;

            arr[i] = n;
            i++;
        }

        System.out.print("[ ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ]");
    }

}
