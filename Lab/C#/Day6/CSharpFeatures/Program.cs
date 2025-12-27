using CSharpFeatures.File1;

namespace CSharpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {
           //  Partial class :uses multiple files (multiple physical paths of the files )to define a single class
            CMath cMath = new CMath();
            Console.WriteLine($"Add result = {cMath.Add(5, 10)}");
            Console.WriteLine($"Mult result = {cMath.Multiply(10, 5)}");

        }
    }
}
