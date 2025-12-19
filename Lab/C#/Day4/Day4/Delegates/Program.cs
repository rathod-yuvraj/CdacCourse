using Microsoft.VisualBasic;

namespace Delegates
{


    //public delegate void MyDelegate();
    public delegate int MyAddDelegate(int a, int b);
    public delegate string MyString(string s);
    internal class Program
    {
        static void Main(string[] args)
        {
            CMath c = new CMath();
            //MyAddDelegate addDelegate = c.Add;
            MyAddDelegate addDelegate1 =new MyAddDelegate(c.Add);
            Console.WriteLine( "Enter Number1: ");
            int num1=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Number2: ");
            int num2=Convert.ToInt32(Console.ReadLine());
            int result =addDelegate1(num1,num2);
           // int result=c.Add(num1,num2);
            Console.WriteLine("Addition Ans: "+result);
           
        }
    }


    class CMath
    {
        public int Add(int x, int y)
        {
            int result = x+y;

            return result;
        }
        public string sayHello()
        {
            String Msg = "Wecome to  my code!..";
            return Msg;
        }
    }
}
