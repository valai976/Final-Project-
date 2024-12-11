package EMS;

public class Employee extends Person  {
	 protected  String job;

	    public Employee(String name, int id, String job) {
	        super(name,id);
	        this.job = job;
	    }


		public String getjob() {
	        return job;
	    }

	    @Override
	    public void displayRole() {
	        System.out.println(getName() + " is an employee in the " + job + " department.");

}
}
