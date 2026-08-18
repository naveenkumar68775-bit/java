// interface car{
//     void tata();
// }
// interface truck{
//     void mahindra();
// }
// class interface implements  {
    
//     public static void main(String[]args){

//     }
// }
import java .util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Set;
/**
 * interface
 */
public class inter{
    public static void main(String[] args) {
        
    
        // ArrayList<Integer> n=new ArrayList<>();
        // n.add(10);
        // System.out.println(n);
        
        // ArrayList v=(ArrayList)n.clone();
        // System.out.println(v);

        // HashMap <Integer ,Character> n=new HashMap<>();
        // n.put(1,'n');
        // n.put(2,'v');
        // n.put(2,'s');
        // System.out.println(n.get(n));


//         Stack<Integer> v=new Stack<>();
//         v.push(10);
//         v.push(20);
//         v.push(30);
//         v.push (50);
//         System.out.println(v);
//         System.out.println(v.pop());
       
//         System.out.println( v.peek());
//         System.out.println( v.pop());
// System.out.println( v.pop());
// System.out.println( v.pop());

            // HashSet <Integer> v=new HashSet<>();
            // v.add(10);
            // v.add(20);
            // v.add(30);
            // v.add(10);

            // v.remove(30);
            // System.out.println(v);

            // Queue <Integer> v=new LinkedList<>();
            // v.add(10);
            // v.add(20);
            // v.add(30);
            // System.out.println(v);
            // System.out.println(v.peek());
            // System.out.println(v.poll());
            //  System.out.println(v.poll());

            // Queue <Integer> n=new LinkedList<Integer>v.clone();
            // Scanner sc=new Scanner(System.in);
            // Set<Integer> v=new HashSet<>();
            // int []n=new int[3];
            // for(int i=0;i<=n.length-1;i++){
            //     v.add(sc.nextInt());
            // }
            // System.out.println(v);

            // int []n={10,5,8,25,20};
            // int temp=0;
            // for(int i=0;i<n.length-1;i++){
            //     for(int j=0;j<n.length-i-1;j++){
            //         if(n[j]>n[j+1]){
            //             temp=n[j];
            //             n[j]=n[j+1];
            //             n[j+1]=temp;
                        
            //         }

            //     }
            //     System.out.println(temp);
            // }

            // int n=12345;
            // while(n>0){
            //     int v=n%10;
            //     System.out.println(v);
            //     n=n/10;
            // }

            // String s="naveen";
            // String s1="";
            // for(int i=s.length()-1;i>=0;i--){
            //     s1=s1+s.charAt(i);
            // }
            // System.out.println(s1);

            // String s="thunder";
            // String s1="";
            // for(int i=s.length()-1;i>=0;i--){       
                
            //     s1=s1+s.charAt(i);
            // }       
            // System.out.println(s1);

            String s="1212";
            String dup=s;
            String s1="";
            for(int i=s.length()-1;i>=0;i--){
                s1=s1+s.charAt(i);
            }
            if(s1.equals(dup)){
                
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
            
            


             


    }  
} 