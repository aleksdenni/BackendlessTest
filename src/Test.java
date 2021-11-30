import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {


    public static void reverse(Node node){
        List<Node> nodeList = new ArrayList<>();
        for (int i=0 ; node!=null ; i++){
            Node next = node.getNext();
            if (i==0){
                node.setNext(null);
            }else node.setNext(nodeList.get(i-1));
            nodeList.add(node);
            node = next;
        }
        Collections.reverse(nodeList);
        for (Node n : nodeList) {
            System.out.println(n.getValue());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        List<Node> nodes = new ArrayList<>();
        for(int i=0 ; i<5 ; i++){
            nodes.add(new Node());
        }
        for(int i=0 ; i<nodes.size();i++){
            nodes.get(i).setValue(i+1);
            if (i<nodes.size()-1) {
                nodes.get(i).setNext(nodes.get(i + 1));
            }
        }

        System.out.println(nodes.get(0).getValue());
        //test.reverse(nodes.get(0));
    }
}
