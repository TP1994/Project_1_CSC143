import java.util.Scanner;

public class Project_1 {
    public static void main(String[] args){

        int gpu = 0;
        int cpu = 0;
        int cores = 0;
        int resolution = 0;
        double multiplier = 0;
        double performanceScore = 0;
        String monitor_resolution;
        String recommendedGraphicsQuality;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the clock speed of your graphics card in Megahertz: ");
        gpu = keyboard.nextInt();

        System.out.println();

        System.out.print("Enter the clock speed of your processor in Megahertz: ");
        cpu = keyboard.nextInt();

        System.out.println();

        System.out.print("Enter the number of cores that your processor has: ");
        cores = keyboard.nextInt();

        System.out.println();

        System.out.println("What is the resolution of your monitor? ");

        System.out.println();

        System.out.println("\t1. 1280 x 720");

        System.out.println("\t2. 1920 x 1080");

        System.out.println("\t3. 2560 x 1440");

        System.out.println("\t4. 3840 x 2160");
        System.out.println();

        System.out.print("Please select from the options above: ");
        resolution = keyboard.nextInt();

        if (resolution == 1) {
            multiplier = 1;
            monitor_resolution = "1280 x 720";
        }
        else if (resolution == 2) {
            multiplier = .75;
            monitor_resolution = "1920 x 1080";
        }

        else if (resolution == 3) {
            multiplier = .55;
            monitor_resolution = "2560 x 1440";
        }
        else {
            multiplier = .35;
            monitor_resolution = "3840 x 2160";
        }


        performanceScore = ((5 * gpu)+ (cores * cpu)) * multiplier;

        if (performanceScore >= 17000)
            recommendedGraphicsQuality = "Ultra";
        else if (performanceScore > 15000)
            recommendedGraphicsQuality = "High";
        else if (performanceScore > 13000)
            recommendedGraphicsQuality = "Medium";
        else if (performanceScore > 11000)
            recommendedGraphicsQuality = "Low";
        else recommendedGraphicsQuality = "Unable to Play";


        System.out.println();
        System.out.println();

        System.out.print("Computer Graphics Quality Recommendation Tool");

        System.out.println();
        System.out.println();

        System.out.print("GPU Clock Speed: " + gpu + " MHz");
        System.out.println();
        System.out.print("CPU Clock Speed: " + cpu + " MHz");
        System.out.println();
        System.out.print("Number of cores: "+ cores);
        System.out.println();
        System.out.print("Monitor Resolution: " + monitor_resolution);
        System.out.println();
        System.out.printf("Performance Score: %,.3f",performanceScore);
        System.out.println();
        System.out.print("Recommended Graphics Quality: "+ recommendedGraphicsQuality);





    }

}
