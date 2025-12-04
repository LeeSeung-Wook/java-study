package algo;

import java.util.Arrays;

// 4찾기
public class BSearch02 {
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,3,8,6};

        //1. 정렬 {1,2,3,4,6,8,10}
        Arrays.sort(arr);

        int target = 2;
        int mid = arr.length/2;

        //2. 검색
        if(target == arr[mid]){
            System.out.println(arr[mid]+"번지에"+target+"를 찾았습니다.");
        }

        if(target < arr[mid]){ // false
            System.out.println(target+"은 "+arr[mid]+"보다 작아요.");

            if(target == arr[1]){
                System.out.println("arr[1]번지에"+target+"를 찾았습니다.");
            }
            else{
                if(target < arr[1]){
                    System.out.println("arr[0]번지에"+target+"이 있습니다.");
                }
                else{
                    System.out.println("arr[2]번지에"+target+"이 있습니다.");
                }
            }
        }
        else{
            System.out.println(target+"은 "+arr[mid]+"보다 커요.");

            if(target == arr[5]){
                System.out.println("arr[5]번지에"+target+"이 있습니다.");
            }
            else{
                if(target < arr[5]){
                    System.out.println("arr[4]번지에"+target+"이 있습니다.");
                }
                else{
                    System.out.println("arr[6]번지에"+target+"이 있습니다.");
                }
            }
        }

        System.out.println("main끝");
    }
}
