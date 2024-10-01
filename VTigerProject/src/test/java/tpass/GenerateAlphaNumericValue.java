package tpass;

public class GenerateAlphaNumericValue {
	public static void main(String[] args) {
		int size=20;
		String alphanum="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz!@#$%";
		
		//System.out.println("Alphanum length:"+alphanum.length());
		
		StringBuilder sb=new StringBuilder(size);
		for(int i=0;i<size;i++) {
			int index=(int)(alphanum.length()*Math.random());
			//System.out.println(index);
			
			sb.append(alphanum.charAt(index));
		}
		System.out.println(sb);
	}
}
