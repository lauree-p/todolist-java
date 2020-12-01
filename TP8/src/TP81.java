import java.util.Scanner;

public class TP81 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int i;
		float xx, yy;
		Point[] tableau_points = new Point[3];
		Scanner sc;
		
		sc = new Scanner(System.in, "iso-8859-1");
		System.out.println("Saisie des points");
		
		for (int j = 0; j < 3; j++) {
			Point point = new Point();
			System.out.println("Releve N:" + j);
			point.setNum(j);
			
			System.out.println("X = ");
			xx = sc.nextFloat();
			point.setX(xx);
			
			System.out.println("Y = ");
			yy = sc.nextFloat();
			point.setY(yy);
			
			tableau_points[j] = point;
			
		}

		System.out.println("Relecture");
		
		for (Point point: tableau_points) {
			System.out.print("Voici le relev� du point num�ro : ");
			System.out.println(point.getNum());
			System.out.println("X = " + point.getX());
			System.out.println("Y = " + point.getY());
		}
	}

}
