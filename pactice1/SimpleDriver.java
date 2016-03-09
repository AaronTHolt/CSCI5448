public class SimpleDriver implements Comparable
{
    //private int abc =5;
    public static void main(String args[])
    {
        //Problem 1
        UserUtility util = new UserUtility();
        System.out.println(util.abc);
        System.out.println(UserUtility.createUsername("Liz", "Boese"));
    }

    public int compareTo(Object other)
    {
        return 0;
    }
}