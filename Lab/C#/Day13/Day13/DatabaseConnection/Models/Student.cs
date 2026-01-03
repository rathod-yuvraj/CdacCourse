using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace DatabaseConnection.Models
{
    public class Student
    {
        [Key]
        [Column("Id", TypeName = "int")]
        public int Id { get; set; }
        [Column("Name",TypeName ="varchar(50)")]
        public string Name { get; set; }
        [Column("DOB",TypeName ="Date")]
        public DateOnly Dob { get; set; }
        [Column("Mark",TypeName ="int")]
        public int TotalMarks { get; set; }
    }
}
