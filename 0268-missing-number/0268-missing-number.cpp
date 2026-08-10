class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int result;
        if(nums[0]==0 && nums.size()==1) return 1;
        unordered_map<int, int> mp{{0, 0}};
        sort(nums.begin(), nums.end());
        int max=nums[0];
        if(nums.size()==1) return 0;
        
        for(int i=0; i<n; i++){
            mp[nums[i]]++;
            if(nums[i]>max){
                max=nums[i];
            }
        }

        for(int i=nums[0]; i<=n; i++){
            if(mp[i]==0){
                result = i;
            }
        }
        return result;
    }
};