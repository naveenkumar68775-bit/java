// import java.util.Scanner;;
// public class find {
//     void evenorodd(int num){
//         if (num%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num = sc.nextInt();
//         find v = new find();
//         v.evenorodd(num);

//     }
// }

// import java.io.EOFException;
// import java.util.InputMismatchException;
// import java.util.Scanner;
// class find{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         try{
//             int n=sc.nextInt();
//             int a=0;
//             int c=a/n;

//         }
//         catch(ArithmeticException e){
//             System.out.println(e);
//         }
//         catch (InputMismatchException e){
//             System.out.println("Could not allow this Word");
//             throw new InputMismatchException("Thunder Allow");
//         }
//         finally{
//             System.out.println("Finish");
//         }

//     }
// }

/**
 * find
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class find {

    public static void main(String[] args) {
        // try{
        // FileWriter n=new FileWriter("output.txt");
        // BufferedWriter b=new BufferedWriter(n);
        // b.write ("Thunder");
        // b.newLine();
        // b.write("It's ME");
        // b.newLine();
        // b.write("NAVEEN");
        // b.newLine();
        // b.write("God");
        // System.out.println("Finish");
        // b.close();

        // FileReader n=new FileReader("output.txt");
        // BufferedReader v=new BufferedReader(n);
        
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // import java.util.*;



//         Scanner sc = new Scanner(System.in);

//         String s = sc.nextLine();

//         String rev = "";

//         for(int i = s.length() - 1; i >= 0; i--) {
//             rev += s.charAt(i);
//         }

//         if(s.equals(rev))
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//     }
// }


// import java.io.BufferedWriter;
// import java.io.CharArrayReader;
// import java.io.FileWriter;
// import java.util.*;

// class find{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
        

//     //     String n=sc.nextLine();
    //     String v[]=n.split(" ");
    //    for(String s :v){
    //     System.out.println(s);
    //    }
// 

        // String n=sc.nextLine();
        // char v=n.charAt(0);
        // // String s=n.length-1;
        // char l=n.charAt(n.length()-1);
        // System.out.println(v + " "  + l);

        // String n="Hello";
        // System.out.println(n.length());

        // String n="hello";
        // System.out.println(n.toUpperCase());

        // String m="Naveen";
        // String n="kumar";
        // System.out.println(m.concat(" " +n));

        // String a="java";
        // String []v=a.split( "");
        // for(int i=a.length()-1;i>=0;i--){
        //     System.out.println(v[i]);
        // }

        // for(String s:v){
        //     System.out.println(s);
        // }

        // String s="programming";
        // System.out.println(s.length());

        // String s="naveen";
        // int count =0;
        // for(int i=0;i<s.length()-1;i++){
        //     char ch = s.charAt(i);
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // String v="hello";
        // int count =0;
        // for(int i=0;i<=v.length()-1;i++){
        //     char ch=v.charAt(i);
        //     if( ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        //         // System.out.println();
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // String n="count123";
        // // String []v=n.split("");
        // int digit=0;
        // for(int i=0;i<n.length();i++){
        //     if(Character.isAlphabetic(n.charAt(i))){
        //         digit++;
        //     }
        // }
        // System.out.println(digit);

        // String n="java is program";
        // int count=0;
        // System.out.println(n.length());
        // for(int i=0;i<=n.length()-1;i++){
             
        //      if(n.charAt(i)==' '){
        //         count++;
        //      }
        // }
        // System.out.println(count);

        // String s="javaPROGRAM";
        // int low=0;
        // int up=0;
        // for(int i=0;i<=s.length()-1;i++){
        //     char ch=s.charAt(i);
        //         if(Character.isUpperCase(ch)){
        //             up++;
        //         }
        //         else if(Character.isLowerCase(ch)){
        //             low++;
        //         }

            
        // }
        // System.out.println(up);
        // System.out.println(low);

        // String s="madam";

        // String rev="";
        // for(int i=s.length()-1;i>=0;i--){
        //     rev=rev+s.charAt(i);

        // }
        // if(s.equals(rev)){
        //     System.out.println(true);
        // }
        // else{
        //     System.out.println(false);
        // }

        // String s="Java is a Easy";
        // String v[]=s.split(" ");
        // for(String i : v){
        //     System.out.print(i);
        // }
         
        // String v="programming";
        

        // int count =0;
        // for(int i=0;i<=v.length()-1;i++){
        //     char ch=v.charAt(i);
        //     if(ch=='p'){
        //         System.out.println(ch);
        //     }
        // }
        // System.out.println(count);

        // String s="programming";

        // char []v=s.toCharArray();

     

        // for(int i=0;i<v.length;i++){
        //     for(int j=i+1;j<v.length;j++){
        //         if(v[i]==v[j]){
        //             System.out.print(v[i]+" ");
        //             break;
        //         }
        //     }
        // }

        // String p="aabbbcdd";

        // char v[]=p.toCharArray();

        // for(int i=0;i<v.length;i++){
            // boolean correct=false;
            // for(int j=i;j<v.length;j++){

            //     if(v[i]!=v[j]){
            //         correct=true;
            //         break;
                    
            //     }
                

            // }
            // if(correct){
            //         // System.out.println(v[i]);
            //     }
            //     else{
            //         System.out.println(v[i]);

            //     }

            // int v[]={4,5,10,6,20,7,3};
            // int s=v[0];
            // for(int i=0;i<=v.length-1;i++){
            //     if(s>v[i]){
            //         s=v[i];
                    
            //     }
                
                
            // }

            // System.out.println(s);

            // String n="Naveen";
            
            // char v[]=n.toCharArray();
            // for(int i=2;i<=v.length-4;i++){
            //     System.out.println(v[i]);
            // }
            // StringBuffer obj=new StringBuffer("cursor");
            // System.out.println(obj.append("Lite"));
            // obj=obj.append("Stark");

            // obj.replace(1, 2, "a");

            // System.out.println(obj);

            // String m="NAVEEN";
            // String n="NAVEEN";
            // System.out.println(m.compareTo(n));

            // String name="Stark";
            // name=name.replace("a","o");
            // System.out.print(name);
            
            // int n=5;
            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println("");
            // }
            // int n=5;
            // for(int i=1;i<=5;i++){
            //     for(int j=i;j<=n;j++){
            //         System.out.print("1");
            //     }
            //     System.out.println("");
            // }
            // int count=1;
            // for(int i=1;i<=5;i++){
            //     for(int j=1;j<=i;j++){
                
            //         System.out.print(count+" ");
            //         count++;
            //     }
            //     System.out.println("");
            // }

            // for(int i=1;i<=5;i++){
            //     for(int j=5;j>=i;j--){
            //         System.out.print(j);
            //     }
            //     System.out.println("");
            // }

            // char v;
            // for(int i=1;i<=5;i++){
            //     for(char ch='A';ch<='A'+i;ch++){
            //         System.out.print(ch);
            //     }
             
            //     System.out.println();
            // }

            // for(int i=0;i<5;i++){
            //     for(int j=0;j<5;j++){
            //         if(i==0 || i==4 ||j==0 || j==4){
            //             System.out.print("*");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println("");
            // }
            // int n=10;
            // while(n>0){
            //     System.out.println(n);
            //     n--;

            // }
            // do{
            //     System.out.println(n);
            //     n--;
            // }while(n>0);
            // // n--;
//             try{
//             FileWriter n=new FileWriter("index.txt");
//             BufferedWriter b=new BufferedWriter(n);
//             b.write("consume");
//             b.newLine();
//             b.write("solve");
//             System.out.println("Finish");
//             }
//             catch(Exception e){
//                 System.out.println(e);
//             }
//     }
// }