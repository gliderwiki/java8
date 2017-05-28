package algorithm.bst;

/**
 * @Author : yion
 * @Date : 2017. 5. 28.
 * @Description :
 * 현재 노드를 D, 왼쪽 노드를 L, 오른쪽 노드를 R이라 하면
 * 전위순회 : DLR
 * 중위순회 : LDR
 * 후위순회 : LRD
 */

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

