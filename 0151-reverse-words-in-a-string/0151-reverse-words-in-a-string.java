class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if(sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }

        if(sb.length() > 0) {
            list.add(sb.toString());
        }

        StringBuilder string = new StringBuilder();

        for(int i = list.size() - 1; i >= 0; i--) {
            string.append(list.get(i));

            if(i > 0) {
                string.append(" ");
            }
        }

        String st = string.toString();
        return st;
    }
}