// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

  public class LRUDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// design the class in the most optimal way

 class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }
class LRUCache
{
    //Constructor for initializing the cache capacity with the given value.
    private static Node head;
    private static Node tail;
    private static HashMap<Integer,Node> map;
    private static int capacity;
   
    LRUCache(int cap)
    {
        //code here
        this.capacity = cap;
        head = new Node(0,0);
        tail = new Node(0,0);
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        // your code here
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        // your code here
        if(map.containsKey(key))
            remove(map.get(key));
        if(map.size()==capacity)
            remove(tail.prev);
        insert(new Node(key,value));
    }
    public static void remove(Node node)
    {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public static void insert(Node node)
    {
        map.put(node.key,node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
    }
}
