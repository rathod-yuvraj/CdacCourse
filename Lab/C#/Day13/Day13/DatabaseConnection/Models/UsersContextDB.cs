using Microsoft.EntityFrameworkCore;

namespace DatabaseConnection.Models
{
    public class UsersContextDB : DbContext
    {
        private readonly string? _connectionString;

        //public UsersContextDB() { }
        //public UsersContextDB(IConfiguration config)
        //{
        //    _connectionString=config.GetConnectionString("DataDb");
        //}

        public DbSet<Student> students { get; set; }
        public UsersContextDB(DbContextOptions options):base(options)
        {
        }
    }
}
