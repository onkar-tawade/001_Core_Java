
public class ExamQuestions {

	public static void main(String[] args) {

		char ch='A';
		if(ch>='A' && ch<='Z') {
			int asc=ch+32;
			char print=(char) asc;
			System.out.println(print);
		}
		else if(ch>='a' && ch<='z') {
			int asc=ch-32;
			char print=(char) asc;
			System.out.println(print);
		}
		else System.out.println("$");
	}

}
