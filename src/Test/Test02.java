package Test;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        int n = 12;
        int count = 0;
        int[] numlist = {2,100,120,600,12,12};


        int[] answer = new int[numlist.length];
        int k = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i]%n == 0){
                answer[k] = numlist[i];
                k++;
            }
        }
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] != 0)
                count++;
        }
        int[] exit = new int[count];
        int h = 0;
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] != 0){
                exit[h] = answer[i];
                h++;
            }
        }
        System.out.println(count);
        for(int i: exit){
            System.out.print(i+" ");
        }
    }
}
