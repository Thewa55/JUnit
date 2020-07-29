package TestCase2;

public class Case2 {

    public static int findMax1(int arr[]){
        int max = 0;
        for(int i = 1; i<arr.length; i++){
            if(max<arr[i]) max = arr[i];
        }
        return max;
    }

    public static int findMax2(int arr[]){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(max<arr[i]) max = arr[i];
        }
        return max;
    }
}
