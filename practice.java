// // /**
// //  * practice
// //  */
// // // import java.util.HashMap;
// import java.util.*;
// // // public class practice {
// // //     public static void main(String[] args) {
// // //         HashMap<String, Integer> ages = new HashMap<>();

// // //         // Insert key-value pairs
// // //         ages.put("Alice", 28);
// // //         ages.put("Bob", 34);
// // //         ages.put("Charlie", 25);

// // //         // Search / retrieve
// // //         System.out.println("Bob's age: " + ages.get("Bob"));

// // //         // Update
// // //         ages.put("Bob", 35);

// // //         // Delete
// // //         ages.remove("Charlie");

// // //         // Iterate
// // //         for (String name : ages.keySet()) {
// // //             System.out.println(name + " -> " + ages.get(name));
// // //         }
// // //     }
// // // }

// // // class practice{
// // //     public static void main(String[] args) {
// // //         Scanner sc=new Scanner(System.in);
// // //         int n=sc.nextInt();
// // //         int []v=new int[n];
// // //         for(int i=0;i<v.length;i++){
// // //             v[i]=sc.nextInt();

// // //         }
// // //         for(int i=0;i<v.length;i++){
// // //             System.out.print(v[i] + " ");
// // //         }
// // //     }
// // // }

// // /**
// //  * practice
// //  */
// // // public class practice {

// // //     public static void main(String[] args) {
// // //         Scanner sc=new Scanner(System.in);
// // //         int n=5;
// // //         int []v=new int [n];
// // //         int num=0;
// // //         for(int i=0;i<n;i++){
// // //             v[i]=sc.nextInt();
// // //             num=num+v[i];
// // //         }
// // //         System.out.println(num);

// // //     }
// // // }

// // /**
// //  * practice
// //  */
// // // public class practice {

// // //     public static void main(String[] args) {
// // //         Scanner sc=new Scanner(System.in);
// // //         int i=5;
// // //         int small=sc.nextInt();

// // //         for(int a=0;a<i;a++){
// // //             int num=sc.nextInt();
// // //             if(num<small){
// // //                 small=num;

// // //             }
// // //         }
// // //         System.out.println("Largest: "+small);
// // //     }
// // // }

// // /**
// //  * practice
// //  */
// // public class practice {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         int v[]=new int[n];
// //         boolean right=false;
// //         int r=sc.nextInt();

// //         for(int i=0;i<=v.length;i++){
// //             v[i]=sc.nextInt();
// //             if(v[i] == r){
// //                 right=true;
// //                 break;

// //             }
// //         }
// //         System.out.print("Iruka:");

// //         if(right){
// //             System.out.println("Correct");
// //         }
// //         else{
// //             System.out.println("Not");
// //         }

// //     }
// // }

// // import java.util.ArrayList;
// // import java.util.Scanner;

// // /**
// //  * practice
// //  */
// // public class practice {

// //     public static void main(String[] args) {
// //         ArrayList<Integer> n=new ArrayList<>();
// //         Scanner sc=new Scanner(System.in);
// //         int v=sc.nextInt();
// //         int find=sc.nextInt();
// //         for (int i=0;i<v;i++){
// //             n.add(sc.nextInt());
// //         }
// //         int count=0;

// //         for(int i=0;i<n.size();i++){
// //             if(n.get(i)==find){
// //                 count++;
// //             }

// //         }
// //         System.out.println(count);

// //     }
// // }

// // import java.util.Scanner;
// import java.util.*;
// // import java.util.Scanner;
// // // public class practice {
// // //     public static void main(String[] args) {
// // //         Scanner sc=new Scanner(System.in);
// // //         int n=sc.nextInt();
// // //         for(int i=1;i<=n;i++){
// // //             for(int j=i;j<=n;j++){
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println(" ");
// // //         }
// // //         for(int i=1;i<=n;i++){
// // //             for(int j=1;j<=i
// // //                 ;j++){
// // //                 System.out.print("*");
// // //             }
// // //             for
// // //             System.out.println(" ");
// // //         }
// // //     }
// // // }

// // /**
// //  * practice
// //  */

// // public class practice {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         ArrayList<Integer> num=new ArrayList<>();
        
// //         for(int i=0;i<n;i++){
// //             num.add(sc.nextInt());
// //         }     
// //         int find=sc.nextInt();   
// //         for(int i=0;i<n;i++){
// //             if(num.get(i) == find){
// //                 System.out.println(num.indexOf(find));
// //             }
// //         }
// //     }
// // }

// /**
//  * practice
//  */
// // public class practice {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();

// //         ArrayList<Integer> v=new ArrayList<>();

// //         for(int i=0;i<n;i++){
// //             v.add(sc.nextInt());
// //         }
// //         int num=sc.nextInt();
// //         for(int i=0;i<v.size();i++){
// //             if(num == v.get(i)){
// //                 continue;
// //             }
// //             System.out.print(v.get(i)+" ");
// //         }
        
// //     }
// // }

// /**
//  * practice
//  */
// // public class practice {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         ArrayList<Integer> arr=new ArrayList<>();
// //         for(int i=0;i<n;i++){
// //             arr.add(sc.nextInt());
// //         }
// //         System.out.println("Which index: ");
// //         int old=sc.nextInt();
// //         System.out.println("New value: ");
// //         int ne =sc.nextInt();
// //         int index=arr.indexOf(old);
// //         if(index != -1){
// //             arr.set(index , ne);
// //         }


// //         for(int i=0;i<arr.size();i++){
// //         System.out.print(arr.get(i) + " ");
// //         }
// //     }
// // }

// /**
//  * practice
//  */
// // public class practice {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         ArrayList<Integer> var=new ArrayList<>();
// //         for(int i=0;i<n;i++){
// //             var.add(sc.nextInt());
// //         }
// //         for(int i=n-1;i>=0;i--){
// //             System.out.print(var. get(i) + " ");
// //         }
// //     }
// // }

// import java.util.ArrayList;
// import java.util.Collections;

// /**
//  * practice
//  */
// // public class practice {

// //     public static void main(String[] args) {
// //         ArrayList<Integer> list = new ArrayList<>();

// // list.add(50);
// // list.add(10);
// // list.add(30);

// // Collections.sort(list);

// // System.out.println(list);
// //     }
// // }


// // class practice{
// //     public static void main(String[] args) {
// //         int []arr={1,2,3,4};
// //         int last=arr.length-1;
// //         System.out.println(arr.length);
// //         int length=arr.length-1;
// //         System.out.println(length);
// //         int le=arr.length-1;
// //         System.out.println(arr.length);

// //     }
// // }

// /**
//  * practice
//  */

// // public class practice {

// //     public static void main(String[] args) {
// //         ArrayList<Integer> v=new ArrayList<>();
        
// //         v.add(10);
// //         v.add(20);
// //         v.add(30);
// //         v.add(0,40);
// //         System.out.println(v.get(0));



// //     }
// // }
// import java.util.*;
// class practice{
//     public static void main(String[] args) {
//         // StringBuilder sb=new StringBuilder("Game");
//         // sb.append(" Center");
//         // System.out.println(sb);

//         String s="madam";
//         String v="";
//         for(int i=s.length()-1;i>=0;i++){
//             v=v+s.charAt(i);
//         }
//         if(s.equals(v)){
//             System.out.println("Pali");
//         }
//         else{
//             System.out.println("Not");
//         }


//     }
// }

