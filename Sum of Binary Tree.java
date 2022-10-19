class HelloWorld {
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

    public static int SumNode(TreeNode root){
         if(root==null){
          return 0;
      }
      int Sumleft = SumNode(root.left);
      int Sumright = SumNode(root.right);
        return Sumleft+Sumright+root.data;
    }
   
    public static void main(String[] args) {
    HelloWorld h = new HelloWorld();
    h.createBinaryTree();
    System.out.println(SumNode(root));
        
    }

}
