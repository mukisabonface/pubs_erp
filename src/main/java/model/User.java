package model;

import java.util.Objects;

public class User {
    private int user_id; // INTEGER PRIMARY KEY ON CONFLICT ROLLBACK AUTOINCREMENT NOT NULL UNIQUE,
    private String fname; // VARCHAR (25) NOT NULL,
    private String lname; // VARCHAR (25) NOT NULL,
    private String username; // VARCHAR (50) NOT NULL ON CONFLICT ROLLBACK UNIQUE ON CONFLICT ROLLBACK,
    private String password; // VARCHAR (25) NOT NULL DEFAULT (1234),
    private String role; // VARCHAR (25) NOT NULL,
    private String doe; // DATE NOT NULL,
    private String email; // VARCHAR (25) UNIQUE,
    private String phone; // VARCHAR (15) UNIQUE NOT NULL

    public User(
            int user_id, String fname, String lname, String username, String password,
            String role, String doe, String email, String phone
    ) {
        this.user_id = user_id;
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
        this.role = role;
        this.doe = doe;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password.hashCode() + '\'' +
                ", role='" + role + '\'' +
                ", doe='" + doe + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' + '}';
    }
}
