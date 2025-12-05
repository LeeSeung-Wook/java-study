package algo;


import java.util.Arrays;

// 4찾기
public class BSearch05 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,9,8,7,6,5,4,3,10}; // 11개 log11 -> 3~4회안에 끝남

        Arrays.sort(arr); // {0,1,2,3,4,[5],6,7,[8],9,10}

        int target = 6;
        int startIndex = 0;
        int endIndex = 10;
        int mid = -1;

        startIndex = mid + 1; // 0
        mid = (endIndex - startIndex) / 2 ; // 5번지
        if(target == arr[mid]){
            System.out.println(target + "을 찾았습니다(1라운드): " + arr[mid]);
        }

        startIndex = mid + 1; // 6
        mid = (endIndex - startIndex) / 2 + startIndex; // 8번지
        if(target == arr[mid]){
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }

        endIndex = mid - 1; // 7
        mid = (endIndex - startIndex) / 2 + startIndex; // 6번지
        if(target == arr[mid]){
            System.out.println(target + "을 찾았습니다(3라운드): " + arr[mid]);
        }
    }
}
