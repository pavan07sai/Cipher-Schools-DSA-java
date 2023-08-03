class BSTNode{
    int data;
    BSTNode left;
    BSTNode right;
    BSTNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Main
{
    BSTNode root;
    BST(){
        root = null;
    }
    BST(int data){
        this.root = new BSTNode(data);
    }
    
    BSTNode search(BSTNode root, int data){
        if(root == null) return null;
        if(root.data == data) return root;
        if(data<root.data){
            search(root.left, data);
        }
        else{
            search(root.right, data);
        }
    }
    
    boolean searchItr(BSTNode root, int data){
        if(root == null) return false;
        
        while(){
            
        }
        if(data == root.data){
            return true;
        }
        
        else if(data<root.data){
            root = root.left;
        }
        else{
            root = root.right;
        }
        
    }
    return false;
}
	public static void main(String[] args) {
	    BST bst = new BST(15);
	    bst.root.left = new BSTNode(10);
	    bst.root.right = new BSTNode(20);
	    bst.root.left.left = new BSTNode(8);
	    bst.root.left.right = new BSTNode(12);
	    BSTNode res = bst.search(bst.root, 12);
	    System.out.println(res);
		
	}
}
