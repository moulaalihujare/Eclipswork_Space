package education.main;

//import education.college.Attendance;
//*** this the way of importing packages...//

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Attendance at1= new Attendance();
		
		//*** So avoiding the conflict u can import by following // 
		
		education.college.Attendance att1= new education.college.Attendance();
		att1.dis();
		education.school.Attendance att2= new education.school.Attendance();
	    att2.dis();
	
	}

}
