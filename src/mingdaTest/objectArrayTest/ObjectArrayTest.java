package mingdaTest.objectArrayTest;

public class ObjectArrayTest {

	public static void main( String[] args ) {
		
		Person[] person = null;
		
		try {
			
			person = new Employee[3];
			person[2] = new Students();
			/*
			 * Exception in thread "main" java.lang.ArrayStoreException: mingdaTest.objectArrayTest.Students
			 *         at mingdaTest.objectArrayTest.ObjectArrayTest.main(ObjectArrayTest.java:8)
			 * */
			
			for( int i = 0; i < person.length; i++ ) {
				System.out.println( "No. " + i + " Name: " + person[i].getName() + " Job: " + person[i].getJob() );
			}
			
		} catch(ArrayStoreException e) {
			System.out.println(e);
		}
		
	}
	
}

class Person {
	private String name;
	private String job;
	
	public String getName() {
		return name;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public void setJob( String job ) {
		this.job = job;
	}

}

class Employee extends Person {
	
	public Employee() {
		setName( "A employee's name" );
		setJob( "Employee" );
	}
	
}

class Students extends Person {
	
	public Students() {
		setName( " A student's name" );
		setJob( "Student" );
	}
	
}