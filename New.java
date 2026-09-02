import java.util.*;

class New {

    public static void main(String[] args) {

        int[] input = {10, 20, 30, 20, 10};

        HashMap<Integer, Integer> v = new HashMap<>();

        for (int i = 0; i < input.length; i++) {

            if (v.containsKey(input[i])) {
                v.put(input[i], v.get(input[i]) + 1);
            } else {
                v.put(input[i], 1);
            }
        }

        System.out.println(v);
    }
}
