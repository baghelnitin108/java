package Array;
import java.util.*;
public class ArrayBasic {

    public static void main(String[] args) {
        
    
   // int[]arr;                         //declaration




   //int[]arr=new int[5];                //intialization





  // int[]arr2=new int[5];                   //access alement
//    int[]arr={1,2,3,4,5};
   //System.out.println(arr[0]);






 // arr[0]=100;
// System.out.println(arr[0]);         //change element






   // int length=arr.length;
    //System.out.println(length);         //length of array






    // for(int i=0;i<arr.length;i++){        //iterate through array
    //    System.out.println(arr[i]); }




    //   int[]arr={12,14,56,78,63,45};
    //   int max=Integer.MIN_VALUE;
      
    //   for(int i=0;i<arr.length;i++){                      //maximum value
    //     if(max<arr[i]){
    //         max=arr[i];
    //     }
    //   }System.out.println(max);







    // int[]arr={14,45,25,78,36,85,55};
    // int min=Integer.MAX_VALUE;
    
    // for(int i=0;i<arr.length;i++){                        //minimum value
    //     if(min>arr[i]){
    //         min=arr[i];
    //     }
    // }System.out.println(min);







    // int[]arr={12,1,45,36,85,69,14,88};

    // Arrays.sort(arr);                               //sorting 

    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }







    // int[]arr={1,2,3,4,5,6,7,0};

    // int start=0;
    // int end=arr.length-1;

    // while(start<end){
    //     int temp=arr[start];
    //     arr[start]=arr[end];                             //Reverse 
    //     arr[end]=temp;

    //     start++;
    //     end--;
    // }
    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]+"");
    // }



    




    // int[]arr={1,5,3,2,6,4,8,0};
    //     int[]copy={};

    //     int[]res=new int[arr.length];

    //     for(int i=0;i<arr.length;i++){                    //copy and past
    //         res[i]=arr[i];
    //     }
    //     for(int i=0;i<res.length;i++){
    //         System.out.println(res[i]);
    //     }








    //  int[]arr={7,3,2,1,0,14,13,11};
    //     int k=14;
    //     int ans =-1;
    //     for(int i=0;i<arr.length;i++){                             //find Number Index
    //         if(arr[i]==k){
    //             ans=i;
    //         }
    //     }
    //     System.out.println(ans);




   








//     int[]arr={4,3,2,7,2,6,2,3,2,9,0,1};
//     int k=2;
//     int la=-1;
    
//     for(int i=0;i<arr.length;i++){
//       if(arr[i]==k){
//         la=i;
        
//       }
//     }
//       int fo=-1;
    
//     for(int i=arr.length-1;i>=0;i--){                             //first and last array
//       if(arr[i]==k){
//         fo=i;
        
//       }
//     }
//     System.out.println(la);
// System.out.println(fo);









// int[]arr={4,3,2,7,2,6,2,3,2,9,0,1};
//     int k=2;
//     int fo=-1;
    
//     for(int i=0;i<arr.length;i++){
//       if(arr[i]==k){
//         fo=i;
//         break;
        
//       }
//     }
//       int la=-1;
    
//     for(int i=arr.length-1;i>=0;i--){                          //first and last array   with break method
//       if(arr[i]==k){
//         la=i;
//         break;
        
//       }
//     }
//     System.out.println(la);
// System.out.println(fo);








// int[]arr={4,3,2,7,2,6,2,3,2,9,0,1};
// int k=2;

// int fo=-1;
// int la=-1;

// boolean flag=true;

// for(int i=0;i<arr.length;i++){
//   if(k==arr[i]&& flag==true){                              //first and last array   with boolean = true
//     fo=i;
//     flag=false;
//   }if(k==arr[i]){
//     la=i;
//   }
// }System.out.println(fo);
// System.out.println(la);







// int[]arr={8,2,1,3,2,7,2,0,1};
// int k=2;

// int a=0;

// for(int i=0;i<arr.length;i++){                 //find the frequency of element
//   if(k==arr[i]){
    
//     a++;
    

//   }
// }System.out.println(a);







// int[]arr1={1,2,3,4};
// int[]arr2={5,6,7,8,9};

// int[] res=new int[arr1.length+arr2.length];


// for(int i=0;i<arr1.length;i++){                                              //concatenate two arrays

//   res[i]=arr1[i];
  
// }
  

//   for(int i=0;i<arr2.length;i++){
//     res[i+arr1.length]=arr2[i];
//   }
//   System.out.print(Arrays.toString(res));







// int[]arr={5,6,7,8,9};
// int k=7;

// int[]res=new int[arr.length-1];
// int itr=0;

// for(int i=0;i<arr.length;i++){
//   if(arr[i]!=k){                                                    //Remeove of an element
//     res[itr]=arr[i];
//     itr++;
//   }
// }System.out.print(Arrays.toString(res));







//  int[]arr={14,45,25,78,36,85,55};
//     int min=Integer.MAX_VALUE;
//      int max=Integer.MIN_VALUE;
    
//     for(int i=0;i<arr.length;i++){                       
//         if(min>arr[i]){
//             min=arr[i];
//         }
//     }
      
      
//       for(int i=0;i<arr.length;i++){                      // difference between maximum value and min value
//         if(max<arr[i]){
//             max=arr[i];
//         }
//       }

//       System.out.println(max-min);








    //   int[]arr={14,45,25,78,36,85,55};
    // int min=Integer.MAX_VALUE;
    //  int max=Integer.MIN_VALUE;
    
    // for(int i=0;i<arr.length;i++){                       
    //     if(min>arr[i]){
    //         min=arr[i];
    //     }
    //     if(max<arr[i]){
    //       max=arr[i];
    //     }
    // }
    // int diff=max-min;
    // System.out.println(diff);










    //  int[]arr={14,45,25,78,36,85,55};
    // int min=Integer.MAX_VALUE;
    //  int max=Integer.MIN_VALUE;
    
    // for(int i=0;i<arr.length;i++){                       //single loop max and min value
    //     if(min>arr[i]){
    //         min=arr[i];
    //     }
    //     if(max<arr[i]){
    //       max=arr[i];
    //     }
    // }
    
    // System.out.println(max);
    // System.out.println(min);








    // int[]arr={4,2,3,9,1,7};
    // int k=7;

    // for(int i=0;i<arr.length;i++){
    //   for(int j=i+1;j<arr.length;j++){                            // find a number an array sum is equal
    //     if(k==arr[i]+arr[j]){
    //       System.out.println(i);
    //       System.out.println(j);
                 
    //              break;
    //     }
    //   }
    // }







//     int[]arr={7,3,19,100,2,0,7};
//     int max= Integer.MIN_VALUE;

//     for(int i=0;i<arr.length;i++){
//       if(max< arr[i]){
//         max=arr[i];
//       }
//     }

//     int k=max;

// int[]res=new int[arr.length-1];
// int itr=0;

// for(int i=0;i<arr.length;i++){
//   if(arr[i]!=k){                                                   
//     res[itr]=arr[i];
//     itr++;
//   }
// }System.out.print(Arrays.toString(res));                       //second maximum

// int[]arr2=res;

// int max2=Integer.MIN_VALUE;

// for(int i=0;i<arr2.length;i++){
//   if(max2<arr2[i]){
//     max2=arr2[i];
//   }
// }System.out.println(max2);







// int[]arr={7,3,19,100,2,0,1};
// int max=Integer.MIN_VALUE;
// int Smax=Integer.MIN_VALUE;

// for(int i=0;i<arr.length;i++){                                //Second Maximum
//   if(max < arr[i]){
//     Smax=max;
//     max=arr[i];
//   }else if(Smax < arr[i]){

//     Smax=arr[i];
//   }
// }System.out.println(Smax);










// int[]arr={7,3,19,100,2,0,1};
// int min=Integer.MAX_VALUE;
// int Smin=Integer.MAX_VALUE;

// for(int i=0;i<arr.length;i++){                                //Second Minimum
//   if(min > arr[i]){
//     Smin=min;
//     min=arr[i];
//   }else if(Smin < arr[i]){

//     Smin=arr[i];
//   }
// }System.out.println(Smin);



}     
}

