package ex13;

import java.util.HashSet;
import java.util.Random;

public class Collect03 {
    public static void main(String[] args) {
        HashSet<Integer> arr = new HashSet();

        Random random = new Random();
        int n;

        while (true) {
            n = random.nextInt(45)+1;
            arr.add(n);
            if(arr.size() == 6) break;
        }
        for(Integer i: arr){
            System.out.println(i);
        }
    }
}
