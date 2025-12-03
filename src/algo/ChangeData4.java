package algo;

public class ChangeData4 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,3,1,5,6};
        int temp;
        int a = 0;
        int b = 1;

        for (int k = 0; k < arr.length-k; k++) {
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[a] > arr[b]){
                    temp = arr[b];
                    arr[b] = arr[a];
                    arr[a] = temp;
                }
                a++;
                b++;
            }
            a=0;
            b=1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
