package utility;

public class StringAdvanceMethod {
	
	 String input1,input2;

/*	public StringAdvanceMethod(String input1, String input2) {
        this.input1 = input1;
        this.input2 = input2;
    } */
	public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }
	public String concat(String str1, String str2) {
		return str1 + str2;
	}

	public String split(String str1, String str2) {
		return str1;
	}
	public String firstCharacter(String str1) {
		
		String g=""+str1.charAt(0);
		return g;
	}
	public String indexof(String s1,String s2)
	{
		int r=s1.indexOf(s2);
		return " ";
	}
	public String trim(String s1,String s2)
	{
		return s1.trim();
	}


}
