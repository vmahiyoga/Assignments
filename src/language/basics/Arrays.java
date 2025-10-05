package language.basics;

public class Arrays {

	public static void main(String[] args) {
		
		//Array 1: Create 3D Array to Store Sem, Subject, SubjectName details
		String semSubjectDetails [][][] = new String [5][6][6];
		
		//Array 2:  Create 3D Array to Store Sem, Status(Marks), Status(Marks) value
		String semMarks [][][] = new String[5][6][6];
		
		//Query 1: Print Semester 2 Subject 4 and Subject 5 Names
		//[Sem 2][Subject 4][subject 4 name]
		//[sem 2][subject 5][subject 5 name]
		
		semSubjectDetails[1][3][3] = "Basic Electronics";
		semSubjectDetails[1][4][4] = "Engineering Physics";
		
		System.out.println("SUBJECT DETAILS");
		System.out.println("Sem 2 Subject 4: "+semSubjectDetails[1][3][3]);
		System.out.println("Sem 2 Subject 4: "+semSubjectDetails[1][4][4]);
		
		
		//Query 2: Print Status/Marks of Semester 4 Subject 3 and Subject 6		
		//[Sem 4][Subject 3][Status (Marks) of subject 3]
		//[sem 4][subject 6][Status (Marks) of subject 6]
		
		semMarks[3][2][2] = "Fail (19)";
		semMarks[3][5][5] = "Pass (87)";
		
		System.out.println("\nSTATUS(MARKS) DETAILS");
		System.out.println("Sem 4 Subject 3 Status(Marks): "+semMarks[3][2][2]);
		System.out.println("Sem 4 Subject 6 Status(Marks): "+semMarks[3][5][5]);
		
	}

}
