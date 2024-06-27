package JavaQuestionBank.Melik;

public class User {

    private String userId;
    private String userName;
    private String userSurname;
    private String userTel;
    private boolean userValidCard;
    private Object rentedBook;

    public User(String userId, String userName, String userSurname, String userTel, boolean userValidCard,Object rentedBook){

        this.userId=userId;
        this.userName=userName;
        this.userSurname=userSurname;
        this.userTel=userTel;
        this.userValidCard=userValidCard;
        this.rentedBook=rentedBook;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public boolean isUserValidCard() {
        return userValidCard;
    }

    public void setUserValidCard(boolean userValidCard) {
        this.userValidCard = userValidCard;
    }

    public Object getRentedBook() {
        return rentedBook;
    }

    public void setRentedBook(Object rentedBook) {
        this.rentedBook = rentedBook;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userValidCard=" + userValidCard +
                ", rentedBook=" + rentedBook +
                '}';
    }
}
