class Student2
{
    public String Name;
    public int Roll_No;
    public Student2(){ };

    public Student2(String N, int R)

    {
        Name = N;
        Roll_No = R;
        System.out.println("Name : "+Name+" "+"Roll_no : "+Roll_No);
    }

    public void print(String P, int K)

    {
        Name = P;
        Roll_No = K;
        System.out.println("Name : "+Name+" "+"Roll_no : "+Roll_No);
    }
}
class lab1
{

    public static void main(String[] args)

    {
        Student2[] Stu = new Student2[10];

        Stu[0] = new Student2("kshitij",91);
        Stu[1] = new Student2("pratap",92);
        Stu[2] = new Student2("rd",93);
        Stu[3] = new Student2("kd",94);
        Stu[4] = new Student2("munaf",95);
        Stu[5] = new Student2("tony",96);
        Stu[6] = new Student2("loki",97);
        Stu[7] = new Student2("tomer",98);
        Stu[8] = new Student2("riya",99);
        Stu[9] = new Student2("priya",100);

        try
        {
            Stu[10] = new Student2();
            Stu[10].print("sidhu mosse walla",111);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Do not cross size of array sir."  + e );
        }
    }
}
