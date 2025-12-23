namespace Files
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Emp emp = new Emp();
            emp.Id = 1;
            emp.Name = "Captain";
            emp.Address = "Rogers";

            string filePath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day4\File\file\s3.txt";
                ;

            FileStream fs = null;

            if(File.Exists(filePath))
            {
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(filePath,FileMode.Append,FileAccess.Write);
            }
            StreamWriter writter = new StreamWriter(fs);
            writter.WriteLine("Captain hi IM Captain");
            writter.Flush();
            writter.Close();
            fs.Close();
            Console.WriteLine("Done.");

        }
    }
    public class Emp
    {
        private int _id;
        private string _name;
        private string _Address;

        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }

        public string Name
        {
            get { return _name; }
            set { _name = value; }

        }
        public int Id
        {
            get { return _id; }
            set { _id = value; }
        }
    }

}
