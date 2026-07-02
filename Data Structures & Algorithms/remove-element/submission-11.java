class Solution {
    public int removeElement(int[] nums, int val) {
        int equal_val = 0;
        int i_final = 0;
        int bigO = 0;
        for(int i=0; i<nums.length; i++){
            bigO++;
            if(nums[i]==val || nums[i]==-1){
                if(nums[i]==val) equal_val++;
                for(int j=i+1; j<nums.length; j++){
                    bigO++;
                    if(nums[j]!=val && nums[j]!=-1){
                        nums[i] = nums[j];
                        nums[j] = -1;
                        break;
                    }
                }
            }
        }
        System.out.println("bigO = "+bigO);
        return nums.length-equal_val;
    }
}