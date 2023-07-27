import java.util.Scanner;
class Sample
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        // System.out.print("Enter Name : ");
        // String name=scan.nextLine();
        // System.out.println("Name : "+name);
        // //System.out.println(name.charAt(name.length()-1));
        // String rev="";
        // for(int i=(name.length()-1);i>=0;i--)
        // {
        //     rev=rev+name.charAt(i);
        // }
        // System.out.println("Backward name : "+rev);
        // //String result=(name==rev)?"Yes":"No";
        // if(name.equals(rev))
        //     System.out.println("Yes");
        // else
        //     System.out.println("No");
        //int arr[]=new int[]{1,2,3};
        // int arr[]={1,2,3};
        // //arr[0]=1;
        // for(int i : arr)
        //     System.out.print(i+" ");
        int arr[][]={{1,2,3},{4,5,6}};
        for(int[] i:arr)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        int row=arr.length,col=arr[0].length;
        int trans[][]=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                trans[j][i]=arr[i][j];
        }
        for(int[] i:trans)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}

