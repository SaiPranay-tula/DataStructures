import java.util.*;



class StudentA{

    int age;
    String name;
    StudentA(int age,String name)
    {
        this.age=age;
        this.name=name;
    }


    public String toString()
    {

        return this.age+"  "+this.name+"  ";

    }

}

class Compare1 implements Comparator<StudentA>{

    public int compare(StudentA n1,StudentA n2)
    {
        return n1.age>n2.age?-1:1;
    }

}

class Compare2 implements Comparator<StudentA>{

    public int compare(StudentA n1,StudentA n2)
    {
        return n1.name.compareTo(n2.name);
    }

}




class Main{
    public static void main(String[] args) {

        Queue<StudentA> queue=new PriorityQueue<StudentA>(new Compare1());
        queue.add(new StudentA(12,"Vignesg"));
        queue.add(new StudentA(55, "name"));
        queue.add(new StudentA(0, "AA"));
        
        while(queue.size()>0)
        {
            System.out.println(queue.poll());
        }


        
    }
}