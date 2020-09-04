import java.util.*;





class Student implements Comparable<Student>{
    int age,roll;
    String name;


    Student(int age,int roll,String name)
    {
        this.age=age;
        this.name=name;
        this.roll=roll;
    }

    public int compareTo(Student s)
    {
        if (this.age==s.age)
        return 0;

        else if (this.age>s.age)
        return -1;

        else
        return 1;

    }
    public String toString()
    {
        return this.age+" "+roll+" "+name;
    }





    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(10,1,"AB"));
        list.add(new Student(110,0,"BAB"));
        list.add(new Student(1,123,"DAB"));
        list.add(new Student(100,23,"A"));

        Collections.sort(list);

        for (Student x:list)
        System.out.println(x);





        
    }
}