

public class Parmutation {

	
	
	public static void main(String[] args) {
		String str="123";
		int n=str.length();
		Parmutation obj = new Parmutation();
		
	     obj.permut(str,0,n-1);
		
		
	}

	public void permut(String str, int sin, int lin) {
		
		
		if(lin==sin){
			
			
			int p=Integer.parseInt(str);
			if(p%8==0){
				System.out.println("print divisible by 8 element");
				System.out.println(p);
			}
		}
		else
		{
			for(int j=sin;j<=lin;j++){
				str=swap(str,sin,j);
				
				
				permut(str, sin+1, lin);
			}
		}
		
	}

	public String swap(String str, int a, int b) {
		
		char  temp;
		char[] charArray = str.toCharArray();
		
		temp= charArray[a];
		charArray[a] = charArray[b];
		charArray[b] = temp;
		return String.valueOf(charArray);
	}

	

}
