#include <string> 

class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> ans;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                ans.push_back("FizzBuzz");
              //  ans[i]=;
                continue;
            }
              if(i%3==0){
                 ans.push_back("Fizz");
                //ans[i]="Fizz";
                continue;
            }
            if(i%5==0) {
                 ans.push_back("Buzz");
               // ans[i]="Buzz";
                continue;
            }
            ans.push_back(to_string(i));
        }
        return ans;
    }
};