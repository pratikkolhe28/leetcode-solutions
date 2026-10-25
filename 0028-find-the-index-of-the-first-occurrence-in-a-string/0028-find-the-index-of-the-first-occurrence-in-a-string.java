// class Solution {
//     public int strStr(String haystack, String needle) {
//         if(haystack.length() < needle.length()) {
//             return -1;
//         }

//         for(int i = 0; i <= haystack.length() - needle.length(); i++) {
//             if(haystack.charAt(i) == needle.charAt(0)) {
//                 int cnt = 1;
//                 int index = i;
//                 for(int j = 1; j < needle.length(); j++) {
//                     if(needle.charAt(j) == haystack.charAt(i+j)) {
//                         cnt++;
//                     } else {
//                         break;
//                     }
//                 }

//                 if(cnt == needle.length()) {
//                     return index;
//                 }
//             }
//         }

//         return -1;
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
        