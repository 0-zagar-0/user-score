package mate.academy;

public class Main {
    public static void main(String[] args) {
        String[] records = new String[] {"testEmail@gmail.com:100", "user@yahoo.com:1", "second-user@gmail.com:20"};
        String email = "second-user@gmail.com:20";

       try {
           UserService service = new UserService();
           service.getUserScore(records, email);
       } catch (UserNotFoundException e) {
           throw new UserNotFoundException("UserNotFoundException123456");
       }
    }
}