package utility;

public class StringMethod {
//	Enter the code here....
   String input;
public String getInput() {
    return input;
}

public void setInput(String input) {
    this.input = input;
}
public String lower(String s)
{
    if(s == null) {
        return null;
    } else {
        return s.toLowerCase();
    }
}
public String upper(String s)
{
    if(s == null) {
        return null;
    } else {
        return s.toUpperCase();
    }
}
public String firstCharacter(String str1) {
		
    String g=""+str1.charAt(0);
    return g;
}
public String length(String str1) {
		
    int r= str1.length();
    return ""+r;
}
 
public String trim(String s)
{
    return s.trim();
}



}
