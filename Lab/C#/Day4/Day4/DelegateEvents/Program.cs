using System;

namespace DelegateEvents
{
    public delegate void MyHandler(int x);

    internal class Program
    {
        static void Main(string[] args)
        {
            Students s = new Students();

            s._Pass += s.student_Pass;
            s._Fail += s.student_Fail;

            Console.WriteLine("Enter Mark");
            s.Mark = Convert.ToInt32(Console.ReadLine());
        }
    }

    class Students
    {
        public event MyHandler _Fail;
        public event MyHandler _Pass;

        private int _Mark;

        public int Mark
        {
            get { return _Mark; }
            set
            {
                _Mark = value;
                if (_Mark > 35)
                {
                    _Pass?.Invoke(_Mark);
                }
                else
                {
                    _Fail?.Invoke(_Mark);
                }
            }
        }

        public void student_Pass(int marks)
        {
            Console.WriteLine($"CONGRATULATIONS! You passed with {marks} marks.");
        }

        public void student_Fail(int marks)
        {
            Console.WriteLine($"Sorry! You failed with {marks} marks.");
        }
    }
}
