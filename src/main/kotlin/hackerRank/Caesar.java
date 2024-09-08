package hackerRank;

public class Caesar {

    public static String caesarCipher(String s, int k) {
        // Write your code here
        int namuji = k % 26;
        int stringLength = s.length();
        StringBuilder sb = new StringBuilder();

        if(namuji == 0) {
            return s;
        }

        for(int i = 0; i < stringLength; i++) {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                char c = (char) (s.charAt(i) + namuji);
                if(c > 122) {
                    c -= 26;
                }
                sb.append(c);
            } else if(s.charAt(i) >=64 && s.charAt(i) <= 90) {
                char c = (char) (s.charAt(i) + namuji);
                if(c > 90) {
                    c -= 26;
                }
                sb.append(c);
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();


    }
}

