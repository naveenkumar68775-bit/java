import java.util.*;
// public class solution {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//     list.add("Java");
//     list.add("Python");
//     list.add("Java");

// System.out.println(list);
// System.out.println(list.get(0));
//     }
// }


class solution
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1786);
        list.add(2006);
        list.add(3020);
       
        list.add(1,688);
         System.out.println(list);
         list.remove(1);
        list.set(0, 6626);
        list.addFirst(111);
        for(int i: list){
            System.out.println(i);
        }
       


    }
}

// class solution{
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.add(1);
//         list.add(2);
//         list.addFirst(0);
//         System.out.println(list);
//         list.addLast(111);
//         System.out.println(list);
//         list.removeFirst();
//         System.out.println(list);
//         list.removeLast();
//         System.out.println(list);
//     }
// }