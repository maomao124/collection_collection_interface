import java.util.ArrayList;

/**
 * Project name(项目名称)：集合_Collection接口
 * Package(包名): PACKAGE_NAME
 * Class(类名): test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 15:14
 * Version(版本): 1.0
 * Description(描述)： 创建一个案例，演示 Collection 集合中 size()、remove() 和 removeAll() 方法的应用。具体代码如下：
 */

public class test1
{
    public static void main(String... args)
    {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1.add(12345);
        list1.add("hello ");
        list1.add("world");
        list1.add(325.7);
        System.out.println("list1集合中的元素数量：" + list1.size());
        list2.add("two");
        list2.add("four");
        list2.add("six");
        System.out.println("list2集合中的元素数量：" + list2.size());
        System.out.println("输出list1：");
        for (Object o : list1)
        {
            System.out.println(o);
        }
        System.out.println("输出list2：");
        for (Object o : list2)
        {
            System.out.println(o);
        }
        System.out.println("删除list2中第2个元素：");
        list2.remove(1);
        System.out.println("输出list2：");
        for (Object o : list2)
        {
            System.out.println(o);
        }
        System.out.println("list2集合中的元素数量：" + list2.size());
        list2.add(12345);
        System.out.println("list2集合中的元素数量：" + list2.size());
        System.out.println("输出list2：");
        for (Object o : list2)
        {
            System.out.println(o);
        }
        System.out.println("执行list1.removeAll(list2):");
        System.out.println(list1.removeAll(list2));
        System.out.println("输出list1：");
        for (Object o : list1)
        {
            System.out.println(o);
        }
        System.out.println("list1集合中的元素数量：" + list1.size());
        list1.add(12345);
        list1.add("six");
        System.out.println("输出list1：");
        for (Object o : list1)
        {
            System.out.println(o);
        }
        System.out.println("执行list1.retainAll(list2)：");
        System.out.println(list1.retainAll(list2));
        System.out.println("list1集合中的元素数量：" + list1.size());
        System.out.println("输出list1：");
        for (Object o : list1)
        {
            System.out.println(o);
        }
    }
}
