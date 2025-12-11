package algo;

import java.util.Random;

public class Lotto05 {
    public static void main(String[] args) {
        //1.  준비
        Random random = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;
        int k = 0;

        //2.1 첫번째 추첨 [9][][][][][]
        while (true){
            boolean isSame = false;
            n = random.nextInt(45) + 1; // <- 9
            for (int i = 0; i < k; i++) {
                if(arr[i] == n){
                    isSame = true;
                }
            }
            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

        //2.2 두번째 추첨 [9][15][][][][]
        while (true){
            boolean isSame = false;
            n = random.nextInt(45) + 1; // <- 15
            for (int i = 0; i < k; i++) {
                if(arr[i] == n){
                    isSame = true;
                }
            }
            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

        // 9,9,15,15,20
        //2.3 세번째 추첨 [9][15][20][][][]
        while (true){
            boolean isSame = false;
            n = random.nextInt(45) + 1; // <- 20
            for (int i = 0; i < k; i++) {
                if(arr[i] == n){
                    isSame = true;
                }
            }
            if(!isSame){
                arr[k] = n;
                break;
            }
        }
        k++;

        //2.4 네번째 추첨 [9][15][20][30][][]
        while (true){
            boolean isSame = false;
            n = random.nextInt(45) + 1; // <- 30
            for (int i = 0; i < 3; i++) {
                if(arr[i] == n){
                    isSame = true;
                }
            }
            if(!isSame){
                arr[3] = n;
                break;
            }
        }

        //2.5 다섯번째 추첨 [9][15][20][30][40][]
        while (true){
            boolean isSame = false;
            n = random.nextInt(45) + 1; // <- 40
            for (int i = 0; i < 4; i++) {
                if(arr[i] == n){
                    isSame = true;
                }
            }
            if(!isSame){
                arr[4] = n;
                break;
            }
        }

        //2.6 여섯번째 추첨 [9][15][20][30][40][43]
        while (true){
            boolean isSame = false;
            n = random.nextInt(45) + 1; // <- 43
            for (int i = 0; i < 5; i++) {
                if(arr[i] == n){
                    isSame = true;
                }
            }
            if(!isSame){
                arr[5] = n;
                break;
            }
        }
    }
}
