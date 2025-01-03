package section_11.abstract_class_47;

public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        ListItem currentItem = root;

        while (currentItem != null){
            if(currentItem.compareTo(newItem) == 0) return false;

            if(newItem.compareTo(currentItem) > 0){
                System.out.println("newItem -> "+ (String) newItem.getValue()+" > "+currentItem.getValue());
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else {
                    currentItem.setNext(newItem);
                    return true;
                }
                /*
                if (currentItem == null){
                    //System.out.println("inside if if");
                    System.out.println(previousItem.getValue()+" -> "+newItem.getValue());
                    previousItem.rightLink = newItem;
                    System.out.println(previousItem.getValue()+" <- "+newItem.getValue());
                    newItem.leftLink = previousItem;
                    //newItem.rightLink = null;
                    return true;
                }*/
            }else if(newItem.compareTo(currentItem) < 0) {

                System.out.println("newItem -> "+ (String) newItem.getValue()+" < "+currentItem.getValue());

                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                }else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
                //previousItem = currentItem;
                //currentItem = currentItem.leftLink;

                /*
                if (currentItem == null){
                    previousItem.rightLink = newItem;
                    newItem.leftLink = previousItem;
                    newItem.rightLink = null;
                    return true;
                }*/
            }else {
                System.out.println(newItem.getValue()+" is already present");
                return false;
            }


        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) return;;

        System.out.println((String) root.getValue());
        traverse(root.rightLink);
        traverse(root.leftLink);
    }
}

/*
// SearchTree
class SearchTree implements NodeList {

    private ListItem root = null;


    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }


    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }


}
 */
