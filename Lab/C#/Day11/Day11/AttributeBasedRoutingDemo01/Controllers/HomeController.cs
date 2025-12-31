using Microsoft.AspNetCore.Mvc;

namespace AttributeBasedRoutingDemo01.Controllers
{
    [Route("home")]
    public class HomeController : Controller
    {

        [Route("/")]
        [Route("index")]

        public IActionResult Index()
        {
            return View();
        }

        [Route("about")]
        public IActionResult About()
        {
            return View();
            //return RedirectToAction("About");
        }


    }
}
