using System.Diagnostics;
using DatabaseConnection.Models;
using Microsoft.AspNetCore.Mvc;

namespace DatabaseConnection.Controllers
{
    public class HomeController : Controller
    { 
        private readonly UsersContextDB _DbConnectionString;

       
        public HomeController(UsersContextDB context)
        {
            _DbConnectionString=context;
        }
        public IActionResult Index()

        {

            ViewBag.ctr="Yuvraj";
            var StudData = _DbConnectionString.students.ToList();
            return View(StudData);
        }
        [HttpGet]
        public IActionResult Create()
        {
            return View();
           
        }
        public IActionResult AfterCreate(Student stud)
        {
            _DbConnectionString.students.Add(stud);
            _DbConnectionString.SaveChanges();
            return RedirectToAction("Index");

        }
        [HttpGet]
        public IActionResult Edit(int id)
        {
            Student stud = _DbConnectionString.students.Find(id);
            return View(stud);
        }
        [HttpPost]
        public IActionResult Edit(Student stud ,int id)
        {
           Student sd=_DbConnectionString.students.Find(id);
            sd.Name=stud.Name;
            sd.Dob=stud.Dob;
            sd.TotalMarks=stud.TotalMarks;
   
            _DbConnectionString.SaveChanges();
            return RedirectToAction("Index");
        }
        public IActionResult Details(int id)
        {
            var stud = _DbConnectionString.students.Find(id);
            return View(stud);
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
