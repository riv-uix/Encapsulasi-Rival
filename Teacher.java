package Encapsulasi;

public class Teacher {
	    private String name;
    private String address;
    private String[] courses;
    private int numCourses;

    public Teacher(String name, String address) {
	this.name = name;
	this.address = address;
	this.courses = new String[5];
	this.numCourses = 0;
    }

    public String getName() {
	return name;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String toString() {
	return "Teacher[name=" + name + ",address=" + address + "]";
    }

    public boolean addCourse(String course) {
	for(int i=0; i<numCourses; i++){
	    if(courses[i].equals(course)) return false;
	}
	courses[numCourses] = course;
	numCourses++;
	return true;
    }

    public boolean removeCourse(String course) {
	for(int i=0; i<numCourses; i++){
	    if(courses[i].equals(course)){
		for(int j=i; j<numCourses-1; j++){
		    courses[j] = courses[j+1];
		}
		courses[numCourses-1] = null;
		numCourses--;
		return true;
	    }
	}
	return false;
    }

public String getSalary() {
	return null;
}

public void setSalary(int i) {
}

}
