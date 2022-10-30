
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Rini", "Cianjur");
        System.out.println(s1);
        s1.addCourseGrade("Math", 92);
        s1.addCourseGrade("English", 90);
        s1.addCourseGrade("Geologi", 87);
        s1.addCourseGrade("Elektro", 86);
        s1.printGrades();
        System.out.println("Average is " + s1.getAverageGrade());
        Teacher t1 = new Teacher("Jack", "789 Main St.");
        System.out.println(t1);
        String [] courses = {"Math", "English", "Geologi", "Elektro"};
        for(String course: courses){
            if(t1.addCourse(course)){
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }
        for(String course: courses){
            if(t1.removeCourse(course)){
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }
    }
}
