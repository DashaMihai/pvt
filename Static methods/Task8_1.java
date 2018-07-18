
public class Task8_1 {

	public static void main(String[] args) {
		
//		Word w=new Word();
//		System.out.println(w.a);	
//				
//		Word q=new Word();
//		System.out.println(q.a);
//		
//		w.a=7;
//		System.out.println(w.a);
//		System.out.println(q.a);
//		
		
		
		String text = Paragraph.Text();
		int n = Paragraph.scanNumber();
		String str;
		String[] words = text.split(" ");
		
		for (int i = 0; i < words.length; i++) {

			if (n <= words[i].length()) {
				str = "";
				str += words[i].substring(0, n - 1);
			str += '%';
				str += words[i].substring(n,words[i].length());

				words[i] = str;
			}
			System.out.print(words[i] + " ");

		}
	}
}
