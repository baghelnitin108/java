package Array;

public class Reverse {

    public static void main(String[] args) {
        
    
    int[]arr={1,2,3,4,5,6,7,0};

    int[]res=new int[arr.length];

    for(int i=arr.length-1;i>=0;i--){
        res[arr.length-i-1]=arr[i];
    }
    for(int i=0;i<res.length;i++){
        System.out.println(res[i]);
    }
}
    
    
}
