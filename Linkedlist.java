import java.util.*;
class Student implements Comparable<Student>
{
    int roll_no;
    String name;
    Student(int roll,String name)
    {
        this.roll_no=roll;
        this.name=name;
    }
    public String toString()
    {
        return roll_no+" "+name;
    }
    public int compareTo(Student s1)
    {
        return this.name.compareTo(s1.name);
    }
}
class Linkedlist
{
    public static void main(String[]args)
    {
        Scanner m=new Scanner(System.in);
        Student a[]=new Student[5];
        LinkedList<Student> l=new LinkedList<Student>();
        for(int i=0;i<5;i++)
        {
            a[i]=new Student(m.nextInt(),m.next());
        }
        for(int i=0;i<a.length;i++)
        {
            l.add(a[i]);
        }
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                if(l.get(j-1).compareTo(l.get(j))>0)
                {
                    Student temp=l.get(j-1);
                    l.set(j-1,l.get(j));
                    l.set(j,temp);
                }
            }
        }

        Iterator<Student> i=l.iterator();
        System.out.println("Output");
        while(i.hasNext())
        {
            Student s=i.next();
            System.out.println(s);
        }
    }
}
