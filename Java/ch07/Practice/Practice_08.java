package Practice;

import java.util.Scanner;

public class Practice_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String title,artist,country,year;

		System.out.print("����: ");
		title = scan.nextLine();
		System.out.print("����: ");
		artist = scan.nextLine();
		System.out.print("����: ");
		year = scan.nextLine();
		System.out.print("����: ");
		country = scan.nextLine();
		
		Song song = new Song(title,artist,year,country);
		
		song.show();

	}

}
