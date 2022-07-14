public class CaesarsCode {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (char c : chars) {
            if (c != ' ') {
                // 소문자
                if (c >= 'a') {
                    c = (char) ((c - 'a' + n) % 26 + 'a');
                } else {
                    c = (char) ((c - 'A' + n) % 26 + 'A');
                }
            }
            System.out.println(String.valueOf(c));

            sb.append(String.valueOf(c));
        }

        return sb.toString();
    }

}
