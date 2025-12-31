using Microsoft.AspNetCore.Mvc;

namespace ReturnTypesOfActionMethodDemo01.Controllers
{
    public class HomeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
