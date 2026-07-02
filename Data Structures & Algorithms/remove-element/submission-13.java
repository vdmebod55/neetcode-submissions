class Solution {
    public int removeElement(int[] nums, int val) {
        int equal_val = 0;
        int i_final = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val || nums[i]==-1){
                if(nums[i]==val){
                    equal_val++;
                } 
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]!=val && nums[j]!=-1){
                        nums[i_final] = nums[j];
                        i_final++;
                        nums[j] = -1;
                        i = j-1;
                        break;
                    }
                    else if(nums[j]==val){
                        equal_val++;
                        if(j<nums.length-1) i = j-1; else i = j;
                    }
                }
            }
            else i_final++;
        }
        return nums.length-equal_val;
    }
}