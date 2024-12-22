package section_11.abstract_class_47;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }


    @Override
    public boolean removeItem(ListItem item){
        //if we find the item in root
        if(root == null) return false;

        if(item.compareTo(root) == 0){
            root = root.rightLink;
            if(root.rightLink != null){
                root.leftLink = null;
            }
            return  true;
        }
        else {
            ListItem currentItem = root;
            while (currentItem.rightLink != null){
                if((currentItem.rightLink).compareTo(item) == 0){
                    ListItem nextItem = currentItem.rightLink;

                    currentItem.rightLink = nextItem.rightLink;
                    if(nextItem.rightLink != null){
                        nextItem.rightLink.leftLink = currentItem;
                    }
                    return true;
                }
                //we have to put some light here regarding update current item, when we delete a node from the last edge we cant do that
                currentItem = currentItem.rightLink;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root){
        if(root == null){
            System.out.println("The list is empty");
        }else{
            System.out.println("-------------------------------------------");
            ListItem currentItem = root;
            while (currentItem != null){
                System.out.println((String) currentItem.value);
                currentItem = currentItem.rightLink;
            }
        }
    }
    public boolean addItem(ListItem newItem){

        // If the head of the tree is null, make the head refer to the item to be added.
        if(root == null){
            root = newItem;
            return true;
        }

        ListItem current = root;
        while(current.rightLink != null){

//            if(((String)current.value).compareTo((String)newItem.value) == 0) {
//                return false;
//            }

            if(current.compareTo(newItem) == 0) return false;

            /*
              If the item to be added is less than the current item in the tree,
              add the item before the current item
              (i.e., make the previous item's "next" refer to the new item,
              and the new item's "next" refer to the current item).
             */
            else if (newItem.compareTo(current) < 0) {
                if(current == root){
                    newItem.rightLink = current;
                    current.leftLink = newItem;
                    root = newItem;
                    return true;
                }else {
                    ListItem previousItem = current.leftLink;
                    newItem.rightLink = current;
                    current.leftLink = newItem;

                    previousItem.rightLink = newItem;
                    newItem.leftLink = previousItem;
                }
            }

            /*
            If the item to be added is greater than the current item,
            move onto the next item and compare again
            */

            current = current.rightLink;

        }

        // (if there is no next item, then that is where the new item belongs).
        current.rightLink = newItem;
        newItem.leftLink = current;

        return true;
    }

}


/*
// MyLinkedList
class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (this.root == null) {
            // the list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater than currentItem, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less than currentItem, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // comparison > 0
                // we are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // we have reached the end of the list
        // without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
 */
