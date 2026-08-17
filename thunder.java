// import java.util.*;

// // public class thunder {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
// //         int m = sc.nextInt();
// //         int[][] v = new int[n][m];
// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < m; j++) {
// //                 v[i][j] = sc.nextInt();
// //             }
// //         }

// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < m; j++) {
// //                 System.out.print(v[i][j] + " ");
// //             }
// //             System.out.println();
// //         }

// //         sc.close();
// //     }
// // }

// /**
//  * thunder
//  */
// // public class thunder {

// //     public static void main(String[]args){
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         int m=sc.nextInt();
// //         int v[][]=new int[n][m];

// //         for(int i=0;i<n;i++){
// //             for(int j=0;j<m;j++){
// //                 v[i][j]=sc.nextInt();
// //             }
// //         }
// //         int s=0;
// //         for(int i=0;i<n;i++){
// //             for(int j=0;j<m;j++){
// //                 s=s+v[i][j];
// //             }
            
            
// //         }
// //         System.out.println(s);
// //     }
// // }

// // class thunder{
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         int m=sc.nextInt();
// //         int v[][]=new int[n][m];
// //         int max=v[0][0];
       

// //         for(int i=0;i<n;i++){
// //             for(int j=0;j<m;j++){
// //                 v[i][j]=sc.nextInt();
// //             }
// //         }
// //         for(int i=0;i<n;i++){
// //             for(int j=0;j<m;j++){
// //                 if(v[i][j]>max){
// //                     max=v[i][j];
// //                 }
// //             }
// //         }
// //         System.out.println("Maximum value: "+max);
        
// // }

// // import java.util.*;

// // public class thunder {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         int n = sc.nextInt();
// //         int m = sc.nextInt();

// //         int[][] v = new int[n][m];

// //         // Input
// //         for (int i = 0; i < n; i++) {
// //             for (int j = 0; j < m; j++) {
// //                 v[i][j] = sc.nextInt();
// //             }
// //         }

// //         // Row Sum
// //         for (int i = 0; i < n; i++) {
// //             int sum = 0;

// //             for (int j = 0; j < m; j++) {
// //                 sum += v[i][j];
// //             }

// //             System.out.println("Row " + (i + 1) + " = " + sum);
// //         }

// //         sc.close();
// //     }
// // }
// class nav{
//     private int a=10;
//     private int b=20;

//     public int getA(){
//         return a;
//     }
//     public int getB(){
//         return b;
//     }
//     int c;
//     public nav (){
//         System.out.println(c=a+b);
//     }
    

// }

// class thunder{
//     public static void main(String[] args) {
//         nav n=new nav();
//         System.out.println(n.getA());
//         System.out.println(n.getB());
       
//     }
// }


import java.util.*;

class thunder{
    public static void main(String[] args) {
        // String n="hello";
        // String v[]=n.split("");
        // int a=v.length-1;
        // String store="";
        // for(int i=a;i>=0;i--){
        //     store=store+v[i];
        // }
        // System.out.println(store);

        // String n="madam";
        // String temp=n;
        // String v[]=n.split("");
        //  int a=v.length-1;
        // String store="";
        // for(int i=a;i>=0;i--){
        //     store=store+v[i];
        // }
        // if(temp.equals(store)){
        //     System.out.println(true);
        // }
        // else{
        //     System.out.println(false);
        // }

        // String n="programming";
        // int vowels=0;
        // int consonants=0;
        // String []v=n.split("");
        // for(int i=0;i<n.length();i++){
        //    char ch=n.charAt(i);
        //    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        //     vowels++;
        //    }
        //    else{
        //     consonants++;
        //    }
        // }
        // System.out.println("V:"+vowels);
        // System.out.println("C:"+consonants);

        // String n="Java is the major easy to learn";
        // String v[]=n.split(" ");
        // int store=0;
        // for(int i=0;i<v.length;i++){
        //     store=store+1;
        // }
        // System.out.println(store);

        // Scanner sc=new Scanner(System.in);
        // System.out.println("input: programming");
        // String s="progrmamming";
        // String []v=s.split("");int count=0;
        // char value='m';
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==value){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // String s="programming";
        // String result="";
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     // char c=0;
        //     if(s.indexOf(ch)!=s.lastIndexOf(ch) && result.indexOf(ch)==-1){
        //         System.out.println(ch);
        //         result=result+ch;
                
        //     }
        // }

        // String name="naveen";
        // String t="";
        // for(int i=0;i<name.length();i++){
        //     char ch =name.charAt(i);
        //     if(name.indexOf(ch)!=name.lastIndexOf(ch) && t.indexOf(ch)==-1){
        //         System.out.println(ch);
        //         t=t+ch;
        //     }

        // }

    //   String v="programming";
    //   for(int i=0;i<v.length()-1;i++){
    //     for(int j=i+1;j<=v.length()-1;j++){
    //         if(v.charAt(i)==v.charAt(j)){
    //             System.out.println(v.charAt(i));
                
    //         }
    //     }
    //   }

   
    // public static void main(String[] args) {

//         String s = "programming";

//         for (int i = 0; i < s.length(); i++) {

//             for (int j = i + 1; j < s.length(); j++) {

//                 if (s.charAt(i) == s.charAt(j)) {
//                     System.out.println(s.charAt(i));
//                     return;
//                 }
//             }
            // String v="java is easy";
            // String s="";
            // for(int i=v.length()-1;i>=0;i--){
            //     s=s+v.charAt(i);
                
            // }
            // System.out.println(s);

//             String a = "Hello";
// String b = "Hello";
// String a = new String("Java");
// String b = new String("Java");
// System.out.println(a == b);
// System.out.println(a.equals(b));
