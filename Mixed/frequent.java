import java.util.*;

public class frequent
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int k = in.nextInt();
       Map<Integer,Integer> map = new HashMap<>();
       
       int n = in.nextInt();

       for(int i=0;i<n;i++)
       {
         int key = in.nextInt();
         map.put(key,map.getOrDefault(key,0)+1);
       }
      

       // creating priority queue and sorting logic using interface
       PriorityQueue<Integer> queue = new PriorityQueue<>(new sort(map));

       for(int key:map.keySet())
       {
         queue.add(key);
       }
        

      System.out.println("frequent element");
       while(k-->0)
       {
        System.out.println(queue.poll());
       }



    }
}


// implementing  comparator interface 
class sort implements Comparator<Integer>
{
    
    Map<Integer,Integer> map = null;
    
    sort(Map<Integer,Integer> map)
    {
        this.map=map;
    }


     @Override
    public int compare(Integer i,Integer j)
    {
        if(map.get(i)>map.get(j)) return -1;
        else if(map.get(i)<map.get(j)) return 1;
        else
        {
          if(i>j) return -1;
          return 1;
        }
    }
}