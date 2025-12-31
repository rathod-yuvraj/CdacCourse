using Microsoft.AspNetCore.Mvc;

namespace BasicMVCDemo01.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
