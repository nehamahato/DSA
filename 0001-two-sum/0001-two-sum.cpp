#include <unordered_map>

typedef std::unordered_map<int, int> umap;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        umap m;
        int diff;
        
        vector<int> res;
        
        for(int i = 0; i<nums.size(); i++) {
            diff = target - nums[i];
            if(m.find(diff) != m.end()) {
                res.push_back(m[diff]);
                res.push_back(i);
                break;
            } else {
                m[nums[i]] = i;
            }
        }
        
        return res;
    }
};