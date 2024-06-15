class Student
{
    String name;
    int marks;
    int rollno;
}




public class array 
{
    public static void main(String[] args) 
    {
        // int arr[]={5,6,7};
        // int arr1[]= new int [4];
        
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println(arr[i]);
        //     arr1[i]=arr[i]+2;
        //     System.out.println(arr1[i]);
            
        // }

    //     int arr2[][]=new int[2][3];
        
    //     for (int i=0;i<2;i++)
    //     {
    //         for(int j=0;j<3;j++)
    //         {
    //             arr2[i][j]=i+j+1;
    //         }
    //     }

    //    for(int n[] : arr2)
    //    {
    //     for(int v : n)
    //     {
    //         System.out.println(v);
    //     }
    //    }


        //Jagged Array

        // int jagged[][]=new int [3][];

        // jagged[0]=new int[3];
        // jagged[1]=new int[2];
        // jagged[2]=new int[1];

        // for(int j[]:jagged)
        // {
        //     for(int k:j)
        //     {
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }


        Student s1=new Student();
        s1.name="Yash";
        s1.marks=96;
        s1.rollno=40;

        Student s2=new Student();
        s2.name="Rohan";
        s2.marks=90;
        s2.rollno=48;

        Student s3=new Student();
        s3.name="Aditya";
        s3.marks=86;
        s3.rollno=38;

        Student s[]=new Student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;

        for(int i=0;i<3;i++)
        {
            System.out.println(s[i].name);
        }

    }    
}
