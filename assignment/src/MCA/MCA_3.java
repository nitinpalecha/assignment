package MCA;

public class MCA_3 extends MCA_1 {

	private String[] student_MCA3;
	
	public MCA_3(String university_code, String university_name,
			String address, String[] student_name, String[] subject_name,String[] student_MCA3) {
		super(university_code, university_name, address, student_name, subject_name);
		this.student_MCA3=student_MCA3;
	}

}
