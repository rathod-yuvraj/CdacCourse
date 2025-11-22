
public class LuckyNumberCalculator {
	public static int luckNo(String w) {
		int add=0;
		for(int i=0; i<w.length(); i++) {
			int ind=i+1;
			int ascii=(int) w.charAt(i);
//			boolean asciiOdd=(ascii%2!=0);
//			boolean indexOdd=(ind%2!=0);
			
				add+=ascii*ind;
			
		}
		
		return add;
	}
	
	public static int luckNumber(String word) {
		int sum=0;
		for(int i=0; i<word.length(); i++) {
			int index =i+1;
			int ascii =(int) word.charAt(i);
		
			boolean asciiOdd=(ascii%2 !=0);
			boolean indexOdd=(index%2!=0);
			
			if(asciiOdd || indexOdd) {
				sum+=ascii*index;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		String word="YUVRAJ";
		
		System.out.println(luckNumber(word));
		
		System.out.println(luckNo(word));
		

	}

}
