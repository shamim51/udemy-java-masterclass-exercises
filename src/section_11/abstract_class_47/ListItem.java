package section_11.abstract_class_47;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }
    //next(), setNext(), previous(), setPrevious() and compareTo()
    public abstract ListItem next();
    protected abstract ListItem setNext(ListItem listItem);
    public   abstract ListItem previous();
    protected abstract ListItem setPrevious(ListItem listItem);
    protected abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
