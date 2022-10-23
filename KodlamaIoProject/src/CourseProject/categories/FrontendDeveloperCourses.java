package CourseProject.categories;

import CourseProject.entities.RegisterInfo;

public class FrontendDeveloperCourses implements ICategories {

	@Override
	public void add(RegisterInfo info) {
		System.out.println("Frontend kampı için kayıt oluşturuldu. Seçilen eğitmen: " + info.getTeacher()+ ". Seçilen programlama dili: " + info.getLanguage()  );
		
	}

}
