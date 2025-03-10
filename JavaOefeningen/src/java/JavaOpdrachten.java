package java;

public class Java
{

    public static void main(String[] args)
    {
	String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo??";
        char[] ch = s.toCharArray();
	
	int Letter = 0;
	int nummer= 0;
	int space = 0;
	
	for(int i =0; i<s.length();i++) {
	    if(Character.isLetter(i)) {
		Letter++;
	    }
	    else if(Character.isDigit(i)) {
		nummer++;
	    }
	    else if(Character.isSpaceChar(i)) {
		space++;
	    }
	}
	System.out.println("letters: "+Letter +"nummer: "+nummer + "space: "+ space);
    }

}
