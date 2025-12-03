package algo;

public class ChangeData3 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순 1,2,3)
        int[] arr = {2,3,1};
        int temp;

        // 0,1 비교 -> 참 -> 스왑{2,3,1}
        if(arr[0] > arr[1]){
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }
        else
            System.out.print("");
        // 1,2 비교 -> 참 -> 스왑{2,1,3}
        if(arr[1] > arr[2]){
            temp = arr[2];
            arr[2] = arr[1];
            arr[1] = temp;
        }
        else
            System.out.print("");
        // 0,1 비교 -> 참 -> 스왑{1,2,3}
        if(arr[0] > arr[1]){
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }
        else
            System.out.print("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
