// interface shape{
//     void say();
// }
// class poly{
//     public static void main(String[] args) {
//         shape s=()->System.out.println("HELLO");
//         s.say();
//     }
// }
class star{
void run(){
        System.out.println("stark");
    }
}
    class game extends star{
        game(){
            System.out.println("Tony");
        }
    }
class poly{
    public static void main(String[] args) {
        game v=new game();
    
        v.run();
        
    }
}