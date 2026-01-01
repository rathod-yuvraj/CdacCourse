using Connection_MVC.Models;
using Microsoft.Data.SqlClient;

namespace Connection_MVC.DAL
{
    public class EmpContextDb
    {
        private readonly string? _ConnectionString;
        public EmpContextDb(IConfiguration config) {
            _ConnectionString = config.GetConnectionString("DataDb");
            Console.WriteLine("connection");
        }
        public List<Emp> GetAllEmp()
        {
            List<Emp> Ilis = new List<Emp>();
            using (SqlConnection conn = new SqlConnection(_ConnectionString))
            {
                conn.Open();
                using (SqlCommand cmd = new SqlCommand("select * from Emp1",conn))
                {
                    using (SqlDataReader reader = cmd.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            Ilis.Add(new Emp()
                            {
                                Id = Convert.ToInt32(reader["Id"]),
                                name = reader["name"].ToString(),
                                Address = reader["Address"].ToString()
                            });
                        }
                    }

                }
            }
            return Ilis;
            }
    }
}
