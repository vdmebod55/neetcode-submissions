class Solution {
    public int removeElement(int[] nums, int val) {
        int equal_val = 0;
        int i_final = 0;
        for(int i=0; i<nums.length; i++){
            //System.out.println("6: i: "+i);
            if(nums[i]==val || nums[i]==-1){
                
                if(nums[i]==val) equal_val++;
                //System.out.println("9: equal_val: "+equal_val);
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]!=val && nums[j]!=-1){
                        nums[i] = nums[j];
                        nums[j] = -1;
                        //System.out.println("14: nums: "+Arrays.toString(nums));
                        break;
                    }
                }
            }
            /*else if(nums[i]==-1){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]!=val && nums[j]!=-1){
                        nums[i] = nums[j];
                        nums[j] = -1;
                        //System.out.println("24: nums: "+Arrays.toString(nums));
                        break;
                    }
                }
            }*/
        }
        return nums.length-equal_val;
    }
}