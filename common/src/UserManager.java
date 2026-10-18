import java.util.ArrayList;
import java.util.List;

public class UserManager extends User{
    List<User> userList;
    public UserManager(){
        super("","","","");
        userList = new ArrayList<>();
        // viết code đọc file ở đây
    }

    public User login (String accountName, String passWord){
        for(User user : userList){
            if(user.getAccountName().equals(accountName) && user.getEmail().equals(passWord)){
                return user;
            }
        }
        return null;
    }
    public boolean register(String accountName, String passWord, String email, String phoneNumber,String roles){
        for(User user : userList){
            if (user.getAccountName().equals(accountName) || user.getEmail().equals(email)) {
                System.out.println("Ten tai khoan hoac email bi trung!");
                return false;
            }
        }
        if(roles.equals("Bidder")){
            User bidder = new Bidder(accountName, passWord, email, phoneNumber);
            userList.add(bidder);
        }
        return true;
    }
    public boolean removeAccount(User u){
        for(User user : userList){
            if(u.getAccountName().equals(user.getAccountName()) && u.getEmail().equals(user.getEmail())){
                userList.remove(u);
                return true;
            }
        }
        return false;
    }
}
