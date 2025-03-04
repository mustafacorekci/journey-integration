package models;

import com.github.javafaker.Faker;
import models.User;

public class UserBuilder {
    private final Faker faker = new Faker();
    private String name;
    private String email;
    private String password;

    public UserBuilder() {
        this.name = faker.name().fullName();
        this.email = faker.internet().emailAddress();
        this.password = faker.internet().password();
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public User build() {
        return new User(name, email, password);
    }
}

