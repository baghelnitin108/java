package ArrayList;


// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {
//     System.out.println("Arrays List");
//     ArrayList<Integer> arr=new ArrayList<>();
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);                                                         // count the number of even Element in Array list
//     arr.add(5);
//     arr.add(6);
//     int count=0;
//     for(int i=0;i<arr.size();i++){
//         int el=arr.get(i);
//         if(el%2==0){
//             count++;
//         }
//     }System.out.println(" count);
             
//   }
    
// }
  








                      
// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {
   
//     ArrayList<Integer> arr=new ArrayList<>();
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);
//     arr.add(5);                                                          //  count the number of odd Element in Array list
//     arr.add(6);
//     int count=0;
//     for(int i=0;i<arr.size();i++){
//         int el=arr.get(i);
//         if(el%2!=0){
//             count++;
//         }
//     }System.out.println(count);
             
//   }
    
// }
       









// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {

//     ArrayList<Integer> arr=new ArrayList<>();
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);
//     arr.add(5);                                                    // find the index of spacific element
//     arr.add(6);
//     int k=5;
//     int res=-1;
//     for(int i=0;i<arr.size();i++){
//       int el=arr.get(i);
//         if(el==k){
//             res=i;  
//         }
//     }System.out.println(res);
             
//   }
    
// }



 
  



//   import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {
    
//     ArrayList<Integer> arr=new ArrayList<>();
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);
//     arr.add(5);                                                 //check arraylist is short
//     arr.add(6);
//     boolean flag=true;
//     for (int i=1;i<arr.size();i++ ){
//         int el=arr.get(i);
//         int sl=arr.get(i-1);
//         if(el<sl){
//            flag=false;
//         }
//     }
//     System.out.println(flag);
//   }
// }








                    
  
// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {

//     ArrayList<Integer> arr=new ArrayList<>();
//       arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);
//     arr.add(5);
//     arr.add(6);                                               //   Remove duplicate Element by ArrayList
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);
//     arr.add(5);
//     arr.add(6);
//           ArrayList<Integer> res=new ArrayList<>();
//          for(int i=0;i<arr.size();i++){
//              int ele=arr.get(i); 
//              boolean flag=false;
//             for(int j=0;j<res.size();j++){
//                 int Listelement=res.get(j);
//                 if (Listelement==ele){ 
//                     flag =true;
//                     break;
//                  }
//              }
//              if(flag==false){
//                   res.add(ele);
//          }
             
//          }
//          System.out.println(res);
// }} 











// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {

//     ArrayList<Integer> arr=new ArrayList<>();
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);                                              // sum the number of even index Element in Array list
//     arr.add(5);
//     arr.add(6);
//     int sum=0;
//     for(int i=0;i<arr.size();i++){
//         int el =arr.get(i);
//         if(i%2==0){
//             sum+=el;  
//         }
//     }System.out.println(sum);
             
//   }
// }







// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {

//     ArrayList<Integer> arr=new ArrayList<>();
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);                                                   // product the number of odd index Element in Array list
//     arr.add(5);
//     arr.add(6);
//     int pro=1;
//     for(int i=0;i<arr.size();i++){
//         int el =arr.get(i);
//         if(i%2!=0){
//             pro*=el;  
//         }
//     }System.out.println(pro);
             
//   }
// }









// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {

//   ArrayList<Integer> arr=new ArrayList<>();
//     arr.add(1);
//     arr.add(2);
//     arr.add(3);
//     arr.add(4);
//     arr.add(5);                                                       //  maximum diffrence between two elements
//     arr.add(2);
//     int max1 =Integer.MIN_VALUE;
//     int max2 =Integer.MIN_VALUE;
//     for(int i=0;i<arr.size();i++){
//         int el=arr.get(i);
//         if(max1<el){
//             max2=max1;
//             max1=el;
//         }else if(max2<el){
//             max2=el;
//         }
//         }
//         System.out.printl(max1-max2);
        
             
//   }
// }










               
// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {

    
//   ArrayList<Integer> arr1=new ArrayList<>();                                       //    merge two sort ArrayList in single list
//       arr1.add(1);
//     arr1.add(2);
//     arr1.add(6);
//     arr1.add(8);
//   ArrayList<Integer> arr2=new ArrayList<>();
//        arr2.add(1);
//     arr2.add(2);
//     arr2.add(4);
//     arr2.add(5);
//     arr2.add(8);
    
//   ArrayList<Integer> arr3=new ArrayList<>();
//     int p1=0;
//     int p2=0;
//     while(p1!=arr1.size()&&p2!=arr2.size()){
//      if(arr1.get(p1)>=arr2.get(p2)){
//               arr3.add(arr2.get(p2));
//                  p2++;
                
//             }else{
//                 arr3.add(arr1.get(p1));
//                 p1++;
               
//             }
//       } if(p1==arr1.size()){
//             for(int i=p2;i<arr2.size();i++){
//                 arr3.add(arr2.get(p2));
//                 p2++;
                
//             }
//         }else{
//             for(int i=p1;i<arr1.size();i++){
//                 arr3.add(arr1.get(p1));
//                 p1++;
                
//             }
//         }
//         System.out.println(arr3);
//   }
// }









               
// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {
    
//   ArrayList<Integer> arr1=new ArrayList<>();
//       arr1.add(1);
//     arr1.add(2);
//     arr1.add(3);
//     arr1.add(8);
//   ArrayList<Integer> arr2=new ArrayList<>();                                   //      find common Element in two ArrayList
//        arr2.add(1);
//     arr2.add(2);
//     arr2.add(4);
//     arr2.add(5);
//     arr2.add(8);
//   ArrayList<Integer> arr3=new ArrayList<>();
//       for(int i=0;i<arr1.size();i++){
//           for(int j=0;j<arr2.size();j++)
//           if(arr1.get(i)==arr2.get(j)){
//               arr3.add(arr1.get(i));
//               break;
//           }
//       }
//         System.out.println(arr3);
//   }
// }













                        
// import java.util.*;
// public class ArrayListAssignment
// {
//   public static void main(String[] args) {

    
//   ArrayList<Integer> arr=new ArrayList<>();
//       arr.add(1);
//     arr.add(2);                                                             // Missing Element
//     arr.add(3);
//     arr.add(5);
//     int k=5*(5+1)/2;
//     int sum=0;
//         for(int i=0;i<arr.size();i++){
//              sum=sum+arr.get(i);
//           }
//         System.out.println((k-sum));
//   }
// }