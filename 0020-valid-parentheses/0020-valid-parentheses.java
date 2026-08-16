class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(stack.isEmpty()) {
                    return false;
                }

                char ch = stack.pop();

                if(s.charAt(i) == ')' && ch != '(' || 
                    s.charAt(i) == '}' && ch != '{' ||
                    s.charAt(i) == ']' && ch != '[') {
                        return false;
                    }
            }
        }

        if(stack.isEmpty()) return true;
        else return false;
    }
}