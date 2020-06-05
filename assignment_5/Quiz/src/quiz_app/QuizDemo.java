package quiz_app;

public class QuizDemo {

	public static void main(String[] args) {
		
		int returnCode;
		Quiz q[] = new questions[10];

		q[0] = new Quiz("Who is the president of India", "Ramnath kovind", "Narendra Modi", "Amit Shah", "Rahul Gandhi", 1);
		q[1] = new Quiz("Who is the president of USA", "George Bush", "Donald Trump", "Michelle Obama", "Biden", 2);
		q[2] = new Quiz("Where is headquarters of United Nation", "Mumbai", "Geneva", "New York", "London", 3);
		q[3] = new Quiz("Who is CEO of Niti Aayog", "Nirmala Sitharamn", "Rajnath Singh", "Raghuram Rajan", "Amitabh Kant", 4);
		q[4] = new Quiz("Which company bought a stake of 9.99% in Jio", "Google", "Armanco", "Soft bank", "Facebook", 4);

		for (int i = 0; i < q.length; i++) {
			returnCode = q[i].show();
			if (returnCode == 0) {
				System.out.println("Time up!!");
				break;
			}
		}
	}

}
