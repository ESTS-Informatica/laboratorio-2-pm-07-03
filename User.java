

/**
 * User can either be a client or a seller.
 *
 * @author POO
 * @version 03/2024
 */
public class User {

    private static int NUMBER_OF_USERS = 0;
    // The user id.
    private final String id;
    // The user name.
    private String name;
    // The user phone.
    private String phone;
    // The user email.
    private String email;

    /**
     * Constructor of class User.
     *
     * @param name The user name.
     * @param phone The user phone.
     * @param email The user email.
     */
    public User(String name, String phone, String email) {
        this.id = Integer.toString(++NUMBER_OF_USERS);
        this.name = (name != null) ? name : "";
        this.phone = (phone != null) ? phone : "";
        this.email = (email != null) ? email : "";
    }

    /**
     * Get the id.
     *
     * @return This user id.
     */
    public String getId() {
        return id;
    }

    /**
     * Get the name.
     *
     * @return This user name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name.
     *
     * @param name The new name. Must not be null.
     */
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    /**
     * Get the phone.
     *
     * @return This user phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the phone.
     *
     * @param phone The new phone. Must not be null.
     */
    public void setPhone(String phone) {
        if (phone != null) {
            this.phone = phone;
        }
    }

    /**
     * Get the E-mail.
     *
     * @return This user E-mail.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the E-mail.
     *
     * @param email The new E-mail. Must not be null.
     */
    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return this.name + "\t(" + this.phone + ")\t" + this.email;
    }

    /**
     * Display this user.
     */
    public void show() {
        System.out.println(this);
    }

}
