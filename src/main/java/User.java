import java.time.LocalDate;

public class User {
    private String title;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
    private String tel;

    private String username;
    private String password;

    public User (String title, String firstname, String lastname, LocalDate dateOfBrith, String email, String tel, String username, String password) {
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBrith;
        this.email = email;
        this.tel = tel;

        this.username = username;
        this.password = password;
    }

    ///  ----------------------------------------------------------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // ----------------------------------------------------------------------------------------------------------

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
