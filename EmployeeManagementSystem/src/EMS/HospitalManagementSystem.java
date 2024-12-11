package EMS;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HospitalManagementSystem {

	public static void main(String[] args) throws FileNotFoundException  {
		 Doctor doctor = new Doctor("Alice", 101, "Surgery", "Cardiology");
	        Nurse nurse = new Nurse("Bob", 102, "Emergency");
	        
	        	
	        List<Person>employees = new ArrayList<>();
	        employees.add(doctor);
	        employees.add(nurse);
	        
	        
	        for (Person employee : employees) {
	            employee.displayRole();
	        }
	        filehandler.saveToFile("employees.txt", employees);
	        
	       Doctor doctor11 = Doctor.theMakeOfDoctors();

	        	        doctor11.writeToFile("myfile.txt");
	        	        
	        	        
	        	        List<Person>ListOfEmployees = Doctor.getListOfEmployees();
	        	        
	        	        
	        	        for ( Person employees1:ListOfEmployees ) {
	        	        	
	        	        	System.out.println(employees1);
	        	        	 
	        	        }
	        	        filehandler.saveToFile("Doctors.txt", ListOfEmployees);
	        	        
	        	        
	        	        JFrame frame = new JFrame("My First GUI");
	        	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	        frame.setSize(300,300);
	        	        JButton button = new JButton("Press");
	        	        frame.getContentPane().add(button); // Adds Button to content pane of frame
	        	        frame.setVisible(true);
	        	        frame.action(null, button);
	        	        
	        	        
	        	
	}
	}

