import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public static List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();

            while(size>0){
                TreeNode temp = q.poll();
                list.add(temp.val);
                size --;
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            ans.add(list);

        }return ans;

    }


    public static void main(String[] args) {

    }
}
