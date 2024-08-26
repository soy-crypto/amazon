class Solution 
{
public:
    vector<int> twoSum(vector<int>& nums, int target) 
    {
        //Base Check
        if(nums.empty() == true)
        {
            return {};
        }

        //Init
        int LEN = nums.size();

        /* Define a map */
        map<int, int> map = {};
        for(int i = 0; i < LEN; i++)
        {
            if(map.find(nums[i]) == map.end())
            {
                map.insert({nums[i], i});
            }
            else 
            {
                map[nums[i]] = i;
            }

        }// 

        /* pairs*/
        vector<int> values = {};

        //Compute the sum of the two numbers
        for(int i = 0; i < LEN; i++)
        {
            int another = target - nums[i];
            if(map.find(another) != map.end() && i != map[another])
            {
                values.push_back(i);
                values.push_back(map[another]);
                break;
            }

        }//

        //Result
        vector<int> result = values;

        //Return
        return result;
            
    }//

};