import java.util.*;
public class StringCompression {
	
	public static void compress(String s){
		String[] str = s.split("");
		int count = 1;
		for (int i = 2;i<str.length;i++){
			if(str[i].equals(str[i-1]))
				count += 1;
			if(!str[i].equals(str[i-1])){
				System.out.print(str[i-1] + count);
				count = 1;
			}
			else if(i == str.length-1){
				System.out.println(str[i] + count);
				count = 1;
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string[a-z]:");
		String str = sc.nextLine();
		compress(str);
		
	}

}
