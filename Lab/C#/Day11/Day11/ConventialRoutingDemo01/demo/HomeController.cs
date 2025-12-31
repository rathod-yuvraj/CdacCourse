using Microsoft.AspNetCore.Mvc;

namespace ConventialRoutingDemo01.demo
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
