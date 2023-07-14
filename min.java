package Array;
public class min {
    public static void main(String[] args) {
        int[] arr ={23,1,67,45,34,89,100,223,45};

        int min =Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }System.out.println(min);
    }
}
