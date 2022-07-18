class Solution {
    int MissingNumber(int array[], int n) {
        int count = 0;
       for(int i =0;i<n-1;i++){
           count +=array[i];
       }
       return (n*(n+1))/2 - count;
    }
}


// GFG practice link: https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1