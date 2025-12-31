using Microsoft.AspNetCore.Mvc;

namespace ConventialRoutingDemo01.Controllers
{
    public class AboutController : Controller
    {
        public IActionResult Index()
        {
            return View();


        }
    }
}
