using Microsoft.AspNetCore.Mvc;

namespace ConventialRoutingDemo01.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
