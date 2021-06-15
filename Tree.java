public interface Tree<E>{
    public E getElement();
    public void setElement(E e);
    public boolean isRoot();
    public boolean isInternal();
    public boolean isLeaf();
    public int size();
    public TreeNode<E> getParent();
    public TreeNode<E>[] getChildren();
}
