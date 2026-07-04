interface shape{
    void say();
}
class poly{
    public static void main(String[] args) {
        shape s=()->System.out.println("HELLO");
        s.say();
    }
}