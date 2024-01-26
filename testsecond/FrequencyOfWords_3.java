package testsecond;



public class FrequencyOfWords_3 {
	public static void main(String[] args) {
		//tring text="Write a Java program that read a text from the user and count frequency of each word in the text";
		String text="kalpana hai hello welcom kalpana hai";
		
		System.out.println(text);
		
		text=text.replaceAll("a-zA-Z","");
		
		String[] word=text.split(" ");
		
		int[] frequency=new int[word.length];
		
		for(int i=0;i<word.length;i++) {
			frequency[i]=1;
			
		
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equalsIgnoreCase(word[j])){
					frequency[i]++;
					word[j]="";
				}
			}
		}
		
		for(int i=0;i<word.length;i++) {
			if(!word[i].equals("")) {
				System.out.println(word[i]+ "-"+frequency[i]);
			}
		}
	}

}
