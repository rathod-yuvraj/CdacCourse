namespace CSharpFeture
{
    internal class Program
    {
        delegate bool Mydelegate(int num);
        static void Main(string[] args)
        {

            //Predicate<int> Even =x => x%2==0;
            //Predicate<int> Odd = x => x%2!=0;
            //bool odd = Odd(16);
            //Console.WriteLine(odd);
            //bool p= Even.Invoke(10);
            //Console.WriteLine(p);
            #region Action Delegate
            Action actionDel = new Action(delegate ()
            {
                Console.WriteLine("Hello Wold!");
            });

            Action myactionDel = new Action(delegate ()
            {
                Console.WriteLine("Welcom to project");
            });
            actionDel();

            #endregion

        }
    }
}
