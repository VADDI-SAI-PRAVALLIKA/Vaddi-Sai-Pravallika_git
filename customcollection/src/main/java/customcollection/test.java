
package customcollection;
public class test
{
    public static void main(String[] args) 
    {
    	List<String>sample = new List<String>();
        sample.add("C");
        sample.add("C++");
        sample.add("JAVA");
        sample.add("PYTHON");
        System.out.println("Complete List: "+sample);
        System.out.println("size: "+sample.size());
        sample.remove(1);
        sample.remove(2);
        System.out.println("List after removing C++,python: "+sample);
        System.out.println("Size of list after removing: "+sample.size());
        System.out.println("element at index1: "+sample.get(1) );
    }
}