package section_11.abstract_class_47;

public class Main {
    public static void main(String[] args) {

        /*
        Object obj = "1";
        Node root = new Node(obj);

        MyLinkedList list = new MyLinkedList(root);

        list.traverse(list.getRoot());

        list.addItem(new Node("2"));
        list.traverse(list.getRoot());

        list.addItem(new Node("3"));
        list.traverse(list.getRoot());

        list.addItem(new Node("0"));
        list.traverse(list.getRoot());

        list.removeItem(new  Node("3"));
        list.traverse(list.getRoot());

        */

//        MyLinkedList list = new MyLinkedList(null);
//        list.removeItem(new Node("1"));

        SearchTree searchTree = new SearchTree(new Node("1"));
        searchTree.addItem(new Node("1"));
        searchTree.addItem(new Node("2"));
        searchTree.addItem(new Node("3"));
        searchTree.addItem(new Node("4"));
        searchTree.addItem(new Node("5"));
        searchTree.addItem(new Node("0"));

        searchTree.traverse(searchTree.getRoot());

    }

}
