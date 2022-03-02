import java.util.Scanner;

public class MainSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("so truong ");
		n = new Scanner(System.in).nextInt();
		School[] Schooll = new School[n];
		for (int i = 0; i < Schooll.length; i++) {
			Schooll[i] = new School();
			Schooll[i].input();

		}
		for (int i = 0; i < Schooll.length; i++) {
			Schooll[i].info();
		}
		System.out.println("nhap tu can tim");
		String kitu = new Scanner(System.in).nextLine();

		for (int i = 0; i < Schooll.length; i++) {
			if (Schooll[i].getSchoolName().toLowerCase().contains(kitu.toLowerCase().trim())) {
				
	}
		}	
	}
}