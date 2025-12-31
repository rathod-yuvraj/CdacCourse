using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRoutingDemo01.Controllers
{
    public class AboutController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
