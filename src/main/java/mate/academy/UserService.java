package mate.academy;

public class UserService {
  public int getUserScore(String[] records, String email) {
    //write your code here
    String[] emailExists;
    int numberUser = 0;
    String numberString;
    for (int i = 0; i < records.length; i++) {
      emailExists = records[i].split(":");

      if (emailExists[0].equals(email)) {
        numberString = emailExists[1];
        numberUser = Integer.parseInt(numberString);

        return numberUser;
      }
    }
    throw new UserNotFoundException("User with given email doesn't exist");
  }
}
