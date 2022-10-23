package CourseProject;

import CourseProject.business.CourseManager;
import CourseProject.categories.BackendDeveloperCourses;
import CourseProject.categories.FrontendDeveloperCourses;
import CourseProject.core.logging.FileLogger;
import CourseProject.dataAccess.JdbcCourseDao;
import CourseProject.entities.RegisterInfo;

public class Main {

	public static void main(String[] args) throws Exception {
		
		RegisterInfo info = new RegisterInfo("Engin Demiroğ", "JAVA", 1500);
		
		CourseManager courseManager = new CourseManager(new BackendDeveloperCourses(), new JdbcCourseDao(), new FileLogger());
		courseManager.add(info);
	}

}
