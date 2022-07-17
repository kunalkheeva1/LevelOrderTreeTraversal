import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// tree node
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LevelOrderTreeTraversal {
    // method to return list of lists(containing the tree nodes level wise)
    public static List<List<Integer>> levelOrderTraversal(TreeNode root){

        // get a list of list
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        //queue will add the nodes first
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        //until the queue is empty
        while(!q.isEmpty()){
            // get the current size of queue and traverse
            int size = q.size();
            // get a list to add the values of the nodes in it
            ArrayList<Integer> list = new ArrayList<>();
                // until size of queue becomes 0
            while(size>0){
                // poll the element from queue and then add its value in list and decrease the size
                TreeNode temp = q.poll();
                list.add(temp.val);
                size --;
                // but if it has right or left child as well then add them in the queue as well
                // after this return back to the line number 31 and repeat if there is more
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            // also dont forget to add it in the list of lists
            ans.add(list);

        }// at the end simply return it thanks
        return ans;

    }


    public static void main(String[] args) {

    }
}
