package hw1Day2;

public class Main {


	public static void main(String[] args) {
		
		Course course1=new Course(1,"Yazýlým Geliþtirici Yetiþtirme kampý (C#+Angular)","Engin Demirog");
		   // referans oluþturma,intance
		Course course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme kampý (Java+React)","Engin Demirog");
		Course course3=new Course(3,"Programlamaya Giriþ Temel Kurs","Engin Demirog");
		
	    Course[] courses = {course1,course2,course3};
		for (Course course : courses)  { //kurs sayýlarýna kadar döndür.
			System.out.println(course.courseName+course.educatorName);
		}
   
		Category category1=new Category(1,"Proglamlama");
		System.out.println(category1.ctName);
		
		CourseManager courseManager=new CourseManager();
		courseManager.finishAndContinue();
		courseManager.finishAndContinue();
		courseManager.finishAndContinue();
		
		courseManager.previousCourse();
		courseManager.previousCourse();
		courseManager.previousCourse();
		
	} 
}