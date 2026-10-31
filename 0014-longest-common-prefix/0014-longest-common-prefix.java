// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);
//         String first = strs[0];
//         String last = strs[strs.length - 1];
//         StringBuilder str = new StringBuilder();
//         int minLength = Math.min(first.length(), last.length());

//         for(int i = 0; i < minLength; i++) {
//             if(first.charAt(i) == last.charAt(i)) {
//                 str.append(first.charAt(i));
//             } else {
//                 break;
//             }
//         }

//         return str.toString();
//     }
// }
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Assume the first string is the entire prefix
        String prefix = strs[0];
        
        // Compare it with the rest of the strings one by one
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) return "";
            }
        }
        
        return prefix;
    }
}
