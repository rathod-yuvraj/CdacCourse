using DemoBVSAttribute;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.Json.Serialization;
namespace Demo_Application
{
    internal class Program
    {

        static void main(string[] args)
        {


            string asmPath = @"C:\Users\IET\Desktop\250845920064\Lab\C#\Day4\DemoBVSAttribute\bin\Debug\net8.0DemoBVSAttribute.dll";
            Assembly asm = Assembly.LoadFrom(asmPath);
            Type[] allTypes = asm.GetTypes();
            for (int i = 0; i< allTypes.Length; i++)
            {

                Type type = allTypes[i];
                //console.WriteLine(type.Name);
                Attribute[] allAttributes = type.GetCustomAttributes(typeof(Attribute).ToArray();
                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];
                    if (attr is  BonaventureSystemsAttribute)
                    {
                        BonaventureSystemsAttribute bvsAttr = attr as BonaventureSystemsAttribute;

                        Console.WriteLine($"Class {type.Name}is develpoped by {bvsAttr.DeveloperName} of (c) {bvsAttr.Company}");
                    }
                    if(attr is SerializableAttribute)
                    {
                        Console.WriteLine($"Class{type.Name} is marked as Seriazable");

                    }












                }






















            }
















        }
    
    }


}
 
    
       
        

            
    
    
        
        

    

