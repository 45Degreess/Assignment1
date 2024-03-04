package App;

/**
 * Node of the BinarySearchTree
 * @param <dataType> data type of the node data
 */
public class BSTNode<dataType extends Comparable>
{
    /**
     * Data of the node
     */
    private dataType data;
    /**
     * Node to the left of the current node in the tree
     */
    private BSTNode<dataType> left;
    /**
     * Node to the right of the current node in the tree
     */
    private BSTNode<dataType> right;

    /**
     * Constructor method for node
     * @param data incoming data for the node
     * @param left incoming node to the left of the current node
     * @param right incoming node to the right of the current node
     */
    public BSTNode(dataType data,BSTNode left,BSTNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * @return the node to the left of the current node
     */
    public BSTNode<dataType> getLeft()
    {
        return left;
    }

    /**
     * @return the node to the right of the current node
     */
    public BSTNode<dataType> getRight()
    {
        return right;
    }


    /**
     * @return the data of the node
     */
    public dataType getData()
    {
        return data;
    }

    /**
     * Sets the value of the node to the left of current node
     * @param inLeft incoming value for left node
     */
    public void setLeft(BSTNode inLeft)
    {
        left = inLeft;
    }

    /**
     * Sets the value of the node to the left of current node
     * @param inRight incoming right node
     */
    public void setRight(BSTNode inRight)
    {
        right = inRight;
    }

    /**
     * Sets the value of the data of the current node
     * @param inData incoming node data
     */
    public void setData(dataType inData)
    {
        data = inData;
    }
}
