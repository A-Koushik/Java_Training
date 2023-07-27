class student
{
    int roll=1;
    String sname;
    double m1,m2,m3,m4;
    // student(int rollc,String snamec)
    // {
    //     roll=rollc;
    //     sname=snamec;
    //     // m1=1;
    //     // m2=2;
    //     // m3=3;
    //     // m4=4;
    // }
    public void avg()
    {
        System.out.println((m1+m2+m3+m4)/4);
    }
    void display()
    {
        System.out.println("Super class");
    }
}
class subclass extends student
{
    void display()
    {
        System.out.println("Sub class");
    }
}
class Classes
{
    public static void main(String[] args)
    {
        // student s1=new student(1,"Itachi");
        // s1.student(1,"Itachi");
        // System.out.println("Before assignment Roll.no : "+s1.roll);
        // System.out.println("Before assignment Sname : "+s1.sname);
        // System.out.println("Before assignment m1 : "+s1.m1);
        // System.out.println("Before assignment m2 : "+s1.m2);
        // System.out.println("Before assignment m3 : "+s1.m3);
        // System.out.println("Before assignment m4 : "+s1.m4);
        // s1.roll=123;
        // s1.sname="Luffy";
        // s1.m1=10;
        // s1.m2=12;
        // s1.m3=13;
        // s1.m4=14;
        // System.out.println("Roll.no : "+s1.roll);
        // System.out.println("Name : "+s1.sname);
        // System.out.println("Mark1 : "+s1.m1);
        // System.out.println("Mark2 : "+s1.m2);
        // System.out.println("Mark3 : "+s1.m3);
        // System.out.println("Mark4 : "+s1.m4);
        // System.out.print("Average : ");
        // s1.avg();
        student s1=new subclass();
        s1.display();
        student s=new student();
        s.display();
    }
}

