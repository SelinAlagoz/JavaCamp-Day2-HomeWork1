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
	
              int id;   //nesnelere verdiðimiz kimlik,diðerlerinden ayrmak için.
              String courseName;
              String educatorName;
}

