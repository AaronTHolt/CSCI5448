public class UserUtility
{
    public static String createUsername(String fName, String lName)
    {
        String userName;
        userName = fName.substring(0, 3) + lName.substring(0, 3);
        return userName;
    }
}