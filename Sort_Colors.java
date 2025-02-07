class Solution {
    public void sortColors(int[] nums) {
       /* int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }*/
        int c0 = 0;
        int c1 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                c0++;
            }
            else if(nums[i] == 1){
                c1++;
            }
        }

        int i=0;
        while(c0!=0){
            nums[i] = 0;
            c0--;
            i++;
        }
        while(c1!=0){
            nums[i] = 1;
            c1--;
            i++;
        }
        while(i<nums.length){
            nums[i] = 2;
            i++;
        }
    }
}
