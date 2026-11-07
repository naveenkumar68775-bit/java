import java.util.*;

class Solution {

    public List<String> addOperators(String num, int target) {

        List<String> result = new ArrayList<>();

        backtrack(result, new StringBuilder(), num, target, 0, 0, 0);

        return result;
    }

    void backtrack(List<String> result, StringBuilder path,
                   String num, long target, int index,
                   long value, long prev) {

        if (index == num.length()) {
            if (value == target) {
                result.add(path.toString());
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {

            if (i != index && num.charAt(index) == '0')
                break;

            String str = num.substring(index, i + 1);
            long n = Long.parseLong(str);

            int len = path.length();

            if (index == 0) {

                path.append(str);
                backtrack(result, path, num, target,
                          i + 1, n, n);
                path.setLength(len);

            } else {

                // Addition
                path.append("+").append(str);
                backtrack(result, path, num, target,
                          i + 1, value + n, n);
                path.setLength(len);

                // Subtraction
                path.append("-").append(str);
                backtrack(result, path, num, target,
                          i + 1, value - n, -n);
                path.setLength(len);

                // Multiplication
                path.append("*").append(str);
                backtrack(result, path, num, target,
                          i + 1,
                          value - prev + prev * n,
                          prev * n);
                path.setLength(len);
            }
        }
    }
}
