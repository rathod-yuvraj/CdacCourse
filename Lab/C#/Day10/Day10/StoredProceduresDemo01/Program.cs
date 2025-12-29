using Microsoft.Data.SqlClient;

namespace StoredProceduresDemo01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=yuvraj;Integrated Security=True;Pooling=False;Encrypt=True;Trust Server Certificate=False";

            //InsertDept(connStr, "HR");
            
            DeleteById(connStr, 11);
            DeleteById(connStr, 12);
            DeleteById(connStr, 9);
            Console.WriteLine("Done");
        
        }
        #region InserDept
        //public static void InsertDept(string constr, string DeptName)
        //{
        //    using (SqlConnection conn = new SqlConnection(constr))
        //    {
        //        conn.Open();
        //        using (SqlCommand cmd = conn.CreateCommand())
        //        {
        //            cmd.CommandType=System.Data.CommandType.StoredProcedure;
        //            cmd.CommandText="InsertDepartment";
        //            cmd.Connection = conn;
        //            cmd.Parameters.AddWithValue("@DepartmentName", DeptName);
        //            cmd.ExecuteNonQuery();

        //        }


        //    }
        //}
        #endregion
        #region InsertEmployee
        public static void InsertEmp(string conStr, string EmpName, int DeptId)
        {
            using (SqlConnection conn = new SqlConnection(conStr))
            {
                conn.Open();
                using (var command = new SqlCommand("InsertEmployee", conn))
                {
                    command.CommandType=System.Data.CommandType.StoredProcedure;
                    command.Parameters.AddWithValue("@EmployeeName", EmpName);
                    command.Parameters.AddWithValue("@DepartmentId", DeptId);
                    command.ExecuteNonQuery();

                }
            }
        }
        #endregion

        #region DeleteById Employee
        //public static void DeleteById(string constr, int DelById)
        //{
        //    using (SqlConnection conn = new SqlConnection(constr))
        //    {
        //        conn.Open();
        //        using (var command = new SqlCommand("DeleteEmployee", conn))
        //        {
        //            command.CommandType=System.Data.CommandType.StoredProcedure;
        //            command.Parameters.AddWithValue("@EmployeeId", DelById);
        //            command.ExecuteNonQuery();
        //        }
        //    }
        //} 
        #endregion

    }
    }
