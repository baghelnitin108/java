package Array;

class barChart {

    public static void main(String[] args) {
        int[]arr={7,8,3,2,0,1};
        int max=0;
        
    for(int i=0;i<arr.length;i++){
       if(max<arr[i]){
        max=arr[i];
       }
    }
    for(int h=max;h>0;h--){
        for(int j=0;j<arr.length;j++){
            if(h<=arr[j]){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }
         System.out.println();
    }
   
    }

    
}










// public class barChart
// {
// 	public static void main(String[] args) {
// 		 int[]arr={2,4,6,8,10};
    
//     int max=0;
    
//     for(int i=0;i<arr.length;i++){
//         if(max<arr[i]){
//             max=arr[i];
//         }
        
//     }
    
//     for(int h=max;h>=0;h--){
//         for(int j=1;j<arr.length;j++){
//             if(h<=arr[j]){
//                 System.out.print("*\t");
//             }else{
//                 System.out.print("\t");
//             }
//         }
//         System.out.println();
//     }

// 	}
// }
