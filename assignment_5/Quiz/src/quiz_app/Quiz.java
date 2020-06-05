package quiz_app;

import java.util.Scanner;

class Input implements Runnable {

	Quiz question;
	Scanner scanner;

	TakeInput(Quiz question, Scanner scanner) {
		this.question = question;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		System.out.println(this.question.ques);
		System.out.println("(a) " + this.question.option_a);
		System.out.println("(b) " + this.question.option_b);
		System.out.println("(c) " + this.question.option_c);
		System.out.println("(d) " + this.question.option_d);
		System.out.print("Enter 1, 2, 3 or 4 : ");
		scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input == this.question.correct_option) {
			System.out.println("Correct!!!");
		} else {
			System.out.println("Wrong!!!");
		}
	}

}

public class Quiz {

	String ques;
	String option_a, option_b, option_c, option_d;
	int correct_option;
	int input;

	public Quiz(String ques, String option_a, String option_b, String option_c, String option_d, int correct_option) {
		super();
		this.ques = ques;
		this.option_a = option_a;
		this.option_b = option_b;
		this.option_c = option_c;
		this.option_d = option_d;
		this.correct_option = correct_option;
	}

	@SuppressWarnings("unused")
	int show() {
		
		
		Scanner scanner = null;
		Thread takeInput = new Thread(new Input(this, scanner));
		takeInput.setDaemon(true);

		Input.start();
		int result = 1;
		try {
			takeInput.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (Input.isAlive()) {
			result = 0;
		}

		Input.interrupt();

		if (scanner != null) {
			scanner.close();
		}
		return result;
	}

}
