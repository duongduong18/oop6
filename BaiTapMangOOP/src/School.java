import java.util.Scanner;

public class School {
	private String schoolName, address;
	private int id;

	public void input() {
		System.out.print("nhap id: ");
		id = new Scanner(System.in).nextInt();
		System.out.print("nhap ten truong: ");
		schoolName = new Scanner(System.in).nextLine();
		System.out.print("nhap dia chi: ");
		address = new Scanner(System.in).nextLine();
	}

	public void info() {

		System.out.println("ID " + this.id);
		System.out.println("ten truong " + this.schoolName);
		System.out.println("Dia Chi" + this.address);
		System.out.println("---------");
	}

	public School() {
	}

	public School(int id, String schoolName, String address) {
		this.id = id;
		this.schoolName = schoolName;
		this.address = address;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
