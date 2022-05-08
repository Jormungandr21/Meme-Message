
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
		for(int m=0;m<meme.length();m++){
			if(m%2==0){
				word+=meme.substring(m,m+1).toUpperCase();

			}
			else{
				word += meme.substring(m,m+1);
			}	
		}
		for(int m=0;m<meme.length();m++){
			if(m%2!=0){
				word2 += meme.substring(m,m+1).toUpperCase();

			}
			else{
				word2 += meme.substring(m,m+1);
			}	
		}
		System.out.println("OPTION 1: "+word);
		System.out.println("OPTION 2: "+word2);
	}
}