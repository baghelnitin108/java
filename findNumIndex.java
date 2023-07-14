package Array;

public class findNumIndex {
    public static void main(String[] args) {
        int[]arr={7,3,2,1,0,14,13,11};
        int k=14;
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
