package EMS;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor extends Employee {
	 private String specialization;
     /**
	 * @return the listOfEmployees
	 */
	public static List<Person> getListOfEmployees() {
		return ListOfEmployees;
	}

	/**
	 * @param listOfEmployees the listOfEmployees to set
	 */
	public static void setListOfEmployees(List<Person> listOfEmployees) {
		ListOfEmployees = listOfEmployees;
	}
	private static List<Person>ListOfEmployees = new ArrayList<>();

	    public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

		public Doctor(String name, int id, String job, String specialization) {
	        super(name,id,job);
	        this.specialization = specialization;
	        ListOfEmployees.add(this);
	    }

	    public void diagnose() {
	        System.out.println(getName() + " is diagnosing as a " + specialization + ".");
	    }
	    @Override
	    public void displayRole() {
	        System.out.println(getName() + " is a doctor specializing in " + specialization + ".");
	    }
	    @Override
	    public String toString() {
	    	return "Doctor: "+
	    			 "Name: " + getName() +"\n"
	    			 + "ID: " + getId() + "\n"
	    			 + "Job: " + getjob() + "\n"
	    			 + "Specialization: " +  specialization + "\n";
	    }
	    
	    public static Doctor theMakeOfDoctors() throws FileNotFoundException {
			System.out.println("Opening Hospital Management System");
			 
			 Scanner ScCs = new Scanner(System.in);
		
			System.out.print("Enter Doc name:");
			String name = ScCs.nextLine();
			
			System.out.print("I need the Doc Id number:");
			int id = ScCs.nextInt();
			 ScCs.nextLine();
			
		    System.out.println("yoo what is Doc job:");
			String job = ScCs.nextLine();
			
			System.out.print("I need Doc specialization: ");
			String specialization = ScCs.nextLine();
			
			return new Doctor( name, id, specialization, job );
	
	    }
	    public void writeToFile(String filename) {
	    	try(FileWriter writer = new FileWriter(filename, true)){
	    		 writer.write("--YOUR DOC DETAILS :}-- \n"); 
	    		writer.write("__Doctor__ " + "\n");
	    		writer.write("Name: " + getName() + "\n");
	    		writer.write("Id: " + getId() + "\n");
	            writer.write("Job: " + getjob() + "\n");
	            writer.write("specialization: "+ specialization + "\n");
	            writer.write("--------------------\n"); 
	            System.out.println("Doctor details written to file: " + filename);
	    	} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		

}
