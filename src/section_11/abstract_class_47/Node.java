package section_11.abstract_class_47;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    protected ListItem setNext(ListItem item) {
        this.rightLink = item;

        return rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    protected ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    protected int compareTo(ListItem item) {

        String thisValue = (String) this.value;
        String passedValue = (String) item.value;
        /*
           if (thisValue.compareTo(passedValue) > 0) return 1;
           else if (thisValue.compareTo(passedValue) < 0) return -1;
           return  0;
        */

        return thisValue.compareTo(passedValue);

    }
}

/*
// Node
class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {

        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
 */
