namespace EmptyTemplateDemo01
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();



            //app.MapGet("/", () => "Hello World!");
            //app.MapPost("/post", () => "Welecome To Post Method");

            app.Use(async (context, next) => {
                await context.Response.WriteAsync("Hello 00001!!");
               
                next(context);
                await context.Response.WriteAsync("\nHow are you00002!!");
            });
            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("\nHi0003");
                next(context);
            });
            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("\nThis Run Method");
            });
            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("\nWelcome00004");
                next(context);
            });
            app.Run();
        }
    }
}
