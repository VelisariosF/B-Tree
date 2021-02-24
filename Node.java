import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * This class represents a node
 */
public class Node {
    private boolean isLeaf; 
    private final int minK = 1, maxK = 4;
    private ArrayList<Entry> entries new ArrayList<>();
    private ArrayList<Node> childs = new ArrayList<>();
    public Node(boolean isLeaf){
        this.isLeaf = isLeaf;
    }

    //Is used to add a key
    public  void addKey(int key){
        if(this.shouldBeSplit()){
            Entry entry = new Entry(key, new Node(true), new Node(true));
            this.entries.add(entry);
        }
        
    }


    //used to add entries
    public void addEntry(Entry entry){
        this.entries.add(entry);
        if(shouldBeSplit()){

        }

    }
    
    
    
    
    
    //checks if it should be split
    public  boolean shouldBeSplit(){
        if(entries.size() > maxK)
           return true;
        else
           return false;
    }
    
    //
    public boolean shouldBeMerged(){
        if(entries.size() == minK)
          return true;
        else
          return false;
    }

    public ArrayList<Node> splitNode(Entry parentEntry){
        int parentEntryKey = entries.get(entries.size()/2).getKey();
        ArrayList<Node> nodes = new ArrayList<>();
         Node leftChild = new Node(true);
         Node rightChild = new Node(true);
        for(Entry entry: this.entries){
            if(entry.getKey() < parentEntryKey)
               leftChild.addEntry(entry);
            else
               rightChild.addEntry(entry);
        }

        nodes.add(leftChild);
        nodes.add(rightChild);

       return nodes;
    
    }
    

    public void sortEntries(){
        Collections.sort(entries, new Comparator<Entry>(){
            @Override
            public int compare(Entry e1, Entry e2) {
                int k1 = e1.getKey();
                int k2 =  e2.getKey();
                if(k1 < k2)
                   return 0;
                else
                   return 1;
            }
        });
      }

    public Entry getMidEntry(){

        for(Entry entry: this.entries){
            
        }
    }


}
