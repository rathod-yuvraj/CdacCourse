using Microsoft.VisualBasic;
using System;
using System.ComponentModel;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace FileIO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day5\Day5\FileIO\File\first.txt";

            #region fileWrite
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //StreamWriter writter = new StreamWriter(fs);
            //writter.WriteLine(" yuvraj rathod");
            //writter.Flush();
            //writter.Close();
            //fs.Close();
            //Console.WriteLine("Done.");
            #endregion


            #region ReadFile
            //FileStream fs = null;

            //if (File.Exists(filePath))
            //{
            //    fs=new FileStream(filePath, FileMode.Open, FileAccess.Read);
            //}
            //else
            //{
            //    Console.WriteLine("File Not Found");
            //}
            //StreamReader reader = new StreamReader(filePath);
            //string context = reader.ReadToEnd();
            //Console.WriteLine(context);
            //reader.Close();
            //fs.Close(); 
            #endregion

            string sfilePath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day5\Day5\FileIO\File\mulline.txt";
            #region MultipleLineWrite
            //string[] line =
            //{
            //    "this is the first line", "this is the second line ", "this is third line"
            //};
            //File.WriteAllLines
            //    (filepath, line);
            //Console.WriteLine("multiple line written successfully");

            #endregion


            #region readMultipleline
            //    if (File.Exists(filepath))
            //    {
            //        string[] line=File.ReadAllLines(filepath);
            //        Console.WriteLine("Content of Files ");
            //        foreach (string item in line)
            //        {
            //            Console.WriteLine(item);   
            //        }
            //    }
            //    else {
            //        Console.WriteLine("File Not FoundS");
            //            } 
            #endregion

            //Write a program to count the number of lines in a text file.
            //if (File.Exists(filepath))
            //{
            //    string[] line=File.ReadAllLines(filepath);
            //    int count=line.Length;
            //    Console.WriteLine(count);
            //}

            //Write a program to copy the contents of one file to another file.
            //if (File.Exists(sfilePath))
            //{
            //    File.Copy(sfilePath, filepath, true);
            //    Console.WriteLine($"Content of{sfilePath} to the {filepath} .!");
            //}
            //Write a program to delete a file if it exists
            //if (File.Exists(filepath))
            //{
            //    File.Delete(filepath);
            //}
            //else
            //{
            //    Console.WriteLine("File Not Found");
            //}

            #region  count the number
            //Write a program to count the number of words in a text file. 
            if (File.Exists(sfilePath))
            {
                int worldcount = 0;
                string[] line = File.ReadAllLines(sfilePath);
                foreach (string item in line)
                {
    
   string[] words = item.Split(new char[] { ' ', '\t', ',', '.', '!', '?' }, StringSplitOptions.RemoveEmptyEntries);
                    //StringSplitOptions.RemoveEmptyEntries → ensures empty strings are not counted.
                    worldcount  += words.Length;
                    

                }
                Console.WriteLine($"Total Number Word in file.. {worldcount}");
            }
            #endregion

        }
    }
}
