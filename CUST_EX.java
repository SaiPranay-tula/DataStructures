class LESS_Age extends Exception{


    LESS_Age(String s)
    {
        super(s);
    }
}


class CUST_EX{


void Age_check(int age) throws LESS_Age
{
    if(age<18)
    throw new LESS_Age("BELOW AGE EXCEPTION");
    else
    System.out.println("GOOD TO PROCEDE");
}

    public static void main(String[] args) {
        
        CUST_EX obj=new CUST_EX();
        try{
        obj.Age_check(9);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }



    }
}