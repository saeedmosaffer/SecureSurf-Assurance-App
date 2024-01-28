package edu.birzeit.saeedmosaffer.securesurfassuranceapp;

public class Account {
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private String favoriteCountry;
    private String bestFriend;

    public Account(){}

    public Account(String userName, String email, String password, String phoneNumber, String favoriteSport, String bestFriend){
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.favoriteCountry = favoriteSport;
        this.bestFriend = bestFriend;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getFavoriteSport(){
        return favoriteCountry;
    }

    public void setFavoriteSport(String favoriteSport){
        this.favoriteCountry = favoriteSport;
    }

    public String getBestFriend(){
        return bestFriend;
    }

    public void setBestFriend(String bestFriend){
        this.bestFriend = bestFriend;
    }

    public String toString(){
        return userName + " " + email + " " + password + " " + phoneNumber + " " + favoriteCountry + " " + bestFriend;
    }

}
