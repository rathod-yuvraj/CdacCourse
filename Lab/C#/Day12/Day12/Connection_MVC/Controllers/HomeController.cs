using System.Diagnostics;
using Connection_MVC.DAL;
using Connection_MVC.Models;
using Microsoft.AspNetCore.Mvc;

namespace Connection_MVC.Controllers
{
    public class HomeController : Controller
    {
        private readonly EmpContextDb _contextDb;

        public HomeController(EmpContextDb contextDb)
        {
           _contextDb = contextDb;
        }

        public IActionResult Index()
        {
            var EmpData = _contextDb.GetAllEmp();
            return View(EmpData);
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
