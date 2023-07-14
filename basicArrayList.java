package ArrayList;
import java.util.*;
public class basicArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>();

        // adding an element to array list 

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);

        // length of the array List 

        // int l = al.size();

        // System.out.println(l);




        // printing the array list 

        // for(int i =0 ;i<al.size();i++){

        //     int ele = al.get(i);

        //     System.out.println(ele);
        // }









        // add at a specific index 

                  al.add(2,100);








        // remove at specific index 

                  al.remove(2);




          // set at specific index 

              al.set(2,100);




              

              // clear all the elements 

              al.clear();

        for(int i =0 ;i<al.size();i++){

                int ele = al.get(i);
    
                System.out.println(ele);
            }
    







    }
}