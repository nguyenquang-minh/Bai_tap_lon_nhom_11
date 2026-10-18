import java.util.Locale;

abstract public class User {
    private String accountName;
    private String nickName;
    private String userId;
    private String passWord;
    private String email;
    private String phoneNumber;
    public User(String accountName, String passWord, String email, String phoneNumber){
        if(checkPassWord(passWord)) {
            this.accountName = accountName;
            this.nickName = nickName;
            this.passWord = passWord;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }
        else{
            System.out.println("Mat khau khong du manh");
        }
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
    //check mật khẩu xem đạt yêu cầu không
    public boolean checkPassWord(String newpassword){
        if(newpassword.length() > 8){
            String t = newpassword;
            t = t.toLowerCase();
            if(!newpassword.equals(t)){
                boolean hasDigit = false;
                boolean hasSpecial = false;
                for(int i=0; i<newpassword.length(); i++){
                    char a = newpassword.charAt(i);
                    if(Character.isDigit(a)){
                        hasDigit = true;
                    }
                    else if(!Character.isLetter(a) && !Character.isWhitespace(a)){
                        hasSpecial = true;
                    }
                }
                return hasDigit && hasSpecial;
            }
            else{
                return false;

            }
        }
        return false;
    }
    public boolean updateNickName(String oldNickName,String newNickName){
        if(!oldNickName.equals(newNickName)) {
            this.nickName = newNickName;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean updatePassWord(String oldePassWord,String newPassWord){
        if(!oldePassWord.equals(newPassWord)) {
            if(checkPassWord(newPassWord)) {
                this.passWord = newPassWord;
                return true;
            }
        }
        return false;
    }
}
