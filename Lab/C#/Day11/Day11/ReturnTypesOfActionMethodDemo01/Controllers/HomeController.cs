using Microsoft.AspNetCore.Mvc;

namespace ReturnTypesOfActionMethodDemo01.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public ActionResult About()
        {
            return View();
        }
        public ActionResult<string> Contact()
        {
            return "Home Page";
        }
        public ActionResult<int> GetNumber()
        {
            return 96234;
        }

    }
}
