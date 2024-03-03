package App;

import java.util.ArrayList;

public class BinarySearchTree<dataType extends Comparable>
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

    //Inserts data in the tree
    public void insert(dataType d)
    {
        if(root ==null)
            root = new BSTNode<dataType>(d,null,null);
        else
            insert(d,root);
    }

    private void insert(dataType d,BSTNode node)
    {
        if(d.compareTo(node.getData()) <= 0)
        {
            if(node.getLeft() == null)
                node.setLeft(new BSTNode<dataType>(d,null,null));
            else
                insert(d,node.getLeft());
        }
        else
        {
            if(node.getRight() == null)
                node.setRight(new BSTNode<dataType>(d,null,null));
            else
                insert(d,node.getRight());
        }
    }

    //recursively iterates through the BinarySearchTree and returns a value if the data matches
    public BSTNode<dataType> search(dataType d)
    {
        if(root == null)
            return null;
        return search(d,root);
    }

    public BSTNode<dataType> search(dataType d,BSTNode node)
    {
        if(d.compareTo(node.getData()) ==0)
            return node;
        else if (d.compareTo(node.getData()) <0)
        {
            if(node.getLeft() ==null)
                return null;
            else
                return search(d,node.getLeft());
        }
        else
        {
            if(node.getRight() ==null)
                return null;
            else
                return search(d,node.getRight());
        }
    }


    //Code used to populate table
    private dataType visit ( BSTNode<dataType> node )
    {
        return node.getData();
    }

    public ArrayList<dataType> getTableData()
    {
        ArrayList<dataType> temp = new ArrayList<>();
        return postOrder (root,temp);
    }
    private ArrayList<dataType> postOrder (BSTNode<dataType> node,ArrayList<dataType> temp )
    {
        if (node != null)
        {
            postOrder (node.getLeft (),temp);
            postOrder (node.getRight (),temp);
            temp.add(visit (node));
        }
        return temp;
    }
}
