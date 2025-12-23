namespace Deserialize
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day4\DemoSerialize\Files\data.xml";
            //string filePath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day4\DemoSerialize\Files\data.json";

            Emp emp = new Emp();
            emp.Id = 108;
            emp.Name = "Thor";
            emp.Address = "ASGARD";

            Type type = emp.GetType();
            XmlDeserialize xr = new XmlSerializer(type);

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

            XmlSerializer xr = new XmlSerializer(typeof(Emp));
            xr.Serialize(fs, emp);
            fs.Close();
            Console.WriteLine("Done");
            #endregion

            //#region XML DeSerialization
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //XmlSerializer xr = new XmlSerializer(typeof(Emp));
            //Emp empData = xr.Deserialize(fs) as Emp;
            //fs.Close();
            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");
            //#endregion

            //#region JSON Serialization 

            //FileStream fs = null;

            //if (File.Exists(filePath1))
            //{
            //    fs = new FileStream(filePath1, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath1, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //JsonSerializer.Serialize<Emp>(fs, emp);
            //fs.Close();
            //Console.WriteLine("Done");
            //#endregion

            //#region JSON DeSerialization
            //FileStream fs = null;

            //if (File.Exists(filePath1))
            //{
            //    fs = new FileStream(filePath1, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //Emp empData = JsonSerializer.Deserialize<Emp>(fs);
            //fs.Close();
            //Console.WriteLine($"Id = {empData.Id}, Name = {empData.Name}, Address= {empData.Address}");
            //#endregion

        }
    }

    // Giving  permission to serialize so that class to CLR
    
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