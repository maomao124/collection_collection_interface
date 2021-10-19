import java.util.ArrayList;
import java.util.Iterator;

/**
 * Project name(项目名称)：集合_Collection接口
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 14:58
 * Version(版本): 1.0
 * Description(描述)： 在编程时，可以使用数组来保存多个对象，但数组长度不可变化，一旦在初始化数组时指定了数组长度，这个数组长度就是不可变的。
 * 如果需要保存数量变化的数据，数组就有点无能为力了。而且数组无法保存具有映射关系的数据，如成绩表为语文——79，数学——80，
 * 这种数据看上去像两个数组，但这两个数组的元素之间有一定的关联关系。
 * 为了保存数量不确定的数据，以及保存具有映射关系的数据（也被称为关联数组），Java 提供了集合类。集合类主要负责保存、盛装其他数据，
 * 因此集合类也被称为容器类。Java 所有的集合类都位于 java.util 包下，提供了一个表示和操作对象集合的统一构架，包含大量集合接口，
 * 以及这些接口的实现类和操作它们的算法。
 * 集合类和数组不一样，数组元素既可以是基本类型的值，也可以是对象（实际上保存的是对象的引用变量），
 * 而集合里只能保存对象（实际上只是保存对象的引用变量，但通常习惯上认为集合里保存的是对象）。
 * Java 集合类型分为 Collection 和 Map，它们是 Java 集合的根接口，这两个接口又包含了一些子接口或实现类。
 * 图 1 和图 2 分别为 Collection 和 Map 的子接口及其实现类。
 * <p>
 * 接口名称	作    用
 * Iterator 接口	集合的输出接口，主要用于遍历输出（即迭代访问）Collection 集合中的元素，Iterator 对象被称之为迭代器。迭代器接口是集合接口的父接口，实现类实现 Collection 时就必须实现 Iterator 接口。
 * Collection 接口	是 List、Set 和 Queue 的父接口，是存放一组单值的最大接口。所谓的单值是指集合中的每个元素都是一个对象。一般很少直接使用此接口直接操作。
 * Queue 接口	Queue 是 Java 提供的队列实现，有点类似于 List。
 * Dueue 接口	是 Queue 的一个子接口，为双向队列。
 * List 接口	是最常用的接口。是有序集合，允许有相同的元素。使用 List 能够精确地控制每个元素插入的位置，用户能够使用索引（元素在 List 中的位置，类似于数组下标）来访问 List 中的元素，与数组类似。
 * Set 接口	不能包含重复的元素。
 * Map 接口	是存放一对值的最大接口，即接口中的每个元素都是一对，以 key➡value 的形式保存。
 * <p>
 * 类名称	作用
 * HashSet	为优化査询速度而设计的 Set。它是基于 HashMap 实现的，HashSet 底层使用 HashMap 来保存所有元素，实现比较简单
 * TreeSet	实现了 Set 接口，是一个有序的 Set，这样就能从 Set 里面提取一个有序序列
 * ArrayList	一个用数组实现的 List，能进行快速的随机访问，效率高而且实现了可变大小的数组
 * ArrayDueue	是一个基于数组实现的双端队列，按“先进先出”的方式操作集合元素
 * LinkedList	对顺序访问进行了优化，但随机访问的速度相对较慢。此外它还有 addFirst()、addLast()、getFirst()、getLast()、removeFirst() 和 removeLast() 等方法，能把它当成栈（Stack）或队列（Queue）来用
 * HsahMap	按哈希算法来存取键对象
 * TreeMap	可以对键对象进行排序
 * <p>
 * 方法名称	说明
 * boolean add(E e)	向集合中添加一个元素，如果集合对象被添加操作改变了，则返回 true。E 是元素的数据类型
 * boolean addAll(Collection c)	向集合中添加集合 c 中的所有元素，如果集合对象被添加操作改变了，则返回 true。
 * void clear()	清除集合中的所有元素，将集合长度变为 0。
 * boolean contains(Object o)	判断集合中是否存在指定元素
 * boolean containsAll(Collection c)	判断集合中是否包含集合 c 中的所有元素
 * boolean isEmpty()	判断集合是否为空
 * Iterator<E>iterator()	返回一个 Iterator 对象，用于遍历集合中的元素
 * boolean remove(Object o)	从集合中删除一个指定元素，当集合中包含了一个或多个元素 o 时，该方法只删除第一个符合条件的元素，该方法将返回 true。
 * boolean removeAll(Collection c)	从集合中删除所有在集合 c 中出现的元素（相当于把调用该方法的集合减去集合 c）。如果该操作改变了调用该方法的集合，则该方法返回 true。
 * boolean retainAll(Collection c)	从集合中删除集合 c 里不包含的元素（相当于把调用该方法的集合变成该集合和集合 c 的交集），如果该操作改变了调用该方法的集合，则该方法返回 true。
 * int size()	返回集合中元素的个数
 * Object[] toArray()	把集合转换为一个数组，所有的集合元素变成对应的数组元素。
 */

public class test
{
    public static void main(String... args)
    {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1.add("one");
        list1.add("two");
        list2.addAll(list1);
        list2.add("three");
        System.out.println("list2的集合如下：");
        for (Object o : list2)
        {
            System.out.println(o);
        }
        Iterator it1 = list2.iterator();
        while (it1.hasNext())
        {
            System.out.println(it1.next());
        }
    }
}
