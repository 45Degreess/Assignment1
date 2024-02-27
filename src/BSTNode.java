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

    public void setLeft(BSTNode inLeft)
    {
        left = inLeft;
    }

    public void setRight(BSTNode inRight)
    {
        right = inRight;
    }

    public void setData(dataType inData)
    {
        data = inData;
    }
}
