public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {};
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// 1st solution
//public class Solution{
//    public TreeNode sortedArrayToBST(int[] nums){
//        TreeNode root;
//        root = aToBTS(nums, 0, nums.length -1);
//        return root;
//    }
//
//    private TreeNode aToBTS(int[] nums, int start, int end){
//        if (start > end) return null;
//        int mid = (end + start) / 2;
//        TreeNode n = new TreeNode(nums[mid]);
//        n.left = aToBTS(nums, start, mid -1);
//        n.right = aToBTS(nums, mid + 1, end);
//        return n;
//    }
//}


// 2nd Solution
public class Solution{
    public TreeNode sortedArrayToBST(int[] nums){
        int start = 0;
        int end = nums.length-1;
        TreeNode head = helper(nums, start, end);
        return head;
    }

    public TreeNode helper(int[] nums, int start, int end){
        if(start > end) return null;
        int mid = (end + start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid -1);
        node.right = helper(nums, mid +1, end);
        return node
    }
}

