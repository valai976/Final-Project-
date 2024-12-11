package EMS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class filehandler {
	 public static void saveToFile(String filename, List<Person> people) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
	              	writer.write("----Hospital Management System----" + "\n");
	        	for (Person person : people) {
	        		
	        		if(person instanceof Doctor) {
	        			Doctor doctor = (Doctor) person;
	        			writer.write("Doctor: " + doctor.getName() + "," + doctor.getId() + "," +  doctor.getjob() + "," + doctor.getSpecialization() + "\n");
	        		} else if(person instanceof Nurse) {
	        			Nurse nurse = (Nurse) person;
	        			writer.write("Nurse: " + nurse.getName() + "," + nurse.getId() + "," + nurse.getjob() +"\n");
	        		} else {
	        			writer.write(person.getName() + "," + person.getId() + "\n");
	        		}
	                
	            }
	            System.out.println("Data saved to file.");
	        } catch (IOException e) {
	            System.out.println("Error saving to file: " + e.getMessage());
	        }
	
	 }
	 
}
