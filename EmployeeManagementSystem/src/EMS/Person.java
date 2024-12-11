package EMS;

public abstract class Person {
	 private String name;
	    private int id;

	    public Person(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    protected String getName() {
	        return name;
	    }

	    protected int getId() {
	        return id;
	    }
	    public abstract void displayRole();
}
