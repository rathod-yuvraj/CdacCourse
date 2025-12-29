namespace LoginDemo01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Seed users
            List<User> users = new List<User>
            {
                new User { Username = "admin", Password = "admin" },
                new User { Username = "user", Password = "user" }
            };


            // Input
            Console.Write("Enter Username: ");
            string inputUsername = Console.ReadLine();

            Console.Write("Enter Password: ");
            string inputPassword = Console.ReadLine();

           
            bool isValidUser = users.Any(u =>
                u.Username.Equals(inputUsername, StringComparison.OrdinalIgnoreCase)
                && u.Password == inputPassword
            );

            // Result
            if (isValidUser)
            {
                Console.WriteLine("Login Successful!");
            }
            else
            {
                Console.WriteLine("Invalid Username or Password.");
            }

            Console.ReadKey();
        }

        class User
        {
            public string Username { get; set; }
            public string Password { get; set; }
        }
    }
}
