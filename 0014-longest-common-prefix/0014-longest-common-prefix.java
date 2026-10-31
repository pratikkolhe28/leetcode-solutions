class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder str = new StringBuilder();
        int minLength = Math.min(first.length(), last.length());

        for(int i = 0; i < minLength; i++) {
            if(first.charAt(i) == last.charAt(i)) {
                str.append(first.charAt(i));
            } else {
                break;
            }
        }

        return str.toString();
    }
}