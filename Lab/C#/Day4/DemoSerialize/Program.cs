using System.Xml.Serialization;
using System.Text.Json.Serialization;
using System.Text.Json;
namespace DemoSerialize
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filepath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day4\DemoSerialize\Files\data.xml";


            Emp emp = new Emp();
            emp.Id = 144;
            emp.Name ="LUKE";
            emp.Address ="STARAWRS";
            Type type = emp.GetType();
            XmlSerializer xr = new XmlSerializer(type);
            #region XML Serializtion
            FileStream fs = null;
            if (File.Exists(filepath))
            {
                fs = new FileStream(filepath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            }
            XmlSerializer xr = new XmlSerializer(typeof(Emp));
            xr.Serialize(fs, emp);
            fs.Close();
            Console.WriteLine("DONE");
        }

        public class Emp
        {
            private int _Id;
            private string _Name;
            private string _Address;

            [XmlIgnore]
            [JsonIgnore]
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
}