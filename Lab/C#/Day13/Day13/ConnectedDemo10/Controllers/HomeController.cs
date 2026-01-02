using ConnectedDemo10.DAL;
using ConnectedDemo10.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace ConnectedDemo10.Controllers
{
    public class HomeController : Controller
    {
      

        private readonly DataDbContext _db;

        public HomeController(DataDbContext db)
        {
            _db = db;
        }

        public IActionResult Index()
        {
            var stud=_db.GetAllData();
            return View(stud);
        }
        public IActionResult CreateStud()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
