namespace App
{
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Enter your Db choice .1 SqlServer,2.MySql Server 3.Oracle Server");


                DataBaseFactory factory = new DataBaseFactory();
                Database someDatabaseObject = factory.GetSomeDatabase(dbChoice);
                Console.WriteLine("Enter db operation choice : 1.Insert, 2.Update,3.Delete");
                int opChoice = Convert.ToInt32(Console.ReadLine());
                switch (opChoice)
                {
                    case 1:
                        someDatabseObject.Insert();
                        break;
                    case 2:
                        someDatabaseObject.Update();
                        break;
                    case 3:
                        someDatabaseObject.Delete();
                        break;
                    default:
                        Console.WriteLine("INVALID DB OPERATION");
                        break;
                }
                        Console.WriteLine("Invalid Db operation Choice");
                        break;
                        Console.WriteLine("Do you want to continue ? y/n");
                        string ynChoice = Console.ReadLine();
                        if (ynChoice == "n")
                        {
                            break;
                        }

                
            } 
        }
    }
}
    public abstract class Database
    {
    public Logger _logger = null;
    public Database()
    {
        _logger = _logger.GetLogger();
    }
    protected abstract void Doinsert();
    protected abstract void DoUpdate();
    protected abstract void Delete();
    protected abstract string GetDataBaseName();





