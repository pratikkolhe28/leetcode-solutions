class Solution {
    public String reverseStr(String s, int k) {
        int left = 0;
        int right;
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i += 2*k) {
            left = i;
            right = Math.min(i + k, s.length());

            while(left < right) {
                char ch = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right-1));
                sb.setCharAt(right-1, ch);
                left++;
                right--;
            }
        }

        return sb.toString();
    }
}