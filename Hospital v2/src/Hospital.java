
public class Hospital {
		private static final int MAX_PATIENTS = 10;
		private Patient[] patients;
		private int registered_Patients;
		
	public Hospital() {
		patients = new Patient[MAX_PATIENTS];
		registered_Patients = 0;
	}
	
	public void addPatients(Patient patient) {
		if(registered_Patients <=MAX_PATIENTS) {
			patients[registered_Patients] = patient;
			registered_Patients++;
		} else {
			System.out.println("Przekroczono limit pacjentów w danym dniu");
		}
	}
	
	public void printPatiens() {
		for (int i = 0; i < registered_Patients; i++) {
			System.out.println(patients[i].getFirstName() + " " +  patients[i].getPesel());
			
		}
	}
	
	
	
}