package MCA;

public class Application {

	public static void main(String[] args) {
		
		
		String[] student_name= new String[]{"NITIN","GAURAV","HIMANSHU"};
		String[] subject_name= new String[]{"JAVA","R","C","ORACLE"};
		MCA_1 mca1=new MCA_1("Marvadi _no_1", "marvadi", "rajkot", student_name, subject_name);
		int numberofStudents= mca1.numberOfStudent();
		System.out.println("Number of student : "+numberofStudents);
		
		String[] student_MCA3=new String[5];
		student_MCA3[0]="Data Structure";
		student_MCA3[1]="Algorithm";
		student_MCA3[2]="Android";
		student_MCA3[3]="IOS";
		student_MCA3[4]="Machine Learing";
		
		MCA_1 mca3=new MCA_3("Marvadi _no_1", "marvadi", "rajkot", student_name, subject_name,student_MCA3);
		
	}
}
