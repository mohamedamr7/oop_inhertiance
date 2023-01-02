public class BinaryTreeNode {
       private  char  value;
       public BinaryTreeNode left=null;
       public BinaryTreeNode right=null;

       //pre oder
       public void print()
       {

              System.out.print(this.value);

            //print left sub tree
              if (this.left!=null)
                     this.left.print();

              //print right sub tree
              if (this.right!=null)
                 this.right.print();

       }


}
