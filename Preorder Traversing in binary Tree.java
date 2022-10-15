class preorder {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(6);
        TreeNode sixth = new TreeNode(9);
        
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=sixth;
        fourth.left=fifth;
    }
    
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        preorder h = new preorder();
        h.createBinaryTree();
        h.preOrder(h.root);
        
    }
}
