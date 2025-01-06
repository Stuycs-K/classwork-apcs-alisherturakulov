public class MakeWords{
	public static void main(String[] args){
		makeWords(3, "", "abc");
	}

	public static void makeWords(int remainingLetters, String result, String alphabet){
		for(int i = 0; i < alphabet.length(); i++){
			if(remainingLetters > 0){
				makeWords(remainingLetters - 1, result+alphabet.charAt(i), alphabet);
			}else{
				System.out.println(result);
				//makeWords(1, result.substring(0,result.length()-1), alphabet.substring(1));
			}
		}
	}
}
 