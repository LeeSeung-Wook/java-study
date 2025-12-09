package Test;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] sides = new int[3];
        Random random = new Random();
        for (int i = 0; i < sides.length; i++) {
            sides[i] = random.nextInt(1000);
        }
        int answer = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < sides.length; i++){
            if(sides[i] > max)
                max = sides[i];
        }
        System.out.println(max);
        for(int k = 0; k < sides.length; k++){
            if(sides[k] < max)
                min = min + sides[k];
        }
        System.out.println(min);
        if(max < min)
            answer = 1;
        else
            answer = 2;


        for(int i = 0; i < sides.length; i++){
            System.out.print(sides[i]+",");
        }
        System.out.println(answer);
    }
}
