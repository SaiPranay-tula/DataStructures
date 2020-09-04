class Jam{
    int num;
    String name;
    Jam(int num,String name)
    {
        this.num=num;
        this.name=name;
        
    }

public String toString()
{
    return num+" "+name;
}

    public static void main(String[] args) {


        Jam a[]=new Jam[5];
        for(int i=0;i<5;i++)
        {

            a[i]=new Jam(i,"ab");
            System.out.println(a[i]);
        }        





    }
}