class TryCatch
{
    public static void main(String[] args)
    {
        try
        {
            int n=100/1;
            String a=null;
            System.out.println(a.length());
            int i=Integer.parseInt(a);
            System.out.println(i);
        }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e);
        // }
        // catch(NullPointerException n)
        // {
        //     System.out.println(n);
        // }
        // catch(NumberFormatException e)
        // {
        //     System.out.println(e);
        // }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}