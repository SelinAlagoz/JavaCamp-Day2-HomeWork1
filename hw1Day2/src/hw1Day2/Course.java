package hw1Day2;

public class Course {
	public Course () {
		
		
	}
	
    public Course (int id,String courseName,String educatorName) {
	this();
	this.id=id;
	this.courseName=courseName;
	this.educatorName=educatorName;
			
	}
	
              int id;   //nesnelere verdi�imiz kimlik,di�erlerinden ayrmak i�in.
              String courseName;
              String educatorName;
}

