package strongpasswordgenerator;

public class user {
    //attributes of a user such as username, email, phone number, favorite pet, favorite icescream flavor, favorite color.
    //add getters and setters for each attribute
    //add a constructor that takes in all the attributes
    //add a toString method that returns a string representation of the user object

    private String username;
    private String email;
    private String phoneNumber;
    private String favoritePet;
    private String favoriteIcecreamFlavor;
    private String favoriteColor;

    public user(String username, String password, String email, String phoneNumber, String favoritePet, String favoriteIcecreamFlavor, String favoriteColor) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.favoritePet = favoritePet;
        this.favoriteIcecreamFlavor = favoriteIcecreamFlavor;
        this.favoriteColor = favoriteColor;
    }

    public user() {
        this.username = "";
        this.email = "";
        this.phoneNumber = "";
        this.favoritePet = "";
        this.favoriteIcecreamFlavor = "";
        this.favoriteColor = "";
    }

    public String getUsername() {
        return username;
    }

    public String getFavoritePet() {
        return favoritePet;
    }

    public String getFavoriteIcecreamFlavor() {
        return favoriteIcecreamFlavor;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFavoritePet(String favoritePet) {
        this.favoritePet = favoritePet;
    }

    public void setFavoriteIcecreamFlavor(String favoriteIcecreamFlavor) {
        this.favoriteIcecreamFlavor = favoriteIcecreamFlavor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number");
        }
    }

    @Override

    public String toString() {
        return "Username: " + username + "\nEmail: " + email + "\nPhone Number: " + phoneNumber + "\nFavorite Pet: " + favoritePet + "\nFavorite Icecream Flavor: " + favoriteIcecreamFlavor + "\nFavorite Color: " + favoriteColor;
    }


}
