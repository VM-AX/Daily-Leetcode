class Solution {
    public void moveZeroes(int[] nums) {
       int second = 0;
       int first = 0;
       int temp;
        while(second < nums.length){
            if(nums[second]!=0){
                temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
                first++;
                second++;
            }else{
                second++;

            }
        }
    }
}