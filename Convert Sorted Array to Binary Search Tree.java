class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        return create(nums, 0,len-1);
    }
    public TreeNode create(int[] nums , int start , int end){
        if(start > end){
            return null;
        }
        int mid = (start+end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = create(nums,start , mid-1);
        root.right = create(nums,mid+1 ,end);
        return root;
    }
}
