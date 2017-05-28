package algorithm.bst;

/**
 * @Author : yion
 * @Date : 2017. 5. 28.
 * @Description : 계층적 자료 구조로써, 저장할 데이터의 크기에 따라 노드의 위치를 정의한것으로 현재 노드보다 작으면 왼쪽 크면 오른쪽에 위치(배열, 연결리스트 이용)
 * (1) 모든 원소는 서로 다른 유일한 키를 갖는다.
 * (2) 왼쪽 서브 트리에 있는 원소의 키는 그 루트의 키보다 작다.
 * (3) 오른쪽 서브 트리에 있는 원소의 키는 그 루트의 키보다 크다.
 * (4) 왼쪽 서브 트리와 오른쪽 서브 트리도 이진탐색 트리다.
 *
 * 용어
 * 깊이 : 루트노드에서 해당 노드까지의 경로의 길이
 * 레벨 : 깊이가 같은 노드들의 집합
 * 차수 : 해당 노드의 자식 노드의 수
 * 길이 : 출발 노드에서 목적 노드까지의 거리
 */
public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public void insert(int value) {
        if (root == null) {
            this.root = new TreeNode(value);
        } else {
            this.root = insert(this.root, value);
        }
    }

    private TreeNode insert(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        } else if (node.value < value) { // 주어진 값이 클 경우 노드의 오른쪽 트리로 위치함
            node.right = insert(node.right, value);
        } else if (node.value > value) { // 주어진 값이 노드값보다 작은 경우 노드의 왼쪽에 위치함
            node.left = insert(node.left, value);
        }
        return node;
    }

    public void printRightToLeft(TreeNode node) {
        if (node != null) {
            if (node.right != null) {
                printRightToLeft(node.right);
            }
            System.out.println("right - " + node.value);
            if (node.left != null) {
                printRightToLeft(node.left);
            }
        }
    }

    public void printLeftToRight(TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                printLeftToRight(node.left);
            }

            System.out.println("left - " + node.value);

            if (node.right != null) {
                printLeftToRight(node.right);
            }
        }
    }

    public void delete(int value) {
        this.root = delete(this.root, value);
    }

    private TreeNode delete(TreeNode node, int value) {

        if (node.value < value) {
            node.right = delete(node.right, value);
        } else if (node.value > value) {
            node.left = delete(node.left, value);
        } else {
            if (node.right == null) {
                return node.left;
            }

            if (node.left == null) {
                return node.right;
            }

            TreeNode temp = node;
            node = min(temp.right);
            node.right = deleteMin(temp.right);
            node.left = temp.left;

        }

        return node;
    }

    private TreeNode deleteMin(TreeNode node) {
        if (node.left == null) {
            return node.right;
        }

        node.left = deleteMin(node.left);
        return node;
    }

    private TreeNode min(TreeNode node) {
        if (node.left == null) {
            return node;
        } else {
            return min(node.left);
        }
    }


}
