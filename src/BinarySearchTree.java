public class BinarySearchTree<dataType>
{
    BSTNode<dataType> root;

    public BinarySearchTree()
    {
        root =null;
    }

    //Gets the numbers of parts from the root node to the lowest leaf node ie the height of a tree
    public int getHeight()
    {
        return getHeight(root);
    }

    private int getHeight(BSTNode<dataType> node)
    {
        if (node ==null)
            return -1;
        else
            return 1 + Math.max(getHeight(node.getLeft()),getHeight(node.getRight()));
    }

    //Find the size of the tree ie the number of nodes in the tree

    public int getSize()
    {
        return getSize(root);
    }

    private int getSize(BSTNode<dataType> node)
    {
        if(node ==null)
            return 0;
        else
            return 1 + getSize(node.getLeft()) + getSize(node.getRight());
    }
}
