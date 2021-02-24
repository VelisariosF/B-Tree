import java.util.Collections;

import org.graalvm.compiler.nodes.PiArrayNode;

/**
 * This class represents a node entry
 */
public class Entry {
    private int key;
    private Node leftChild, rightChild;


    public Entry(int key, Node leftChild, Node rightChild){
      this.key = key;
      this.leftChild = leftChild;
      this.rightChild = rightChild;
    }
   

    public int getKey(){
      return this.key;
    }

    public Node getLeftChild(){
      return this.leftChild;
    }

    public Node getRightChild(){
      return this.rightChild;
    }

    

}
