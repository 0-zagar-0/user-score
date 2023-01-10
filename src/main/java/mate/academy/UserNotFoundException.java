package mate.academy;

public class UserNotFoundException extends RuntimeException {
  //create your exception
    public UserNotFoundException(String message) {
        super(message);
    }
}
