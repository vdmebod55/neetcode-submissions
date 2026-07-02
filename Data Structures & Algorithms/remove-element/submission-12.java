class Solution {
    public int removeElement(int[] nums, int val) {
        int equal_val = 0;
        int i_final = 0;
        int bigO = 0;
        for(int i=0; i<nums.length; i++){
            //System.out.println("7: i: "+i);
            bigO++;
            if(nums[i]==val || nums[i]==-1){
                if(nums[i]==val){
                    equal_val++;
                    //System.out.println("12: equal_val: "+equal_val);
                } 
                for(int j=i+1; j<nums.length; j++){
                    //System.out.println("15: j: "+j);
                    bigO++;
                    if(nums[j]!=val && nums[j]!=-1){
                        nums[i_final] = nums[j];
                        i_final++;
                        nums[j] = -1;
                        i = j-1;
                        //System.out.println("19 nums: "+Arrays.toString(nums));
                        //System.out.println("20: i: "+i);
                        break;
                    }
                    else if(nums[j]==val){
                        equal_val++;
                        if(j<nums.length-1) i = j-1; else i = j;
                        //System.out.println("29: i: "+i);
                        //System.out.println("28: equal_val: "+equal_val);
                    }
                }
            }
            else i_final++;
        }
        //System.out.println("bigO = "+bigO);
        return nums.length-equal_val;
    }
}