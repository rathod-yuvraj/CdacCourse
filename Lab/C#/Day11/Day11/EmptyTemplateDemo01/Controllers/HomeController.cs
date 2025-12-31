using Microsoft.AspNetCore.Mvc;

namespace EmptyTemplateDemo01.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
