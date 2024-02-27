public class BSTNode<dataType>
{
    private dataType data;
    private BSTNode<dataType> left;
    private BSTNode<dataType> right;

    public BSTNode(dataType data,BSTNode left,BSTNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BSTNode<dataType> getLeft()
    {
        return left;
    }

    public BSTNode<dataType> getRight()
    {
        return right;
    }

    public dataType getData()
    {
        return data;
    }
}
