package algo;

import java.util.Random;

public class Lotto03 {
    public static void main(String[] args) {
        //1.  준비
        Random random = new Random();
        int[] arr = new int[6];

        //2. 로또 번호 받기
        int n;

        //2.1 첫번째 추첨 [9][][][][][]
        n = random.nextInt(45) + 1;
        arr[0] = n;

        //2.2 두번째 추첨 [9][15][][][][]
        while(true){
            n = random.nextInt(45) + 1; // <- 9
            if(arr[0] != n){
                arr[1] = n;
                break;
            }
        }


        //2.3 두번째 추첨 [9][15][20][][][]
        n = random.nextInt(45) + 1;
        arr[2] = n;

        //2.4 두번째 추첨 [9][15][20][30][][]
        n = random.nextInt(45) + 1;
        arr[3] = n;

        //2.5 두번째 추첨 [9][15][20][30][40][]
        n = random.nextInt(45) + 1;
        arr[4] = n;

        //2.6 두번째 추첨 [9][15][20][30][40][43]
        n = random.nextInt(45) + 1;
        arr[5] = n;
    }
}
