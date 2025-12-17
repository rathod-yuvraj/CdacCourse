namespace Report
{
    internal class Program
    {
        static void Main(string[] args)
        {

            while (true)
            {
                Console.WriteLine("Please Enter your choice:1 PDF 2.DOCX 3.EXCEL 4.XML 5.JSON");
                int choice = Convert.ToInt32(Console.ReadLine());

                ReportFactory factory = new ReportFactory();
                getReport report = factory.GetSomeReport(choice);
                report.GenerateReport();

                Console.WriteLine("DO YOU WANT TO CONTINUE ?? 'y/n'");
                string ynChoice = Console.ReadLine();

                if (ynChoice == "n")
                {
                    break;
                }
            }
        }
    }
}
public abstract class getReport
{

    protected abstract void Parse();

    protected abstract void Validate();

    protected abstract void Save();

    public virtual void GenerateReport()
    {
        //code for generating report 
         Parse();
        Validate();
        Save();
       Console.WriteLine("Report Generated ");
    }

}
public abstract class SpecialReport : getReport
{
    protected abstract void ReValidate();
    public override void GenerateReport()

    {
        //some code to generate report
        Parse();
        Validate();
        ReValidate();
        Save();// 
        Console.WriteLine("Special Report should be generated.");
    }
}
public class ReportFactory
{
    public getReport GetSomeReport(int choice)
    {
        getReport someReport=null;
        switch (choice)
        {
        case 1:
        someReport  = new PDF();
        break;
        
        case 2:
        someReport = new DOCX();
        break;
       
        case 3:
        someReport = new Excel();
        break;

        case 4:
        someReport = new XML();
        break;

        case 5:
        someReport = new JSON();
        break;

        default:
        someReport = null;

        break;


        }
        return  someReport;
     }
}

public class XML : SpecialReport
{
    protected override void Parse()
    {
        //Some corse to Parse PDF
        Console.WriteLine("XML parsed.");
    }
    protected override void Validate()
    {
        Console.WriteLine("XML VALIADTE.");

    }
    protected override void Save()
    {
        Console.WriteLine("XML SAVED");
    }
    protected override void ReValidate()
    {
        Console.WriteLine("XML RE -Validate");
    }




}

public class JSON :SpecialReport
{
    protected override void Parse()
    {
        Console.WriteLine("JSON parsed");

    }
    protected override void Validate()
    {
        Console.WriteLine("JSON validated");
    }
    protected override  void Save()
    {
        Console.WriteLine("JSON SAVED");
    }
    protected override void ReValidate()
    {
        Console.WriteLine("JSON RE-VALIDATED.");
    }





}
public class PDF : getReport
{
    protected override void Parse()
    {
        Console.WriteLine("PDF PARSED");
    }
    protected override void Validate()
    {
        Console.WriteLine("PDF validated");
    }
    protected override void Save()
    {
        Console.WriteLine("PDF SAVED");
    }
}

public class DOCX : getReport
{
    protected override void Parse()
    {
        Console.WriteLine("DOCX parsed");
    }
    protected override void Validate()
    {
        Console.WriteLine("DOCX validated");
    }
    protected override void Save()
    {
        Console.WriteLine("PDF SAVED");



    }
}
    public class Excel : getReport
    {
        protected override void Parse()
        {
            Console.WriteLine("Excel parsed");
        }
        protected override void Validate()
        {
            Console.WriteLine("Excel validated");
        }
        protected override void Save()
        {
            Console.WriteLine("Excel SAVED");



        }
    

    }
