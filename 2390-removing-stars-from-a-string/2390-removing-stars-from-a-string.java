class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '*') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for(char ch : stack) {
            result.append(ch);
        }

        return result.reverse().toString();
    }
}