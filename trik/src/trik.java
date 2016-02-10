import java.io.*;
public class trik {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String num;
		 int l=1,c=0,r=0,tmp=0; 
		 
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 
		do{
        System.out.print("Enter Value 50 character (A or B or C) :");
        num = in.readLine();
		 }while
			 ((num.length() > 50 || num.length() < 1 || num.length() == 0) || (num.charAt(0)!='A'
				 && num.charAt(0)!='B' && num.charAt(0)!='C'
				 && num.charAt(0)!='a' && num.charAt(0)!='b' && num.charAt(0)!='c'));
		
		for(int i=0;i<num.length();i++){
			if(num.charAt(i)=='A' || num.charAt(i)=='a'){ 
				tmp=l;
				l=c;
				c=tmp;
			}
			if(num.charAt(i)=='B' || num.charAt(i)=='b'){
				tmp=c;
				c=r;
				r=tmp;
			}
			if(num.charAt(i)=='C' || num.charAt(i)=='c'){
				tmp=r;
				r=l;
				l=tmp;
			}
		}
		
		if(l==1) System.out.print("Glass 1 Left\n");
		else if(c==1) System.out.print("Glass 2 Center\n");
		else if(r==1) System.out.print("Glass 3 Right\n");
	}
}
