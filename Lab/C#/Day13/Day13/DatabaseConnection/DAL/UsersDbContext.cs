using Microsoft.EntityFrameworkCore;

namespace DatabaseConnection.DAL
{
    public class UsersDbContext : DbContext
    {
        private readonly string? _connectionString;

        //public UsersContextDB() { }
        //public UsersContextDB(IConfiguration config)
        //{
        //    _connectionString=config.GetConnectionString("DataDb");
        //}

        public DbSet<Student> students { get; set; }
        public UsersDbContext(DbContextOptions options):base(options)
        {
        }
    }
}
