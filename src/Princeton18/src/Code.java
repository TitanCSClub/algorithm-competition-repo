public class Code {
    public static void main(String[] args) {
        String s = "amigdexaul";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 110) {
                char c = s.charAt(i);
                boolean vowel = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
                if (vowel) {
                    continue;
                } else {
                    sum += s.charAt(i);
                }
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
