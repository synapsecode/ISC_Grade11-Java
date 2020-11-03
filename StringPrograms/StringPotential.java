package StringPrograms;

import java.util.Scanner;

public class StringPotential
{
    static int getPotential(String word){
        int potential = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLetter(ch)){
                potential+=((int)ch - 64);
            }
        }
        return potential;
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int[] potentials = new int[25];
		String[] words = new String[25];
		int c = 0;
        System.out.print("\nEnter the Sentence: ");
		String[] sx = sc.nextLine().trim().toUpperCase().split(" ");
		for(int i=0; i<sx.length; i++){
			words[i] = sx[i];
			potentials[i] = getPotential(sx[i]);
			c+=1;
		}
		sc.close();
        int temp;
        //Sort potentials
        for (int i = 0; i < c; i++) 
        {
            for (int j = i + 1; j < c; j++) {
                if(potentials[i] > potentials[j])
                {
                    temp = potentials[i];
                    potentials[i] = potentials[j];
                    potentials[j] = temp;
                }
            }
        }
        System.out.println("Increasing Potentials");
        for(int i=0; i<c; i++){
            int p = potentials[i];
            String s = "";
            for(int j=0; j<c; j++){
                if(getPotential(words[j]) == p) s = words[j];
            }
            System.out.println(s + " = " + p);
        }
    }
}