package Lists;

public class ListTester {

	public static void main(String[] args) {
		List<String> peopleList = new List<String>(10);
		peopleList.add("Mitch");
		peopleList.add("Gary");
		peopleList.add("Raymond");
		peopleList.add("Blake");
		peopleList.add("Jess");
		System.out.println("The people in the list are: " + peopleList.toString());
		
		
	}

}
