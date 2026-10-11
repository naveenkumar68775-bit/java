// class name{
//     name(){
//         System.out.println("thunder");
//     }
// }
// class boy extends name{
//     void boy(){
//         System.out.println("Lightning");
//     }
//     void runing(){
//         System.out.println("running");
//     }
// }
// class girl extends boy{
//     void thirl(){
//         System.out.println("Flash");
//     }
//     @Override 
//     void runing(){
//         System.out.println("running");
//     }
    
// }

// class name{
//     void revi(){
//         System.out.println("1ST");
//     }
// }
// class girl extends name{
//     void revi(){
//         System.out.println("2ND");
//     }
// }
// public class Linked {
//     public static void main(String[] args) {
//         name place = new girl();
//         place.revi();
//         name pla=new name();
//         pla.revi();

//     }   
// }

// abstract class name{
//     abstract void value();
// }
// class naveen extends name{
//     void value(){
//         System.out.println("Thunder");
//     }
// }
// class god extends naveen{
//     void value(){
//         System.out.println("Is Back");
//     }
// }
// class Linked{
//     public static void main(String[]args){
//         god v=new god();
//         naveen n=new naveen();
//         n.value();
//         v.value();
//     }
// }

// class name{
//     name(){
//         System.out.println("Naveen");
//     }
// }
// class dept extends name{
//     void place(){
//         System.out.println("IT");
//     }
// }
// class clg extends name{
//     clg(){
//         System.out.println("SSCET");
//         super();
//     }
// }

// class Linked{
//     public static void main(String[] args) {
//         clg v=new clg();
        
        
//     }
// }

// class thunder extends Thread{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("Thunder");
//         }
//     }
// }
// class light extends Thread{
//     public void run(){
//         for(int i=0;i<=100;i++){
//             System.out.println("Light");
//         }
//     }
// }
// class Linked{
//     public static void main(String[] args) {
//         light L=new light();
//         thunder T=new thunder();
//         T.start();
//         L.start();

        
//     }
// }

// interface thunder extends Runnable{
//     public void run(){
//     }

// }
// class Linked{
//     public static void main(String[] args) {
//         Runnable r=new thunder();
        
//     }
// }

// class thunder {
//     private int num=0;
//     // private String name; 
    
    
//     public void setNum(int num){
//         this.num=num;
//     }
//     public int getNum(){
//         return num;
//     }
// }
// class Linked{
//     public static void main(String[] args) {
//         thunder n=new thunder();
//         n.setNum(10);
//         System.out.println(n.getNum());
//         // n.Setplace();

//     }
// }