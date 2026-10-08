public class RemoveDuplicateString {
    public static StringBuilder removeDuplicate(String s, StringBuilder sb, int i, boolean a[]) {
        if (s.length() == i) {
            return sb;
        }
        if (a[s.charAt(i) - 'a'] == true) {
            return removeDuplicate(s, sb, i + 1, a);
        } else {
            a[s.charAt(i) - 'a'] = true;
            return removeDuplicate(s, sb.append(s.charAt(i)), i + 1, a);
        }
    }

    public static void main(String[] args) {
        String s = "apnacollege";
        boolean a[] = new boolean[26];
        StringBuilder x = new StringBuilder("");
        StringBuilder sb = removeDuplicate(s, x, 0, a);
        System.out.println(sb);
    }
}
