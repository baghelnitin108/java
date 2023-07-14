package Array;

public class Reverse2 {
    public static void main(String[] args) {

        int arr[]={19,8,7,3,4,14,0,1,9,6};

        int start=0;
        int end=arr.length-1;

        while(start<end){
            int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;

             start++;
             end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
