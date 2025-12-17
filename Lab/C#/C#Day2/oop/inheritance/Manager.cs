

namespace inheritance
{
    internal class Manager : Employee
    {
        public override void show() 
        {  
            Console.WriteLine("Manager class method1");

        }                                       
        public  void method2()
        {
          
            Console.WriteLine("Manager class to method2");
        }
        public  void method3()
        {
            //base.method2();  
            Console.WriteLine("Manager class to method3");
        }

    }
}