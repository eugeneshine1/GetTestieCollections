package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestHashSet() {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);

        Assert.assertTrue(set.contains(1));
    }
    @Test
    public void TestArrayList() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.clear();

        Assert.assertTrue(list.isEmpty());
    }
    @Test
    public void TestHashMap() {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(0,"first");

        Assert.assertEquals(map.get(0),"first");
        Assert.assertTrue(map.containsKey(0));
        Assert.assertFalse(map.containsValue("one"));
    }
    @Test
    public void TestLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("f");
        linkedList.add("c");
        linkedList.add("e");

        Assert.assertEquals("c", linkedList.get(1));
    }
    @Test
    public void TestArrayDeque() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(0);
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.removeFirst();

        Assert.assertTrue(arrayDeque.getFirst()==1);
    }
//    @Test
//    public void TestVector() {
//
//    }
    @Test
    public void TestTreeMap() {
        TreeMap<Integer,String> treeMap = new TreeMap();

        treeMap.put(1,"second");
        treeMap.put(0,"first");
        treeMap.put(3,"forth");
        treeMap.put(2,"third");


        Assert.assertTrue(treeMap.firstKey()==0);
    }
    @Test
    public void TestStack() {
        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("g");
        stack.push("k");
        stack.peek();
        stack.pop();

        Assert.assertFalse(stack.contains("k"));
        Assert.assertEquals("g",stack.get(1));
    }
    @Test
    public void TestTreeSet() {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("f");
        treeSet.add("c");
        treeSet.add("e");

        Assert.assertEquals("c", treeSet.pollFirst());
    }
    @Test
    public void TestIterator() {
        Collection<Integer> collections = new ArrayList<>();
        collections.add(23);
        collections.add(52);
        collections.add(78);
        collections.add(1);
        collections.add(2);

        Iterator<Integer> iterator = collections.iterator();
        while( iterator.hasNext()){
            int actual = iterator.next();
            Assert.assertFalse(actual<0);
        }
    }
    @Test
    public void TestPriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(23);
        priorityQueue.add(30);
        priorityQueue.add(9);
        priorityQueue.add(-12);

        Assert.assertFalse(priorityQueue.contains(39));
    }
    @Test
    public void TestComparable() {
        Person person = new Person("Person",1990);
        Person person1 = new Person("Person1",1900);
        int actual = person1.compareTo(person);

        Assert.assertEquals(actual,1);
    }
}
