// class student{
//     String name="naveen";
//     int age=20;
// }
// class oops{
//     public static void main(String[]args){
//         student s=new student();
//         System.out.println(s.name +" : "+ s.age);
//     }
// }
import  java.util.Scanner;
// class student{
//     student(String a,int b){
//         System.out.println(a +" : "+b);
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String a=sc.nextLine();
//         int  b=sc.nextInt();
//         student s=new student(a,b);
        
//     }
// }

// class animal{
//     void sound(){
//         System.out.println( " sound");
//     }
// }
// class dog extends animal{
//     void dog(){
//     System.out.print("dog");
//     super.sound();
//     }}

// public class oops {

//     public static void main(String[] args) {
//         dog d=new dog();
//         d.dog();
        
//     }
// }

/**
 * oops
 */

// class admin{
//     void add(int a,float b){
//         System.out.println(a +" : "+b);
//     }
//     void add(int a,int b){
//         System.out.println(a +" : "+b+" : ");
//     }
// }
// public class oops {
//     public static void main(String[] args) {
//         admin a=new admin();
//         a.add(10,30);
//     }
// }

// class anima{
//     void sound(){
//         System.out.print(" barks");
//     }
// }

// class dog extends anima{
//     void sound(){
//         System.out.print("Dog");
//         super.sound();
//     }
// }
// class oops{
//     public static void main(String[] args) {
//         dog d=new dog();
//         d.sound();
//     }
// }

/**
 * oops
 */
// abstract class  shape{
//     abstract void area();
// }
// class  thunder extends shape{
//     int r;
//     thunder (int a){
//         r=a;
//     }
//    void area(){
//     double total = 3.14*(r*r);
//     System.out.println(total);
//    }

// }
// public class oops {
//     public static void main(String[] args) {
//         thunder t=new thunder(5);
//         t.area();
//     }
// }

interface payment{
    void pay(int v);
}

class upi implements payment{
    public  void pay(int v){
        System.out.println("Payment of "+ v+" Successful..");

    }
}
class oops{
    public static void main(String []args){
        upi n=new upi();
        n.pay(1000);

    }
}
