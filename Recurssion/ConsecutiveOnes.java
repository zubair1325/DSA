import java.util.*;

public class ConsecutiveOnes {
    public static List<String> validStrings(int n) {
        List<String> res = new LinkedList<>();

        validStringsHelper(n, "", 1, res);
        return res;

    }

    public static void validStringsHelper(int n, String sb, int last, List<String> res) {
        if (n == 0) {
            res.add(sb);
            return;
        }
        validStringsHelper(n - 1, sb + ("1"), 1, res);
        if (last == 1) {
            validStringsHelper(n - 1, sb + ("0"), 0, res);
        }
    }

    public static void main(String[] args) {

        List<String> res = validStrings(0);
        for (String r : res) {
            System.out.println(r);
        }

    }
}
