package CourseProject.business;

import CourseProject.categories.ICategories;
import CourseProject.core.logging.Logger;
import CourseProject.dataAccess.ICourseDao;
import CourseProject.entities.RegisterInfo;

public class CourseManager {
	
	private ICategories categories;
	private ICourseDao courseDao;
	private Logger logger;
	
	public CourseManager(ICategories categories, ICourseDao courseDao, Logger logger) {
		
		this.categories = categories;
		this.courseDao = courseDao;
		this.logger = logger;
		
	}
	
	public void add(RegisterInfo info) throws Exception {
		
		if (info.getPrice()<=0) {
			throw new Exception("Kurs fiyatı 0 dan büyük olmalıdır.");
		} 
		categories.add(info);
		courseDao.add();
		logger.log(info.getLanguage());
		
		
	}
	
	
	
	
	
	

}
