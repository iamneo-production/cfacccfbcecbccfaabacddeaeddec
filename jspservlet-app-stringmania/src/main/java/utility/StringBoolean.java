package utility;

public class StringBoolean {

     String input1,input2;

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
public Boolean contains(String s1,String s2)
{
    return s1.contains(s2);
}
public Boolean startsWith(String s1,String s2)
{
    return s1.startsWith(s2);

}
public Boolean endsWith(String s1,String s2)
{
    return s1.endsWith(s2);
}

  public   Boolean equals(String s1,String s2)
    {
        return s1.equals(s2);
    }
  public  Boolean equalsIgnoreCase(String s1,String s2)
    {
        return s1.equalsIgnoreCase(s2);

    }


}
