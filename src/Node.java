/**
 * This class represents the Node of a binary search tree.
 *
 * @author Mark Chen
 */
public class Node
{
    private String letter;
    private int value;
    private Node left;
    private Node right;

    public Node(String l, int v)
    {
        letter = l;
        value = v;
        left = null;
        right = null;
    }

    public String getLetter()
    {
        return letter;
    }

    public int getLevel()
    {
        return value;
    }

    public Node getLeft()
    {
        return left;
    }

    public Node getRight()
    {
        return right;
    }

    public void setLeft(Node n)
    {
        left = n;
    }

    public void setRight(Node n)
    {
        right = n;
    }

    public boolean hasLeft()
    {
        return left != null;
    }

    public boolean hasRight()
    {
        return right != null;
    }

    public int insert(String letter)
    {
        if(letter.charAt(0) <= getLetter().charAt(0))
        {
            if(hasLeft())
            {
                left.insert(letter);
            }
            else
            {
                setLeft(new Node(letter, getLevel() + 1));
            }
            return left.getLevel();
        }
        else
        {
            if(hasRight())
            {
                right.insert(letter);
            }
            else
            {
                setRight((new Node(letter, getLevel() + 1)));
            }
            return right.getLevel();
        }
    }
    
    public String toString() 
    { 
        return getLetter() + ": " + getLevel() + "\n" + getLeft() + "\n" + getRight(); 
    }
}
