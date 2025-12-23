namespace Serialize
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day4\DemoSerialize\Files\data.xml";
            Emp emp = new Emp();
            emp.Id = 101;
            emp.Name = "AVENGERS";
            emp.Address ="NEWYORK ";

            #region XML Serialization 
            FileStream fs = null;

            if (File.Exists(filePath))
            {
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            }

            XmlSerialize xr = new XmlSerialize(typeof(Emp));
            xr.Serialize(fs, emp);
            fs.Close();
            Console.WriteLine("Done");
            #endregion

        }
    }
    // Gives permission to serialize the class to CLR
    [Serializable]
    public class Emp
    {
        private int _Id;
        private string _Name;

        [NonSerialized]// do not have permission to serialize this field
        private string _Address;

        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }
        public int Id
        {
            get { return _Id; }
            set { _Id = value; }
        }

    }
}   
    
