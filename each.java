// // // class each {
// // //     public static void main(String[]args){
// // //         System.out.println("Hello World");
// // //     }
// // // }
// // // import java.util.Scanner;
// // // import java.util.Arrays;
// // // class each {
// // //     public static void main(String[]args){
// // //         Scanner sc=new Scanner(System.in);
// //         // int a=sc.nextInt();
// //         // int b=sc.nextInt();
// //         // int c=a+b;
// //         // System.out.println(c);

// //         // int n=sc.nextInt();
// //         // if(n%2==0){
// //         //     System.out.println("Even");
// //         // }
// //         // else{
// //         //     System.out.println("Odd");
// //         // }

// //         // int a=sc.nextInt();
// //         // int b=sc.nextInt();
// //         // int c=sc.nextInt();

// //         // if(a>b){
// //         //     System.out.println("Largest :" + a);
// //         // }
// //         // else if(b>c){
// //         //     System.out.println("LArgest : " + b);
// //         // }
// //         // else{
// //         //     System.out.println("Largest:" + c);
// //         // }

// //         // int n=sc.nextInt();
// //         // int o=n;
// //         // int v=0;
// //         // while(n!=0){
// //         //     int last=n%10;
// //         //     v=v*10+last;
// //         //     n=n/10;
// //         // }
// //         // if(o==v){
// //         //     System.out.println("Palindrome");
// //         // }
// //         // else{
// //         //     System.out.println("Not");
// //         // }

// //         // int n=sc.nextInt();
// //         // long sum=1;
// //         // for(int i=1;i<=n;i++){
// //         //     sum=sum*i;
// //         // }
// //         // System.out.println(sum);

// //         // int n=0;
// //         // int v=1;
// //         // int s=sc.nextInt();

// //         // for(int i=1;i<=s;i++){
// //         //     System.out.println(n + ", ");
// //         //     int next=n+v;
// //         //     n=v;
// //         //     v=next;
// //         // }

// //         // int v=sc.nextInt();
// //         // int sum=0;
// //         // while(v!=0){
// //         //     v=v/10;
// //         //     sum++;


// //         // }
// //         // System.out.println(sum);

// //         // int n=sc.nextInt();
// //         // for(int i=1;i<=10;i++){
// //         //     System.out.println(n+"*"+i+"="+i*n);
// //         // }
// //         int n=sc.nextInt();

// // //         int[] arr=new int[n];
// // //         for (int i=1 ; i<=n;i++){
// // //             arr [i]=sc.nextInt();
// // //         }
// // //         Arrays.sort(arr);
// // //         for(int i=0;i<n;i++){
// // //             System.out.print(arr[i]+" ");
// // //         }
       

// // //     }
// // // }

// // import java.util.*;
// // class each{
// //     private int age;
// //     private String name;
// //     void setAge(int age){
// //         this.age=age;
// //     }
// //     void setName(String name){
// //         this.name=name;
         
// //     }
// //     private int getAge(){
// //         return age;
// //     }
// //     private String getName(){
// //         return name;
// //     }
// //     public static void main(String[] args) {
// //         each v=new each();
// //         v.setAge(20);
// //         v.setName("Naveen");

// //         System.out.println("Name :" + v.getName());
// //         System.out.println("Age :" + v.getAge());

// //     }
// // }

// import java.util.*;
// /**
//  * each
//  */
// // public class each {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int s=0;
// //         int n=sc.nextInt();
// //         for(int i=1;i<=n;i++){
// //             int v=sc.nextInt();
// //             s=s+v;
// //         }
// //         System.out.println(s);

// //     }
// // }

// /**
//  * each
//  */
// // public class each {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int n=sc.nextInt();
// //         int m=sc.nextInt();
// //         System.out.println("Sum: "+n+m);
// //         System.out.println("Diff: ");
// //     }
// // }

// /**
//  * each
//  */
// // public class each {

// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
  
// //         for(int i=1;i<=5;i++){
// //             for(int j=5;j>=i;j--){
// //                 System.out.print(i);
// //             }
// //             System.out.println("");
// //     }}
// // }

// // import java.util.*;


// // /**
// //  * each
// //  */
// // // public class each {

// // //     public static void main(String[] args) {
// // //         Scanner sc=new Scanner(System.in);
// // //         int n=5;
// // //         int []arr =new int[5];
// // //         for(int i=0;i<n-1;i++){
// // //             arr[i]=sc.nextInt();
// // //         }
// // //         for(int i=0;i<n-1;i++){
// // //             System.out.print (arr[i] +"  ");
// // //         }
// // //     }
// // // }

// // class Animal {

// //     Animal(String food) {
// //         System.out.println(food);
// //         System.out.println("Animal eats " + food);
// //     }
// // }

// // class Dog extends Animal {

// //     Dog() {
// //         super("meat");
// //         System.out.println("Dog barks");
// //     }
// // }

// // public class each {
// //     public static void main(String[] args) {

// //         Dog d = new Dog();
// //     }
// // }

// // import java.util.*;

// // abstract class play{
// //     abstract void sound();
// //     play(){
// //         System.out.println("Game is starting");
// //     }
// // }
// // class game extends play{
    
// //     void sound(){
// //         System.out.println("Game is running");
// //     }
// // }
// // class music extends game{
// //     void sound(){
// //         System.out.println("Music is playing");
// //         super.sound();
// //     }
// // }
// // class each{
// //     public static void main(String[] args) {
// //         play v=new music();
// //         v.sound();
        
// //     }
// // }

// /**
//  * each
//  */
// class Student {
//     void display() {
//         System.out.println("Display method");
//     }

//     Student() {
//         this.display();
//         System.out.println("Default constructor");
//     }}

// class tudent extends Student{
//         // super(); // calls Student()
//         tudent(String name) {

//         System.out.println("Name: " + name);
//     }
// }

// public class each {
//     public static void main(String[] args) {

//         tudent s = new tudent("Naveen");
//     }
// }

// class each{
//     public static void main(String[] args) {
//         try {
//     int a = 10 / 0;
//     System.out.println(a);
// }
// catch (ArithmeticException kakashi) {
//     System.out.println("Error");
// }
// finally {
//     int a = 10 ;
//     System.out.println(a);
// }
//     }
// }

// import java.io.*;

// class each {
//     public static void main(String[] args) throws IOException {

//         FileReader file = new FileReader("test.txt");
//     }
// }

// class each{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=(2*i-1);k++){
//                 System.out.print("+");
//             }
//             System.out.println();
//         }
//     }
// }

//         int count = 0;

//         for (int i = 0; i < n.length(); i++) {
//             if (n.charAt(i) == ch) {
//                 count++;
//             }
//         }

//         System.out.println(count);

//     }
// }

// class each{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=0;
//         int []arr=new int[n];

//         int target=sc.nextInt();
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();

//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]==target){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// class each{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str="Thunder";
//         char ch=sc.next().charAt(0);

//         for(int i=0;i<=str.length()-1;i++){
//             if(str.charAt(i)==ch){
//                 i++;
//                 System.out.println("Character found at index: " + i);
//             }
//         }
//     }
// }

// class each{
//     public static void main(String[] args) {
//         int n=37;
//         int i=2;
//         boolean v=true;
//         while(i<n){
//             if(n%i==0){
//                 v=false;
//                 break;
//             }
//                 i++;
//             }
//         if(v==true){
//             System.out.println("Prime");
//         }
//         else{
//             System.out.println("Not prime");
//         }

//     }
// }

// class each {
//     public static void main(String[] args) {

//         int countPrime = 0;

//         for (int i = 10; i <= 30; i++) {
//             int count = 0;
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) {
//                     count++;
//                 }
//             }
//             if (count == 2) {
//                 countPrime++;
//             }
//         }

//         System.out.println(countPrime);
//     }
// }

// public class each{
//     public static void main(String[] args) {
//         String str = "artificial intelligence";

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if (ch == ' ') {
//                 continue; // Skip spaces
//             }

//             if (str.indexOf(ch) == str.lastIndexOf(ch)) {
//                 System.out.println(ch);
//                 break;
//             }
//         }
//     }
// }
//  class each{
//     each(){
//     final int a = 10;
//     a=5;
//     }   
//     public static void main(String[] args) {

//     System.out.println(a);
//     }
// // }
// class person{

//     public String name ="Naveen";
//     protected int age=20;
//     private int secure=1786;
//     String address ="Tiruchengode";
//     void person(){
//         System.out.println(secure);
// }}
// class employee extends person{
//     employee(){
//         System.out.println(name);
//         super.person();
//     }
// }

// class each{
//     public static void main(String[] args) {
//         employee ns=new employee();

//         System.out.println(ns.age);
//         System.out.println(ns.address);

//     }
// }

/**
 * */
/**
 * printable
 */
//  interface printable {
//     void display();

// }
// interface showable{
//     void display(){
//         System.out.println("Time");
//     }
// }
// class doc implements printable,showable{

// }
// public class each {

//     public static void main(String[] args) {

//     }
// }

// class each {
//     public static void main(String[]args)
// {
//     String name ="Naveen";
//     String name1=" Kumar";
//     System.out.println(name.concat(name1));
//     System.out.println(name.charAt(0));
//     System.out.println(name.lastIndexOf());
// }}

// class each{
//     public static void main(String[] args) {
//         String s="Naveean";
//         for(int i=0;i<s.length();i++){

//             char ch= s.charAt(i);
//             if(ch==' '){
//                 continue;
//             }
//             if(s.indexOf(ch)==s.lastIndexOf(ch)){
//                 System.out.println(ch);
//                 break;
//             }
//         }
//     }
// }

// public class each {

//     public static void main(String[] args) {
//         String s="$,X$,X$X,$X$X,$X$X$";
//         String arr[]=s.split(",");
//         for(String v:arr){
//             System.out.println(v);
//         }
//     }
// }

// public class each {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if ((i+j) % 2 == 0) {
//                     System.out.print("$");
//                 } else {
//                     System.out.print("X");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }

// interface name{
//     abstract void sound();
//     default void same(){
//         System.out.println("Same ");
//     }
// }
// class game implements name{
//     public void sound(){
//         System.out.println("Gamer");
//     }
// }

// class each{
//     public static void main(String[] args) {
//         game n=new game();
//         n.sound();
//         n.same();
//     }
// }

/**
 * each
 */

// interface playable{
//     abstract void play();
// }
// class guitar implements playable{
//     public void play(){
//         System.out.println(1786);
//     }
// }
// class piano implements playable{
//     public void play(){
//         System.out.println("Sourcer");
//     }
// }
// public class each {

//     public static void main(String[] args) {
//         piano n=new piano();
//         guitar v=new guitar();
//         n.play();
//         v.play();
//     }
// }

/**
 * each
 */

// interface printable{
//     abstract void disp();
// }
// interface showable{
//     public void disp();
// }
// class v implements printable , showable{
//     public void disp(){
//         System.out.println("Last");
//     }
// }

// public class each {

//     public static void main(String[] args) {
//         v n=new v();
//         n.disp();       
//     }
// }

//LAmbda interface

/**
 * each
 */
// interface nv{
//     abstract void disp();
// }
// public class each {

//     public static void main(String[] args) {
//         nv same = ()->{
//                 System.out.println("Torture");

//         };
//         same.disp();

//     }
// }

/**
 * each
 */
// import java.util.Scanner;
// public class each {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         try{
//         int a=sc.nextInt();
//         int b=10/0;
//         }
//         catch(InputMismatchException e){
//             System.out.println("NOt Worth");
//         }
//         catch(ArithmeticException e){
//             System.out.println("Arithmetic repair" + e);
//         }
//         System.out.println("Straight");

//     }
// }
import java.util.*;
// class each{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String n="programming";
//         char ch = sc.next().charAt(0);
// class each{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int c=0;
//         try{
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//          c=a/b;
//         }
//         catch(ArithmeticException e){
//             System.out.println("Not divisible by '0'");
//         }
//         catch(InputMismatchException v){
//             System.out.println("Not valid number");
            
//         }
//         finally{
//             System.out.println("Thunder");
//         }
//         System.out.println(c);
        
        
//     }
// }