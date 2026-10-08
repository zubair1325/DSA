public class StringCompression {
    public static int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (int j = 0; j < countStr.length(); j++) {
                    chars[write++] = countStr.charAt(j);
                }
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char ch[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(ch));
    }
}
