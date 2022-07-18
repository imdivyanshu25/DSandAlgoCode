//naive approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    num[0] = i;
                    num[1] = j;
                }
            }
        }
        return num;
    }
}

// hashmap approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=target;
        int []a=new int[2];
        int i,j;
        int k=nums.length;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(i=0;i<k;i++)
        {
            if(map.containsKey(nums[i]))
            {
                a[0]=map.get(nums[i]);
                a[1]=i;
            }
            int difference=target-nums[i];
            map.put(difference,i);
        }
 
        return a;
    }
}

//Leetcode practice link: https://leetcode.com/problems/two-sum/