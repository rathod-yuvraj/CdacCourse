


namespace middlewareDemo01
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();


            //  Greeting Middleware
            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("Hello, welcome to the middleware demo!\n");
                // Pass control to the next middleware
                await next(context);
            });
            //  Processing Middleware
            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("Processing your request...\n");
                // Pass control forward
                await next(context);
                // Executes after the next middleware finishes
                await context.Response.WriteAsync("Request processed successfully.\n");
            });

            //  Terminal Middleware
            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("Goodbye from the middleware demo!\n");
            });
           
            // Start the application
            app.Run();
        }
    }
}
