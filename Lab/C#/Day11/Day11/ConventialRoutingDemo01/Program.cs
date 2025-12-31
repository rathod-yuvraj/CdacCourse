namespace ConventialRoutingDemo01
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();



            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Home}/{action=Index}/{id?}"
                );
            app.MapControllerRoute(
                name:"h",
                pattern:"{controller=About}/{action=Index}"
                );
            app.MapControllerRoute(
                name:"a",
                pattern:"{controller=Home}/{action=UserCredentials}/{user}/{pwd}"
                );
            app.Run();
        }
    }
}
