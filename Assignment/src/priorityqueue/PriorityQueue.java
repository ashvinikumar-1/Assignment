package priorityqueue;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by ashvinikumar on 25/11/16.
 */
class QueueCust{
    int priority;
    String name;
    public void set(int priority,String name){
        this.priority=priority;
        this.name=name;
    }

}
public class PriorityQueue<QueueCust>  implements List<QueueCust> {
   ArrayList<QueueCust> list=new ArrayList<>();
   QueueCust qt=null;


    @Override
    public QueueCust remove(int i) {
        return null;
    }

    @Override
    public void add(int i, QueueCust queueCust) {

    list.add(i,queueCust);
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean remove(Object o) {

        return list.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> collection) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @NotNull
    @Override
    public List<QueueCust> subList(int i, int i1) {
        return null;
    }

    @NotNull
    @Override
    public ListIterator<QueueCust> listIterator(int i) {
        return null;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public QueueCust set(int i, QueueCust queueCust) {
        return null;
    }

    @Override
    public boolean add(QueueCust queueCust) {
         list.add(queueCust);

        return false;
    }

    @NotNull
    @Override
    public Iterator<QueueCust> iterator() {
        Iterator itr=list.iterator();
        return itr;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> collection) {
        return false;
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] ts) {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {
      list.remove(0);
    }

    @Override
    public QueueCust get(int i) {

        return list.get(i);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends QueueCust> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, @NotNull Collection<? extends QueueCust> collection) {
        return false;
    }

    @NotNull
    @Override
    public ListIterator<QueueCust> listIterator() {
        return null;
    }
}
class PriorityQueueDemo {
    public static void main(String args[]) {
        System.out.println("enter no of patient you want to add");
        Scanner sc=new Scanner(System.in);
        PriorityQueue<QueueCust> pq = new PriorityQueue<>();
        int n=sc.nextInt();
        QueueCust qc[] = new QueueCust[n];
        for(int i=0;i<n;i++) {
            qc[i] = new QueueCust();
            int k = sc.nextInt();
            String s=sc.next();
            qc[i].set(k, s);
            if(pq.size()==0)
                pq.add(qc[i]);
            else {
                for (int j = 0; j < pq.size(); j++) {
                    if (pq.get(j).priority >= k) {
                        if (j == 0) {
                            pq.add(0, qc[i]);
                            break;
                        }
                        pq.add(j-1, qc[i]);
                        break;
                    }
                    pq.add(qc[i]);
                    break;
                }
            }

        }

        for(int i=0;i<pq.size();i++)
        {
            System.out.println(pq.get(i).name + " " + pq.get(i).priority);
        }
        pq.clear();
        for(int i=0;i<pq.size();i++)
        {
            System.out.println(pq.get(i).name + " " + pq.get(i).priority);
        }
    }
}
