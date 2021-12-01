import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {


    public static void reverse(Node node){

        for (int i=0;node!=null;i++){
            Node next = node.getNext();
            if (i==0){
                node.setNext(null);
            }
            node=next;
            if (i!=0){
                next.setNext(node);
            }
        }

        /*List<Node> nodeList = new ArrayList<>();
        for (int i=0 ; node!=null ; i++){
            Node next = node.getNext();
            if (i==0){
                node.setNext(null);
            }else node.setNext(nodeList.get(i-1));
            nodeList.add(node);
            node = next;
        }
        Collections.reverse(nodeList);*/

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
        test.reverse(nodes.get(0));
    }
}
