import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SampleMap {
	public static HashMap<Character, Integer> getPrimes(int count){	
	ArrayList<Integer> primes = new ArrayList<>();
	Boolean[] Bool = new Boolean[1000];
	Map<Character,Integer> alphabet_to_prime = new HashMap<Character,Integer>();
	public void generatePrimeNumbers() {
		Arrays.fill(Bool, Boolean.TRUE);
		for(int i=2;i<1000;i++) {
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					this.Bool[i] = false;
					break;
				}
			}
		}
		for(int i=2;i<1000;i++) {
			if(this.Bool[i] == true) {
				this.primes.add(i);

			}
		}
	}
	
	public void map_prime_and_alphabets() {
		for(int i=0;i<26;i++) {
			this.alphabet_to_prime.put((char) ('a'+i), Integer.valueOf(this.primes.get(i)));
		}
	}
	return alphabet_to_prime;
}

    public static void displayCode(String input){
       
            HashMap<Character, Integer> alphabet_to_prime = getPrimes(26);
            StringBuilder output = new StringBuilder();
            input = input.toLowerCase();
            for(int i =0;i<input.length();i++){
                char c = input.charAt(i);
                output.append(Integer.toHexString(alphabet_to_prime.get(c)));
            }
            System.out.println(output.toString().toUpperCase());
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        displayCode(input);
        sc.close();
      }
}
