class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean first = true;

        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ' && first) {
                continue;
            } else {
                first = false;
                if(s.charAt(i) == ' ') break;
                length = length + 1;
            }
        }

        return length;
    }
}