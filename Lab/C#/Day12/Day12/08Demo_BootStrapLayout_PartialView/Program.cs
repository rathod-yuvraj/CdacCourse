namespace _08Demo_BootStrapLayout_PartialView
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            //builder.
            var app = builder.Build();

            app.UseStaticFiles();
            app.MapDefaultControllerRoute();


            app.Run();
        }
    }
}
