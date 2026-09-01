// interface shape{
//     void say();
// }
// class poly{
//     public static void main(String[] args) {
//         shape s=()->System.out.println("HELLO");
//         s.say();
//     }
// }
// class star{
// void run(){
//         System.out.println("stark");
//     }
// }
//     class game extends star{
//         @Override void run(){
            
//             System.out.println("Tony");
//         }
//     }
// class poly{
//     public static void main(String[] args) {
//         star v=new game();
//         v.run();
        
//     }
// }
// class star {
//     void run() {
//         System.out.println("stark");
//     }
// }

// class game extends star {
//     @Override
    
//     void run() {
//         super.run();
//         System.out.println("Tony");
//     }
// }

// class poly {
//     public static void main(String[] args) {

//         star v = new game();

//         v.run();
//     }
// }

/**
 * Poly

*/
class gamer{
    static int a=10;
}
class poly {


    public static void main(String[] args) {
        System.out.println(gamer.a);
        
    }
}