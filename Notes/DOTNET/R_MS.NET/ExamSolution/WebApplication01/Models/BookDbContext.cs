using Microsoft.EntityFrameworkCore;

namespace WebApplication01.Models
{
    public class BookDbContext
    {
       
        
            public BookDbContext(BookDbContext bookDb)
        {
            bookDb=bookDb;
        }

        public DbSet<Books> books { get; set; }
    }
}
