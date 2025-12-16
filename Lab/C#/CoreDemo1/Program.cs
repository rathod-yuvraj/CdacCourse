using System;

namespace CoreDemo1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i <= 5; i++)
            {
                Console.Write(new string(' ', 5 - i));
                Console.WriteLine(new string('*', 2 * i - 1));
            }






        }
    }
}
