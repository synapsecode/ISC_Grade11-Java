//Program23
package OtherPrograms;

import java.util.Scanner;

public class QuizGame {
	static Scanner sc = new Scanner(System.in);
	static char[] answerKey = {'A', 'A', 'D', 'B', 'C'};

	public static int play(){
		int score = 0;
		char[] answers = new char[5];
		for(int i=1; i<=5; i++){
			System.out.print("Q" + i + " Answer: ");
			answers[i-1] = Character.toUpperCase(sc.next().charAt(0));
		}
		//Scoring
		for (int i = 0; i < answers.length; i++) {
			if(answers[i] == answerKey[i]) score += 1;
		}
		return score;
	}
	public static void main(String[] args) {
		
		
		System.out.println("Enter Number of Participants: ");
		int p = sc.nextInt();
		if(p > 3 && p < 11){
			int[] participant_scores = new int[p];
			for(int i=0; i<p; i++){
				System.out.println("Participant  " + (i+1) + "'s Turn:");
				participant_scores[i] = play();
			}
			System.out.println("GAME OVER");
			//Display Each Participant Marks
			int winner_pid = -1;
			System.out.println("\nSCOREBOARD");
			for(int i=0; i<p; i++){
				if(participant_scores[i] > winner_pid) winner_pid = i;
				System.out.println("Participant(" + (i+1) + ") -> " + participant_scores[i] + "pts");
			}
			System.out.println();
			System.out.println("Winner: Participant(" + winner_pid + ")");

 		}else{
			System.out.println("Invalid Particicant Criteria (>3, <11)");
		}

	}
}
