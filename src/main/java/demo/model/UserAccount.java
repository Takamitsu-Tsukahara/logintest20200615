package demo.model;

public class UserAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column useraccount.user_id
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column useraccount.user_name
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column useraccount.password
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column useraccount.user_id
     *
     * @return the value of useraccount.user_id
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column useraccount.user_id
     *
     * @param userId the value for useraccount.user_id
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column useraccount.user_name
     *
     * @return the value of useraccount.user_name
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column useraccount.user_name
     *
     * @param userName the value for useraccount.user_name
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column useraccount.password
     *
     * @return the value of useraccount.password
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column useraccount.password
     *
     * @param password the value for useraccount.password
     *
     * @mbg.generated Thu Jun 18 08:08:29 JST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}