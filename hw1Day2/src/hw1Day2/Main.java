package hw1Day2;

public class Main {


	public static void main(String[] args) {
		
		Course course1=new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme kamp� (C#+Angular)","Engin Demirog");
		   // referans olu�turma,intance
		Course course2=new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme kamp� (Java+React)","Engin Demirog");
		Course course3=new Course(3,"Programlamaya Giri� Temel Kurs","Engin Demirog");
		
	    Course[] courses = {course1,course2,course3};
		for (Course course : courses)  { //kurs say�lar�na kadar d�nd�r.
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