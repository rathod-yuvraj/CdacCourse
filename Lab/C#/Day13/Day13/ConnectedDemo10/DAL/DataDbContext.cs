using ConnectedDemo10.Models;
using Microsoft.Data.SqlClient;

namespace ConnectedDemo10.DAL
{
    public class DataDbContext
    {
        private readonly string _conString;

        public DataDbContext(IConfiguration config)
        {
            _conString = config.GetConnectionString("DataDb");
        }

        public List<Student> GetAllData()
        {
            List<Student> students = new List<Student>();

            using (SqlConnection conn = new SqlConnection(_conString))
            {
                conn.Open();

                using (SqlCommand cmd = new SqlCommand("SELECT * FROM Student", conn))
                {
                    using (SqlDataReader reader = cmd.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            students.Add(new Student
                            {
                                Id = Convert.ToInt32(reader["Id"]),
                                Roll = Convert.ToInt32(reader["Roll"]),
                                Name = reader["Name"].ToString(),
                                Address = reader["Address"].ToString(),
                                TotalMarks = Convert.ToInt32(reader["TotalMarks"]),
                                Dob = reader["Dob"] == DBNull.Value
    ? null
    : DateOnly.FromDateTime((DateTime)reader["Dob"])

                            });
                        }
                    }
                }
            }

            return students;
        }
    }
}
