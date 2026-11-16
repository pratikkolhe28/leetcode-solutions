class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int length = s.length();

        while(length > k) {
            StringBuilder newStr = new StringBuilder();

            for(int i = 0; i < sb.length(); i+=k) {
                int sum = 0;
                int end = Math.min(i + k, sb.length());
                String group = sb.substring(i, end);

                for (int j = 0; j < group.length(); j++) {
                    char ch = group.charAt(j);
                    sum += Character.getNumericValue(ch);
                }

                newStr.append(sum);
            }

            sb.setLength(0);
            sb.append(newStr);
            length = sb.length();
        }

        return sb.toString();
    }
}