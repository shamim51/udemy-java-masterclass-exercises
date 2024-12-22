package section_11.abstract_class_47;

public interface NodeList {
    //getRoot(), addItem(), removeItem() and traverse()
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
