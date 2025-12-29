using Microsoft.Data.SqlClient;

namespace LoginDemo02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connStr =
                "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Users;Integrated Security=True;";

          

            Console.Write("Enter Username: ");
            string username = Console.ReadLine();

            Console.Write("Enter Password: ");
            string password = Console.ReadLine();

            SqlConnection con = null;
            SqlCommand cmd = null;

            try
            {
                con = new SqlConnection(connStr);

                string query =
                    "SELECT COUNT(*) FROM UserLogin WHERE Username=@username AND Password=@password";

                cmd = new SqlCommand(query, con);
                cmd.Parameters.AddWithValue("@username", username);
                cmd.Parameters.AddWithValue("@password", password);

                con.Open();
                int count = (int)cmd.ExecuteScalar();

                if (count > 0)
                {
                    Console.ForegroundColor = ConsoleColor.Green;
                    Console.WriteLine("\nLogin Successful");
                }
                else
                {
                    Console.ForegroundColor = ConsoleColor.Red;
                    Console.WriteLine("\nInvalid Username or Password");
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex.Message);
            }
            finally
            {
             
                if (con != null && con.State == System.Data.ConnectionState.Open)
                    con.Close();

                if (cmd != null)
                    cmd.Dispose();
            }

            Console.ResetColor();
            Console.ReadLine();
        }
    }
}
