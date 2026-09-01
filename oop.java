// class oop{
//     String v;
//     oop(int r,String name,int age){
//         // System.out.println(v +" " + name +" "+ age);
//         v=name;
//     }
//     public static void main(String[] args) {
//         oop a=new oop(01,"NAVEEN",20);
//         System.out.println(a.v);
//     }
// }

// class oop{
//     String name;
//     oop (){
//         System.out.println("HEllo ");
//     }
//     void run(String name){
//         this.name =name;
//     }
//     public static void main(String[] args) {
//         oop v=new oop();

//         v.run("Revathi");
//         System.out.println(v.name);
//     }
// }

// class oop {
//     void num(int n){
//         if(n%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
//     public static void main(String[] args) {
//         int n=8;
//         oop o=new oop();
//         o.num(n);
//     }
// }

// class oop{
//     String mark(int n){
//         if(n>=35){
//         return "pass";
//         }
//         else{
//             return "Fail";
//         }
//     }
//     public static void main(String[] args) {
//         int n=4;
//         oop ol=new oop();

//         String s=ol.mark(n);
//         System.out.println(s);
//     }
// }


// inheritance

// class car {
//     String value;

// }
// class nav extends car{
//     String name;
// }
// public class oop{
//     public static void main(String[]args){
//         nav v=new nav();
//         v.name="Naveen";
//         v.value="Correct";
//         System.out.println(v.name);
//     }
// }

// class a{
//     String name="Itachi";
// }
// class b extends a{
//     String place = "Leaf village";
// }
// class c extends b{
//     String clan ="Uchiha";
// }

// class oop{
//     public static void main(String[] args) {
//         c var=new c();
//         System.out.println(var.clan);
//         System.out.println(var.name);
//         System.out.println(var.place);
//     }
// }

// class anime{
//     void a(){
//         System.out.println("Dragon Ball");
//     }
// }
// class hero extends anime{
//     void v(){
//         System.out.println("Goku");
//     }
// }
// class villan extends hero{
//     void c(){
//         System.out.println("Vegeta");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         villan var = new villan();
//         var.v();
//       var.c();
//         var .a();

//     }
// }

// class animal{
//     String name;
//     int age;

//     void makesound(){
//         System.out.println("Animal make sound");
//     }
// }
// class dog extends animal{
//     String breed;

//     void makesound(){
//         System.out.println("Dog barks");
//     }
//     void fetch(){
//         System.out.println("Dog is fetching");
//     }
// }
// class cat extends animal{
//     String var;

//     void makesound(){
//         System.out.println( "Cat meows");
//     }
//     void climb(){
//         System.out.println("cat is climbing");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         dog it=new dog();
//         it.name="Wizard";
//         it.age=15;
//         it.breed = "Bow Bow";
//         it.makesound();
//         it .fetch();
//         cat v=new cat();
//         v.makesound();
//         v.climb();

//     }
// }

// class vehicle{
//     String brand ;
//     int year;

//     void startengine(){
//         System.out.println("Vehicle starts");
//     }
// }
// class car extends vehicle{
//     String type;

//     void startengine(){
//         System.out.println("Car engine starts");
//     }
//     void drive(){
//         System.out.println("Car is driving");
//     }
// }
// class truck extends vehicle{
//     int capacity;

//     void startengine(){
//         System.out.println("Truck engine starts");
//     }
//     void haul(){
//         System.out.println("Truck is Hauling");
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         car c= new car();
//         c.brand ="Tata";
//         c.startengine();
//         c.year=2001;
//         System.out.println(c.brand);
//         System.out.println(c.year);
        
//         c.startengine();
//         c.type ="Indica";
//         c.drive();
//         System.out.println(c.type);
        

//         truck t= new truck();
//         t.capacity = 2000;
//         t.haul();
//         System.out.println(t.capacity);

//     }
// }

// class animal {
//     int age=2;
//     animal( String name){
//         System.out.println();
//         System.out.println("Arrives");
//     }
//     void sound(){
//         System.out.println("Make sound");
//     }
// }
// class dog extends animal{
//     dog(){
        
//         super("");
//         super.sound();
//         System.out.println("Later");
//         System.out.println(age);
        
//     }
// }

// class oop{
//     public static void main(String[] args) {
//         dog v= new dog();
      
//     }
// }

// class person{
//     String name;
//     person(String name){
//         this.name=name;

//     }
// }
// class employee extends person{
//     employee(String name){
//     super(name);
//     }
// }
// class oop{
//     public static void main(String[] args) {
//         employee var=new employee("Thunder");
//     }
// }

// class Car {
//    Car() {
//         System.out.println("Speed = 1");
//     }
// }

// class Car2 extends Car {
    
//     Car2() {
//         System.out.println("Speed = 2");
//     }
// }

// class Car3 extends Car {
    
//     Car3() {
//         System.out.println("Speed = 3");
//     }
// }

// public class oop{
//     public static void main(String[] args) {

//         Car c1 = new Car2();
//         Car c2 = new Car3();
        

//     }
// }

// class oop{
//     public static void main(String []args){
//         String s="naveen";
//         char a[]=s.toCharArray();
//         String v="";
//         String c="";
//         for(int i=0;i<a.length;i++){
//             char ch=s.charAt(i);
//             if(ch=='a' || ch=='e'||ch=='i' || ch=='o' || ch=='u'){
//                 v=v+ch;
//             }
//             else{
//                 c=c+ch;
//             }
//         }
//         System.out.println("vowels: "+v);
//         System.out.println("Consonant: "+c);
//     }
// }

/**
 * oop
 */
public class oop {

    public static void main(String[] args) {
        // int a=5;
        // int b=10;
        // a++;
        // b++;
        // System.out.println(a++ +b);
        //         System.out.println(a++ + ++b);

    }
}