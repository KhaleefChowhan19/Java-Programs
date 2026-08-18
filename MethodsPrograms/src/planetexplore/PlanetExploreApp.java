package planetexplore;
import java.util.Scanner;
public class PlanetExploreApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the planet radious ");
	double radi=scan.nextDouble();
	PlanetExplore explore=new PlanetExplore();
	explore.calculateSurfaceArea(radi);
	}

}
