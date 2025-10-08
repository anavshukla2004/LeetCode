class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m;   
        for(int i=0;i<m+n;i++){
            if(i>m-1){
                nums1[i]=0;
            }
        }
        for(int j=0;j<n;j++){
            nums1[l]=nums1[l]+nums2[j];
            l++;
        }
        Arrays.sort(nums1);
    }
}

       
