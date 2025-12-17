namespace Report
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the number");
            int choice =Convert.ToInt32( Console.ReadLine());

            IReport p =new Pdf();
            p.Update();
            p.Insert();
        p.Delete();
            IReport d =new Docx();
            d.Update();
            d.Insert();
            d.Delete();
            IReport x = new XML();
            x.Update();
            x.Insert();
            x.Delete();
            x.reUpdate();

          
        }
    }



  interface IReport
    {
       public void Insert();
        public void Update();

        public void Delete();
       

          
    }
    class Pdf: IReport
    {
        public  void Insert()
        {
            Console.WriteLine("Insert the PDF");
        }

        public  void Update()
        {
            Console.WriteLine("Update the PDF");
        }

        public  void Delete()
        {
            Console.WriteLine("Delete the PDF");
        }


    }
    class Docx: IReport
    {
        public  void Insert()
        {
            Console.WriteLine("Insert the Docx");
        }

        public  void Update()
        {
            Console.WriteLine("Update the Docx");
        }

        public  void Delete()
        {
            Console.WriteLine("Delete the Docx");
        }


    }
    class XML : IReport
    {
        public void Insert()
        {
            Console.WriteLine("Insert the XML");
        }

        public void Update()
        {
            Console.WriteLine("Update the XML");
        }
        public void reUpdate()
        {
            Console.WriteLine("reUpdate the XML");

        }

        public void Delete()
        {
            Console.WriteLine("Delete the XML");
        }


    }



}