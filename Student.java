package Encapsulasi;

public class Student {
	    private String name;
    private String address;
    private String[] courses;
    private int[] grades;
    private int numCourses;

    public Student(String name, String address) {
	this.name = name;
	this.address = address;
	this.courses = new String[30];
	this.grades = new int[30];
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
	return "Student[name=" + name + ",address=" + address + "]";
    }

    public void addCourseGrade(String course, int grade) {
	courses[numCourses] = course;
	grades[numCourses] = grade;
	numCourses++;
    }

    public void printGrades() {
	System.out.print(this);
	for(int i=0; i<numCourses; i++){
	    System.out.print(" " + courses[i] + ":" + grades[i]);
	}
	System.out.println();
    }

    public double getAverageGrade() {
	int sum = 0;
	for(int i=0; i<numCourses; i++){
	    sum += grades[i];
	}
    }

}
