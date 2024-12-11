package EMS;

public class Nurse extends Employee {
	
	public Nurse( String name, int id, String job) {
		super(name,id,job);
	}

	@Override
    public void displayRole() {
        System.out.println(getName() + " is a nurse in the " + getjob() + " department.");
}
}