using System;
using System.Collections.Generic;

namespace WebApplication12.Models
{
    public partial class Book
    {
        public int BId { get; set; }
        public string? Title { get; set; }
        public string? Author { get; set; }
        public string? PubYear { get; set; }
        public int? Genre { get; set; }
    }
}
