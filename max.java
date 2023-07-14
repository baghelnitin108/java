package Array;

public class max {
    public static void main(String[] args) {
        int[] arr ={23,1,67,45,34,89,100,223,45};

        int max =0;

        for(int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }System.out.println(max);
    }
    
}
