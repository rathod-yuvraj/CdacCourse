namespace MULTICASTINGDELEGATE
{
    public delegate void MyEventHandler();
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("IS GUEST ARRIVED y/n!");
            string isGuestArrived = Console.ReadLine();
            IetAnnualEvent obj = new IetAnnualEvent();
            //handling our multi cast delegates
            MyEventHandler handler = obj.Welcome;
            handler +=obj.Welcome;
            if (isGuestArrived == "y")
            {
                handler += obj.GuestSpeech;
            }
            else
            {
                handler -= obj.GuestSpeech;
            }
            handler += obj.Welcome;
            handler += obj.Dance;
            handler += obj.Dinner;
            handler += obj.GOODBYE;
            //you should always call the handler oibject 
            handler ();

        }
    }

    public class IetAnnualEvent
    {
        public void Welcome()
        {
            Console.WriteLine("Welcome to IET EVENTS JUNIORS");
        }
        public void Welcome2() {
            Console.WriteLine("Host: IM YOUR HOSTS IM WELCOMING U ALL");
        }
        public void GuestSpeech()
        {
            Console.WriteLine("blah gggggoooooodddddd");

        }
        public void Dance() 
        {
            Console.WriteLine("LETS DANCE");
        }
        public void Dinner() 
        {
            Console.WriteLine("LETS EAT");
        }
        public void GOODBYE() 
        {
            Console.WriteLine("im going bye");
        }
        public void EndEvent() 
        {
            Console.WriteLine("BYREEEEEEE");
        }
    }
}
