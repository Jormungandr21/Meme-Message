import java.util.*; 
public class meme{
	/**
	@Date 5/7/2022	
	literally to make text come out like spongebob bird meme "SlEeP iS fOr ThE wEaK"
	*/
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a words to meme: ");  
		System.out.println();  
		String word= "";
		String word2="";
		String meme = sc.nextLine(); 
		int z=0;
		for(int m=0;m<meme.length();m++){
			if(meme.charAt(m)==' '){
				word += meme.substring(m,m+1);
				continue;
			}
			else if(z%2==0){
				word+=meme.substring(m,m+1).toUpperCase();
				z++;
			}
			else{
				z++;
				word += meme.substring(m,m+1);
			}	
		}
		z=0;
		for(int m=0;m<meme.length();m++){
			if(meme.charAt(m)==' '){
				word2 += meme.substring(m,m+1);
				continue;
			}
			else if(z%2!=0){
				word2 += meme.substring(m,m+1).toUpperCase();
				z++;
			}
			else{
				word2 += meme.substring(m,m+1);
				z++;
			}	
		}
		System.out.println("OPTION 1: "+word);
		System.out.println("OPTION 2: "+word2);
	}
}
