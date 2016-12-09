package hashmapcustom;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

/**
 * Created by ashvinikumar on 23/11/16.
 */
class CustomHashMap<K,V> {
    private Entry<K,V>[] table;
    private int capacity=10;
    static class Entry<K,V>
    {
        K key;
        V value;
        Entry<K,V> next;
        public Entry( K key,V value, Entry<K,V> next)
        {
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }
    public CustomHashMap()
    {
        table=new Entry[capacity];
    }
    private int hash(K key)
    {
        return Math.abs(key.hashCode()) % capacity;
    }
    public void put(K newkey,V newvalue)
    {
        if(newkey==null)
            return;
        int hash=hash(newkey);
        Entry<K,V> newEntry=new Entry<K, V>(newkey,newvalue,null);
        if(table[hash]==null)
            table[hash]=newEntry;
        else
        {
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];
            while(current!=null)
            {
                if(current.key.equals(newkey))
                {
                    if(previous==null)
                    {
                        newEntry.next=current.next;
                        table[hash]=newEntry;
                        return;
                    }
                    else
                    {
                        newEntry.next=current.next;
                        previous.next=newEntry;
                    }
                }
                previous=current;
                current=current.next;
            }
            previous.next=newEntry;

        }
    }

    public V get(K key)
    {
       int hash=hash(key);
        if(table[hash]==null)
            return null;
        else {
            Entry<K,V> temp=table[hash];
            while(temp!=null)
            {
                if(temp.key.equals(key))
                    return temp.value;
                temp=temp.next;
            }
            return null;
        }
    }
    public boolean remove(K deleteKey)
    {
        int hash=hash(deleteKey);
        if(table[hash]==null)
            return false;
        else
        {
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];
            while (current!=null)
            {
                if(current.key.equals(deleteKey))
                {
                    if(previous==null) {
                        current = current.next;
                        return true;
                    }
                    else
                    {
                        previous.next=current.next;
                        return true;
                    }
                }
                previous=current;
                current=current.next;
            }
            return false;
        }
    }
    public void display()
    {
        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K, V> entry=table[i];
                while(entry!=null){
                    System.out.println(entry.key+"="+entry.value);
                    entry=entry.next;
                }
            }
        }

    }
    public void keyset()
    {
        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K, V> entry=table[i];
                while(entry!=null){
                    System.out.println(entry.key);
                    entry=entry.next;
                }
            }
        }

    }

    public int size()
    {
        int size=0;
        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K, V> entry=table[i];
                while(entry!=null){
                   size++;
                    entry=entry.next;
                }
            }
        }
        return size;

    }
}
public class CustomHashMapDemo
{
    public static void main(String args[])
    {
    CustomHashMap<Integer, Integer> chm=new CustomHashMap<>();
        char ch;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("HashMap Operations");
            System.out.println("1. Put");
            System.out.println("2.Get");
            System.out.println("3.Size");
            System.out.println("4.remove");
            System.out.println("5.keyset");
            System.out.println("6.Display");
            int choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter key,value");
                    int key = scan.nextInt();
                    int value = scan.nextInt();
                    chm.put(key,value);
                    break;
                case 2:
                    System.out.println("Enter key value");
                    int newkey=scan.nextInt();
                    System.out.println("Value of key "+newkey+"="+chm.get(newkey));
                    break;
                case 3:
                    System.out.println("Size ="+chm.size());
                    break;
                case 4:
                    System.out.println("Enter key value");
                    int delkey=scan.nextInt();
                    System.out.println("key,value removed corresponding to "+delkey+"?"+chm.remove(delkey));
                    break;
                case 5:
                  chm.keyset();
                    break;
                case 6:
                    chm.display();
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
    }

