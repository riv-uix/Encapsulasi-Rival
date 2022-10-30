package Encapsulasi;

import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	int n;
	Scanner in = new Scanner(System.in);
	System.out.print("Masukkan jumlah mahasiswa: ");
	n = in.nextInt();
	Student[] s = new Student[n];
	for(int i=0; i<n; i++){
	    System.out.print("Masukkan nama mahasiswa: ");
	    String name = in.next();
	    System.out.print("Masukkan alamat mahasiswa: ");
	    String address = in.next();
	    s[i] = new Student(name, address);
	    System.out.print("Masukkan jumlah mata kuliah: ");
	    int numCourses = in.nextInt();
	    for(int j=0; j<numCourses; j++){
		System.out.print("Masukkan nama mata kuliah: ");
		String course = in.next();
		System.out.print("Masukkan nilai mata kuliah: ");
		int grade = in.nextInt();
		s[i].addCourseGrade(course, grade);
	    }


    }
}
}
