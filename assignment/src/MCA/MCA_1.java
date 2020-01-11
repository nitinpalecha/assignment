package MCA;

public class MCA_1 {

	private String university_code;
	private String university_name;
	private String address;
	private String[] student_name;
	private String[] subject_name;
	
	public MCA_1(String university_code, String university_name,
			String address, String[] student_name, String[] subject_name) {
		super();
		this.university_code = university_code;
		this.university_name = university_name;
		this.address = address;
		this.student_name = student_name;
		this.subject_name = subject_name;
	}
	
	public int numberOfStudent(){
		return this.student_name.length;
	}
	
}
