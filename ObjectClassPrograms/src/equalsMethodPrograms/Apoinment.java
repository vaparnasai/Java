package equalsMethodPrograms;

public class Apoinment {
	public String doctorName;
	public String patientName;
	public String apoinmentTime;
	public String deptName;
	
	public Apoinment(String doctorName, String patientName,String apoinmentTime ,String deptName)
	{
		this.doctorName=doctorName;
		this.patientName=patientName;
		this.apoinmentTime=apoinmentTime;
		this.deptName=deptName;
	}
	@Override
	public String toString()
	{
		return "Doctor Name"+doctorName+"Department Name :"+deptName+"Appoinment Time :"+apoinmentTime;
		
	}
	public void apoinmentDetails()
	{
		System.out.println("Doctor Name :"+doctorName);
		System.out.println("Patient Name :" +patientName);
		System.out.println("Apoinment Time :" +apoinmentTime);
		System.out.println("Department Name :" +deptName);
		System.out.println("-----------------------------------");
	}
}
