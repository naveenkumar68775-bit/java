// // class main{
// //     String getname(String n){
// //         return n;
// //     }
// //     long mobile(long num){
// //         return num;
// //     }
// //     public static void main(String[] args) {
// //         main v=new main();
// //         String name=v.getname("Naveenkumar s");
// //         System.out.println("Name :" + name);
// //         long it=v.mobile(8610768775L);
// //         System.out.println("Mobile num:"+ it);
// //     }
// // }

// //   int []n={1,2,3,1,2,3,2,3,4};
// //         for(int i=0;i<n.length;i++){
// //             boolean nav=false;
// //             for(int j=0;j<n.length;j++){
// //                 if(n[i]==n[j]){
// //                     nav =true;
// //                     break;
// //                 }
// //             }
// //             if(nav=false){
// //                 System.out.print(n[i]+" ");
// //             }
// //         }
// import  java.util.*;
// class main{
//     public static void main(String[] args) {
//         // String n="a2b3c1";
//         // char []c=n.toCharArray();
//         // for(int i=0;i<n.length();i=i+2){
//         //     int v=n.charAt(i+1)-'0';
//         //     for(int j=0;j<v;j++){
//         //         System.out.print(c[i]);
//         //     }
//         // }

//         // String num="1234";
//         // for(int i=0;i<num.length();i++){
//         //     int n=num.charAt(i)-'0';
//         //     System.out.print(n);
//         // }
//         Scanner sc=new Scanner(System.in);
//         // String a=sc.nextLine();
//         // int b=sc.nextInt();
//         // float c=sc.nextFloat();
//         // char d=sc.next().charAt(0);
//         // System.out.println(a);
//         // System.out.println(b);
//         // System.out.println(c);
//         // System.out.println(d);

//         // int a=36;
//         // if(a<=35){
//         //     System.out.println("Fail");
//         // }
//         // else if(a>35 && a<70){
//         //     System.out.println("Pass");
//         // }
//         // else{
//         //     System.out.println("With Distinction");
//         // }
//         // float v=(10000*5*2)/100;
//         // System.out.println(v);

//         // if(3%2==0){
//         //     System.out.println("Even");
//         // }
//         // else{
//         //     System.out.println("Odd");
//         // }

//         // int n=5;
//         // if(n<0){
//         //     System.out.println("Negative");
//         // }
//         // else if(n==0){
//         //     System.out.println("Zero");
//         // }
//         // else{
//         //     System.out.print("Number");
//         // }

//         // int num=250;
//         // if(num<=100){
//         //     System.out.println(num*2);
//         // }
//         // else if(num>=101 && 200<=num){
//         //     System.out.println((num-100)*3+200);
//         // }
//         // else if(num>=201 && 300<=num){
//         //     System.out.print((num-200)*5+500);
//         // }
//     //     int n=5;
//     //     int i=0;
//     //     while(n>i){
//     //         System.out.println(++i);
            
//     //     }

//     // }
//     // int n=1234;
//     // int rev=0;
    
//     // while(n>0){
//     //     int digit=n%10;
//     //     rev=rev+digit*10;
//     //     n=n/10;

//     // }
//     // System.out.println(rev)


// }}
// class teacher{
//     // int a=10;int b=20;
//     static void add(int a,int b){
//         System.out.println(a+b);

//     }
// }
// class main{
//     public static void main(String[] args) {
//         // teacher.add(10,20);
//     }
// }
import java .util.*;
// class bool{
//     bool(int a){
//         int count=0;
//         for(int i=1;i<=a;i++){
//             if(a%i==0){
//                 count++;
//             }
//         }
//         if(count==2){
//             System.out.println(true);
//         }
//         else{
//             System.out.println(false);
//         }
//     }
// }
// class main{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         bool b=new bool(a);
//     }
// }

// class main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=4;
//         String []a=new String[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextLine();
//         }
//         for(int i=0;i<n;i++){
//             // a[i]=sc.nextLine();
//             System.out.println(a[i]);
//         }
        
//     }
// }

class main{
    public static void main(String[]args){
       
        // try{
        //      int n=10;
        // int v=n/1;
        //     System.out.println(v);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("Final");
        // }

        // Input:  nums = [2,7,11,15], target = 9
        // Output: [0,1]

        // int n=4;
        // int []v={2,7,11,15};

        // for(int i=0;i<v.length;i++){
        //     for(int j=i+1;j<v.length;j++){
        //         if(v[i]+v[j]==9){
        //             System.out.println(i + ""+j);
        //             return ;
        //         }
        //     }
        // }

//         Input: "aabbcde"
        // Output: "c"
        // String v="aabbcde";
        // for(int i=0;i<v.length();i++){
        //     char ch =v.charAt(i);
        //     for(int j=0;j<v.length();j++){
        //         char c=v.charAt(j);
        //         if(c!=ch){
        //             System.out.println(ch);
        //             return;
        //         }
                
        //     }
        // }
//         String v = "aabbcde";

// for (int i = 0; i < v.length(); i++) {
//     char ch = v.charAt(i);

//     if (v.indexOf(ch) == v.lastIndexOf(ch)) {
//         System.out.println(ch);

//         break;
//     }
// }
//         String s = "programming";

// String result = "";

// for (int i = 0; i < s.length(); i++) {
//     char c = s.charAt(i);

//     if (result.indexOf(c) == -1) {
//         result = result + c;
//     }
// }

// System.out.println(result);

// String s = "prolgramming";

// for (int i = 0; i < s.length(); i++) {
//     char c = s.charAt(i);

//     if (s.indexOf(c) == i) {
//         System.out.print(c);
//     }
// // }

// Input: "banana"
// Output:
// b = 1
// a = 3
// n = 2

        // String s="banana";
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     int count=0;
        //     if(s.indexOf(c)==i){
             
         
        //     for(int j=0;j<s.length();j++){
        //         if(c==s.charAt(j)){
        //             count++;
        //         }
        //     }
        //     System.out.println(c+"="+ count);
        
        // }}

//         Input: [10,5,20,8,15]
// Output: 15

// Input: [1,2,2,3,2,4]
// Output: 2
        // int [] v={1,2,3,3,3,3,4,5,2,2};
        // int max=0;
        // int element=0;
        // for(int i=0;i<v.length;i++){
        //     int count=0;
        //     for(int j=0;j<v.length;j++){
        //         if(v[i]==v[j]){
        //             count++;
        //         }
        //     }
        //     if(count>max){
        //         max=count;
        //         element=v[i];
        //     }
        // }
        // System.out.println(element);

        // Input: [10,5,20,8,15]
// Output: 15
//             int []n={10,5,20,8,15};
//             int first=n[0];
//             int second=n[1];
//             for(int i=0;i<n.length;i++){
//                 if(first<n[i]){
//                     second=first;
//                     first =n[i];
                    
//                 }
//                 else if(n[1]>second && n[i]!=first){
//                     second=n[i];
                  
//                 }
//             }
//   System.out.println(second);

// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
    //     int []v={0,1,0,3,12};
    //     // int []empty=new int[0];
    //     String z="";
    //         String n="";
    //     for(int i=0;i<v.length;i++){
            
    //         if(v[i]==0){
    //             z=z+v[i]+",";
    //         }
    //         else{
    //             n=n+v[i]+",";
    //         }
    //     }
    //     System.out.println(n+""+z);
    // }

    // int []arr=new int[4];
    // arr [0]=1;
    // arr [1]=2;
    // arr [2]=3;
    // arr[3]=4;
    // System.out.println(Arrays.toString(arr));
}
}