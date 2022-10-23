package CourseProject.entities;

public class RegisterInfo {

	private String teacher;
	private String language;
	private double price;


	public RegisterInfo(String teacher, String language, double price) {
		super();
		this.teacher = teacher;
		this.language = language;
		this.price = price;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
