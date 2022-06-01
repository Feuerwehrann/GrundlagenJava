package b01_Verzweigungen;

import java.util.Scanner;



public class zeugnisnote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Note: ");
		double kommaNote = sc.nextDouble();
		if (kommaNote<1) {
			System.out.println("Bitte gültigen Wert eingeben!");
		}
		else {
			if(kommaNote>6) {
				System.out.println("Bitte gültigen Wert eingeben!");
			}
			else {
		kommaNote = kommaNote + 0.5;
		int note = (int) kommaNote;
		System.out.println("Gerundete Note: "+ note);
			
		


		switch (note) {
		case 1:
			System.out.println("Zeugnisnote: Sehr gut");
			break;
		case 2:
			System.out.println("Zeugnisnote: Gut");
			break;
		case 3:
			System.out.println("Zeugnisnote: Befriedigend");
			break;
		case 4:
			System.out.println("Zeugnisnote: Ausreichend");
			break;
		case 5:
			System.out.println("Zeugnisnote: Mangelhaft");
			break;
		case 6:
			System.out.println("Zeugnisnote: Ungenügend");
			break;

		default:
			System.out.println("Bite gültige Note eingeben!");
			break;
		}

	}
	}
	}
}



