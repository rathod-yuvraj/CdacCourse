using Microsoft.AspNetCore.Mvc;

namespace MVCTemplateDemo02.Controllers
{
    public class DashboardController1 : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
