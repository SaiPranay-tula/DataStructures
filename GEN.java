class GEN <T,U>
{

 T obj;
 U obj1;
    GEN(T obj)
    {
        this.obj=obj;
    }


GEN(T obj,U obj1)
{
    this.obj=obj;
    this.obj1=obj1;
}

T getObject()
{
    return this.obj;
}

void printObj()
{
    System.out.println(this.obj+" "+this.obj1);
}

T ADD(T ob,U ob1)
{

    return (T) ob;
}

    public static void main(String[] args) {

        GEN<Integer,String> li=new GEN<Integer,String>(20);
        System.out.println(li.getObject());
        

        GEN<String,Integer> li1=new GEN<String,Integer>("20",100);
        li1.printObj();


        
    }
}