import java.util.*;
// class learn{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []v=new int[n];
//         for(int i=0;i<n;i++){
//             v[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(v[i] + " ");
//         }

        
//     }
// }

// class learn{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int r=0;
//         int []v=new int[n];
//         for(int i=0;i<n;i++){
//             v[i]=sc.nextInt();
//             r=r+v[i];
//         }
//         System.out.println(r);
//     }
// }

// class learn{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int r=0;
//         int []v=new int[n];
//         for(int i=0;i<n;i++){
//             v[i]=sc.nextInt();
//             r=r+v[i];
//         }
//         System.out.println(r*0.25);
//     }
// }

/**
 * learn
 */
// public class learn {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
        

//         int mark[]={1,2,3,4,5};
//         int max=mark[0];
        
//         for(int i=1;i<=mark.length;i++){
//         if(mark[i]<max){
//             max=mark[i];
//         }
//         System.out.println(max);


//     }}
// }

// public class learn {
//     public static void main(String[] args) {
//         int[] arr = {5, 12, 45, 8, 90, 23};
//         int max = arr[0];
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("Output: " + max); // Output: 90
//     }
// }

/**
 * learn
 */
// public class learn {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int var[]=new int[n];
//         int v=var[0];
    
        
//         for(int i=1;i<=var.length;i++){
//             var[i]=sc.nextInt();
//             if(v<var[i]){
//                 v=var[i];
//              System.out.println(v);
//             }
            
//         }
       
//        }
// }

/**
 * learn
 */
// public class learn {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m[]=new int[n];
//         for(int i=0;i<n;i++){
//             m[i]=sc.nextInt();
            
               
//         }
//         System.out.println("Check:");
//         int v=sc.nextInt();
//         for(int i = 0; i < n; i++) {
//             if(m[i] == v) {
//                 System.out.println("Found");
//                 break;
//             }
//             else{
//                 System.out.println("Not found");
//             }
//         }
//     }
// }

/**
 * learn
 */
// public class learn {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int v[]=new int[n];
        
//         int odd=0,even=0;
//         for(int i=0;i<n;i++){
//             v[i]=sc.nextInt();
//             if(v[i]%2==0){
//                 even++;
//             }
//             else{
//                 odd++;
//             }
//         }
//         System.out.println("Even:"+ even);
//         System.out.println("Odd:" + odd);
//         sc.close();
//     }
// }

/**
 * learn
 */
// public class learn {

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int v[]=new int[n];
//         for(int i=0;i<n;i++){
//             v[i]=sc.nextInt();
//         }
//         for(int i=n-1;i>=0;i--){
//             System.out.println(v[i]);
//         }
//     }
// }

/**
 * learn
 */
import java.util.Scanner;

public class learn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int v[] = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int s = v[0];

        // Find largest
        for (int i = 1; i < n; i++) {
            if (v[i] > s) {
                s = v[i];
            }
        }

        int second = Integer.MIN_VALUE;

        // Find second largest
        for (int i = 0; i < n; i++) {
            if (v[i] < s && v[i] > second) {
                second = v[i];
            }
        }

        System.out.println(second);
    }
}