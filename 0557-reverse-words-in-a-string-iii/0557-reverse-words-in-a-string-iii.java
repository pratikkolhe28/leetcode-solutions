class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            StringBuilder newStr = new StringBuilder();

            while(i < s.length() && s.charAt(i) != ' ') {
                newStr.append(s.charAt(i));
                i++;
            }

            sb.append(newStr.reverse());

            if(i < s.length()) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }
}