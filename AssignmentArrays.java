package Array;

import java.util.Arrays;

public class AssignmentArrays {
    public static void main(String[] args) {

        // int[]arr;                                             //declare of array



        // int[]arr=new int[5];                                   //intilization

        
        


        // int[]arr={1,2,3,4,5,6};

        // System.out.println(arr[1]);                              //access element




        // int[]arr={1,2,3,4,5,6,7,8};
        // arr[0]=25;

        // System.out.println(arr[0]);                           //change element






        // int[]arr={1,2,3,4,5,6,7,8};
        // int length=arr.length;
        // System.out.println(length);                              //length of arrays






        // int[]arr={1,2,3,4,5,6,7,8};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);                               //iterate arrays
        // }








        // int[]arr={25,13,45,69,85,65,12};

        // int max=Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){                           //max value
        //     if(max<arr[i]){
        //         max=arr[i];
        //     }
           
        // } System.out.println(max);









        
        // int[]arr={25,13,45,69,85,65,12};

        // int min=Integer.MAX_VALUE;

        // for(int i=0;i<arr.length;i++){                           //min value
        //     if(min>arr[i]){
        //         min=arr[i];
        //     }
           
        // } System.out.println(min);









        // int[]arr={19,56,32,45,74,65,85};

        // Arrays.sort(arr);

        // for(int i=0;i<arr.length;i++){                                         //sort arrays
        //     System.out.println(arr[i]);
        // }








        // int[]arr={12,45,96,36,85,78,45,25};

        // int start=0;
        // int end=arr.length-1;

        // while(start<end){
        //    int temp=arr[start];
        //    arr[start]=arr[end];                                            //reverse arrays
        //    arr[end]=temp;

        //    start++;
        //    end--;

        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+"");
        // }







        // int[]arr={1,2,3,4,5,6,7,8};

        // for(int i=arr.length-1;i>=0;i--){                     //reverse arrays
        //     System.out.println(arr[i]);
        // }








        // int[]arr={1,2,3,4,5,6,7,8};
        // int[] copy={};

        // int[]res=new int[arr.length];

        // for(int i=0;i<arr.length;i++){                                      //copy arrays
        //     res[i]=arr[i];
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(res[i]);
        // }








        // int[]arr={45,25,45,63,98,74,56,85,35};
        // int k=98;

        // int ans=-1;

        // for(int i=0;i<arr.length;i++){                       //find index of arrays
        //     if(arr[i]==k){
        //         ans=i;
        //     }
        // }
        // System.out.println(ans);







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












// int[]arr={8,2,1,3,2,7,2,0,1};
// int k=2;

// int a=0;

// for(int i=0;i<arr.length;i++){                 //find the frequency of element
//   if(k==arr[i]){
    
//     a++;
    

//   }
// }System.out.println(a);












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







//  int[]arr={4,2,3,9,1,7};
//     int k=7;

//     for(int i=0;i<arr.length;i++){
//       for(int j=i+1;j<arr.length;j++){                            // find a number an array sum is equal
//         if(k==arr[i]+arr[j]){
//           System.out.println(i);
//           System.out.println(j);
                 
//                  break;
//         }
//       }
//     }









    
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
