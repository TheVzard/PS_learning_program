import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Synonym {
	Map<String, Set<String>> newMap = new HashMap<> ();
	public void addMap() {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		set1.add("Good Morning");
		set1.add("Shubhodaya");
		set1.add("Bonjour");
		set2.add("Good Evening");
		set2.add("Shubha sange");
		set2.add("Bonsoir");

		this.newMap.put("GoodMorning",set1);
		this.newMap.put("GoodEvening",set2);
	}
	

	public static void main(String[] args) {
		newMap.addMap()
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Set<String> findInMap= example.newMap.get(input);
		Set<String> inputSet = new HashSet<>();
		String line;
		if(look == null) {
			System.out.println("Key not preseny");
			System.out.println("Do you want to add this key?");
			System.out.println("Y/N");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("Y")) {

			    while (sc.hasNextLine()){  
			       line=sc.nextLine(); 
			       if(line.isEmpty()){
			           break;
			       }           
			       inputSet.add(line);
			    }
				example.newMap.put(input, inputSet);
			} else if(choice.equalsIgnoreCase("Y")) {
				System.out.println("End");
			} else {
				System.out.println("Please enter a valid input");
			}
			if(choice.equalsIgnoreCase("Y")) {
				System.out.println("\nUpdated map is \n");
				for(String i : example.mp.keySet()) {
					System.out.println("key: " + i + " ,value: "+ example.newMap.get(i));
				}
			}
		} else {
			System.out.println(look);
		}
		sc.close();
	}

}
