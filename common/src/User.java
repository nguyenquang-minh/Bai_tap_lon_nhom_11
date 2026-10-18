abstract public class User {
    private String accountName;
    private String nickName;
    private String userId;
    private String passWord;
    private String email;
    private String phoneNumber;
    public User(String accountName, String passWord, String email, String phoneNumber){
        this.accountName = accountName;
        this.nickName = nickName;
        this.passWord = passWord;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public String getNickName(){
        return this.nickName;
    }
    public String getUserId(){
        return this.userId;
    }
    public String getPassWord(){
        return this.passWord;
    }
    public String getEmail(){
        return  this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void updateNickName(String newNickName){
        this.nickName = newNickName;
    }
    public void updatePassword(String newpassWord){
        this.passWord = newpassWord;
    }
}
