package Collections;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("HASHSET...............");
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("element1");
        hashSet.add("element2");
        System.out.println(hashSet);
        hashSet.remove("element1");
        System.out.println(hashSet);

        System.out.println("TREESET...............");
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("element1");
        treeSet.add("element2");
        treeSet.add("element3");
        System.out.println(treeSet);
        treeSet.remove("element2");
        System.out.println(treeSet);

        System.out.println("LINKEDHASHSET...............");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("element1");
        linkedHashSet.add("element2");
        linkedHashSet.add("element3");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("element1");
        System.out.println(linkedHashSet);

        System.out.println("ARRAYLIST...............");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("element1");
        arrayList.add("element2");
        arrayList.add("element3");
        System.out.println(arrayList);
        arrayList.remove("element3");
        System.out.println(arrayList);

        System.out.println("LINKEDLIST...............");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("element1");
        linkedList.add("element2");
        linkedList.add("element3");
        System.out.println(linkedList);
        linkedList.remove("element3");
        System.out.println(linkedList);

        System.out.println("QUEUE LINKED LIST...............");
        Queue queueA = new LinkedList();
        // Metodos que arrojan execpciones ante una falla
        queueA.add("element 1"); // inserta un elemento en la cola
        queueA.add("element 2");
        queueA.add("element 3");
        queueA.remove(); // remueve y devuelve el head de una cola
        queueA.element(); //  devuelve, pero no remueve, el head de una cola
        // Metodos que devuelven null o false ante una falla.
        queueA.offer("element 4"); // inserta un elemento en la cola,  puede fallar en el caso de una cola con capacidad limitada
        queueA.poll(); // remueve y devuelve el head de una cola
        queueA.peek(); //  devuelve, pero no remueve, el head de una cola

        System.out.println("QUEUE PRIORITY QUEUE...............");
//        Comparator<String> comparator = new StringLengthComparator();
//        PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);
//        queue.add("short");
//        queue.add("very long indeed");
//        queue.add("medium");
//        while (queue.size() != 0)
//        {
//            System.out.println(queue.remove());
//        }

        System.out.println("ITERADORES...............");
        ArrayList lasPersonas = new ArrayList();
        lasPersonas.add("Pepe");
        lasPersonas.add("Juan");
        lasPersonas.add("Sabrina");
        lasPersonas.add("Cecilia");
        Iterator it = lasPersonas.iterator();
        while(it.hasNext()){
            String unaPersona = (String)it.next();
        }

        System.out.println("HASHMAP...............");
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0,"value1");
        hashMap.put(1,"value2");
        hashMap.put(2,"value3");
        System.out.println(hashMap);
        hashMap.remove(0);
        System.out.println(hashMap);

        System.out.println("TREEMAP...............");
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        treeMap.put("key1",123);
        treeMap.put("key2",435);
        treeMap.put("key3",654);
        System.out.println(treeMap);
        treeMap.remove("key1");
        System.out.println(treeMap);

        System.out.println("LINKEDHASHMAP...............");
        HashMap<Integer, String> linkedHashMap = new HashMap<Integer, String>();
        linkedHashMap.put(0,"value1");
        linkedHashMap.put(1,"value2");
        linkedHashMap.put(2,"value3");
        System.out.println(linkedHashMap);
        linkedHashMap.remove(0);
        System.out.println(linkedHashMap);

        System.out.println("GENERICS.............");
//        List v = new ArrayList();
//        v.add("test");
//        Integer i = (Integer)v.get(0); // Run time error

        String hascode= "Estrella";
        List<String> c = new ArrayList<>();
        c.add("Manzanas");
        c.add("Peras");
        c.add("Duraznos");
        for(String st : c){
            System.out.println(st);
            System.out.println(st.hashCode());
        }
        for(int a = 0; a < c.size(); a++){

            System.out.println(c.get(a));
            System.out.println(c.get(a).hashCode());
        }
    }
}
