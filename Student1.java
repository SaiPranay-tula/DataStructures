import java.util.*;


class NameCom implements Comparator<Student1>{

    public int compare(Student1 s1,Student1 s2)
    {

         return s1.name.compareTo(s2.name);


    }
}



class AgeCom implements Comparator<Student1>{

    public int compare(Student1 s1,Student1 s2)
    {

         if(s1.age==s2.age)
         return 0;
         else if(s1.age>s2.age)
         return 1;
         return -1;

    }
}

class RollCom implements Comparator<Student1>{

    public int compare(Student1 s1,Student1 s2)
    {

         if(s1.roll==s2.roll)
         return 0;
         else if(s1.roll>s2.roll)
         return -1;
         return 1;

    }
}



class Student1{
    int age,roll;
    String name;


    Student1(int age,int roll,String name)
    {
        this.age=age;
        this.name=name;
        this.roll=roll;
    }

    public String toString()
    {
        return this.age+" "+roll+" "+name;
    }





    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList<>();
        list.add(new Student1(10,1,"AB"));
        list.add(new Student1(110,0,"BAB"));
        list.add(new Student1(1,123,"DAB"));
        list.add(new Student1(100,23,"A"));

        Collections.sort(list,new RollCom());

        for (Student1 x:list)
        System.out.println(x);





        
    }
}