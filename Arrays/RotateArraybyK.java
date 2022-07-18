//naive method using function call to the same function k times which rotates the array by one:

class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k = k%n;
        for(int i=0;i<k;i++){
            rotatebyone(nums,n);
        }
       
    }
    public static void rotatebyone(int[] arr,int n){
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0] = temp;
        
        }
}


//using reverse function in parts of the array:

// left rotate:

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int nums[], int k, int n)
    {
       
        k = k%n;
        
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
    static void reverse(int[] nums,int i,int j){
        int temp = 0;
        while(i<j){
            
             temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
            
            
        }
    }
        
}

//right rotate:

class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k = k%n;
        
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
			}
    static void reverse(int[] nums,int i,int j){
        int temp = 0;
        while(i<j){
            
             temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
            
            
        }
    }
}

// Leetcode practice link : https://leetcode.com/problems/rotate-array/