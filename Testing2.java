import static java.lang.System.out;
import java.util.Scanner;

public class Testing2
{

    public static void place()
    {
        Scanner keyboard = new Scanner(System.in); 

        String city;
        city=keyboard.nextLine();

        if( !city.equals("Salem") || city.equals("Boise") || city.equals("Lincoln") || city.equals("Kansas City") || city.equals("St. Louis") || city.equals("Nashville") || city.equals("Chatanooga") || city.equals("Charleston")) {
            out.println("Unfortunately, a total solar eclipse will not be viewable in your city.");
            
                
                
        }
        
        
        
        if( city.equals("Salem") || city.equals("Boise") || city.equals("Lincoln") || city.equals("Kansas City") || city.equals("St. Louis") || city.equals("Nashville") || city.equals("Chatanooga") || city.equals("Charleston")) {
            out.println("Awesome! A total solar eclipse will be viewable in your city!");
            
            
            

            if (weather()) {
                out.println("Clear skies! You'll be able to see all of the cool phenomena that come along with a Total Solar Eclipse!");
                 
                if (city.equals("Salem")) {
                    out.println("The best viewing time is at 1020A PDT");
                } if(city.equals("Boise")) {
                    out.println("The best viewing time is at 1130P MDT");
                } if (city.equals("Lincoln")) {
                    out.println("The best viewing time is at 105P CDT");
                } if (city.equals("Kansas City")) {
                    out.println("The best viewing time is at  110P CDT");
                } if (city.equals("St. Louis")) {
                    out.println("The best viewing time is at 120P CDT");
                } if (city.equals("Nashville")) {
                    out.println("The best viewing time is at 130P CDT");
                } if (city.equals("Chatanooga")) {
                    out.println("The best viewing time is at 145P CDT");
                } if (city.equals("Charleston")) {
                    out.println("The best viewing time is at 150P CDT");
                } else {
                    out.println("Some overcast is possible, but still worth heading outside to view!");

                }
                
            }}
                
                
                


    } 

    public static boolean weather()
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("What is the forecast for August 21, 2017 in your location? Options: Sunny or Cloudy\n");

        String weather=keyboard.nextLine();

        if (weather.equals("Sunny")) {
            return true;

        } else {
            return false;

        }

    }

    public static void main(String [] args )
    {
        Scanner keyboard = new Scanner(System.in); 

        out.println("Hello, welcome to your solar eclipse viewing time calculator!\nA total solar eclipse is a rare and exciting event!\n\nPlease answer a few questions to determine the best time and place in your area to view the total solar eclipse.\n");
        out.println("What city will you be in during the solar eclipse? \nOptions are : Salem, Boise, Lincoln, Kansas City,\nSt. Louis, Nashville, Chatanooga, Charleston\n");
        place(); 
        
        out.println("");
        
        out.println("Check out: \n https://eclipse2017.nasa.gov/sites/default/files/eclipse_full_map.pdf \n for optimal viewing times and partial eclipse viewings in other cities.");

    }
}
