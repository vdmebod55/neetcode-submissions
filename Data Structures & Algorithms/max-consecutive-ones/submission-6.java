class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int out_consecutives = 0;
        int in_consecutives = 0;
        int max_consecutives = 0;
        for(int i=0; i<nums.length; i++) {
            System.out.println("i = "+i);
            if(nums[i]==0){
                //max_consecutives = Math.max(round_consecutives, max_consecutives);
                out_consecutives = 0;
                int forward = Math.min(i+max_consecutives+1, nums.length-1);
                SecondFor: for(int j=forward; j<nums.length; j++) {
                    System.out.println("j = "+j);
                    if(nums[j]==0) {
                        i = j;
                        break;
                    }
                    else{
                        if(j==forward){
                            for(int k=i+1; k<forward; k++){
                                System.out.println("k = "+k);
                                if(nums[k]==0){
                                    i = k;
                                    break SecondFor;
                                }
                            }
                            if(i+1<nums.length-1 && forward==i+max_consecutives+1){
                                max_consecutives++;
                                System.out.println("28: max_consecutives = "+max_consecutives);
                            }
                        }
                        else{
                            max_consecutives++;
                            System.out.println("32: max_consecutives = "+max_consecutives);
                        }
                    }
                }
            }
            else {
                out_consecutives++;
                max_consecutives = Math.max(out_consecutives, max_consecutives);
            }
        }

        return max_consecutives;
    }
}