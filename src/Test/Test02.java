package Test;

public class Test02 {
    public static void main(String[] args) {
        String str1 = "AbcAbcA";
        String str2 = "AAA";
        String st = "";

        int answer = 0;
        String[] arr = str1.split("");
        String[] bss = str2.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(bss[0])){
                for(int k = i; k < i + bss.length; k++){
                    if(arr[k] == null)
                        break;
                    st = st + arr[k];

                }
                if(st.equals(str2)) {
                    break;
                }
                else
                    st = "";
            }
        }
        if(st.equals(str2))
            answer = 1;
        else
            answer = 2;

        System.out.println(answer);

    }
}
