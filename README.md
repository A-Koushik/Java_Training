# Basic Codes

import java.util.Scanner;
class Hey
{
    int palindrome(int n)
    {
        int rem=0,rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return rev;
    }
    int con_Dec2Bin(int n)
    {
        int bin=0,count=0;
        long rem=0;
        while(n!=0)
        {
            rem=n%2;
            bin+=rem*(Math.pow(10,count));
            n=n/2;
            count++;
        }
        return bin;
    }
    void Operators(int a,int b)
    {
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+((float)a/(float)b));
        System.out.println(a+"%"+b+"="+(a%b));
    }
    void compare(int a,int b)
    {
        System.out.println(a+"="+b+"->"+(a==b));
        System.out.println(a+"!="+b+"->"+(a!=b));
        System.out.println(a+">"+b+"->"+(a>b));
        System.out.println(a+"<"+b+"->"+(a<b));
        System.out.println(a+">="+b+"->"+(a>=b));
        System.out.println(a+"<="+b+"->"+(a<=b));
    }
    void logical_op(int a,int b,int c,int d)
    {
        System.out.println(a+">"+b+"&&"+c+"<"+d+"->"+((a>b)&&(c<d)));
        System.out.println(a+">"+b+"||"+c+"<"+d+"->"+((a>b)||(c<d)));
    }
    void pattern(int size)//Equilateral Triangle
    {
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size-i;j++)
                System.out.print(" ");
            for(int z=1;z<=i;z++)
                System.out.print(z+" ");
            System.out.println();
        }
    }
    void square_pattern(int size)
    {
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(i==1||i==size)
                    System.out.print("*");
                else
                {
                    if(j==1||j==size)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void right_patteern(int size)
    {
        for(int i=1;i<=size;i++)
        {
            for(int j=size;j>i;j--)
                System.out.print(" ");
            for(int z=1;z<=i;z++)
                System.out.print("*");
            System.out.println();
        }
    }
    int[] min_max(int arr[])
    {
        int min=arr[0],temp=0,max=0;
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        //int res[]={min,max};
        return new int[]{min,max};
    }
    String Str_palindrome(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    void fibonacci(int n)
    {
        int n1=0,n2=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(n1+" ");
            int sum=n1+n2;
            n1=n2;
            n2=sum;
        }
    }
    int recurr(int n)
    {
        if(n==0)
            return n;
        else 
            return n+recurr(n-1);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        // int palindrome(int n)
        // Hey palin=new Hey();
        // int n=123123;
        // System.out.println(palin.palindrome(n));
        // String result=(n==palin.palindrome(n))?"Yes" : "No";
        // System.out.print(result);

        //int con_Dec2Bin(int n)
        // Hey bin=new Hey();
        // int n=15;
        // System.out.println(n+" binary form is "+bin.con_Dec2Bin(n));

        //void Operators(int a,int b)
        // Hey ope=new Hey();
        // ope.Operators(5,6);

        //void compare(int a,int b)
        // Hey comp=new Hey();
        // comp.compare(10,11);
        
        //void logical_op(int a,int b,int c,int d)
        // Hey logic=new Hey();
        // logic.logical_op(5,2,3,4);

        //void pattern(int size)
        // Hey patt=new Hey();
        // patt.pattern(5);

        //void square_pattern(int size)
        // Hey sq_patt=new Hey();
        // sq_patt.square_pattern(10);

        //void right_patteern(int size)
        // Hey rig_patt=new Hey();
        // rig_patt.right_patteern(5);

        //int min_max(int arr[])
        // Hey min=new Hey();
        // int arr[]={12,3,45,87,0,-2};
        // int res[]=min_max.minimum(arr);
        // for(int i:res)
        //     System.out.print(i+" ");

        //String Str_palindrome(String str)
        // Hey str_pal=new Hey();
        // System.out.print("Enter String : ");
        // String str=scan.nextLine();
        // System.out.println("Backward String : "+str_pal.Str_palindrome(str));
        // if(str.equals(str_pal.Str_palindrome(str)))
        //     System.out.println("Yes");
        // else
        //     System.out.println("No");

        //void fibonacci(int n)
        // Hey fib=new Hey();
        // fib.fibonacci(6);

        //int recurr(int n)
        // Hey r=new Hey();
        // System.out.println(r.recurr(5));
        // int x=3,y=5,z=10;
        // System.out.print(++z+y-y+z+x++);
        ArrayList list=new ArrayList();
        System.out.print(list.length);
    }
}
