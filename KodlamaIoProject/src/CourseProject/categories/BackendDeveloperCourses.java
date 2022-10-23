package CourseProject.categories;

import CourseProject.entities.RegisterInfo;

public class BackendDeveloperCourses implements ICategories {

	@Override
	public void add(RegisterInfo info) {
		System.out.println("Backend kampı için kayıt oluşturuldu. Seçilen eğitmen: " + info.getTeacher()+ ". Seçilen programlama dili: " + info.getLanguage()  );
		
	}

}
