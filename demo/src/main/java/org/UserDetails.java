package org;

public class UserDetails {
    String name;
    String email;
    String userId;
    String postContent;

    UserDetails(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    UserDetails(String name, String email, String userId, String postContent) {
        this.name = name;
        this.email = email;
        this.userId = userId;
        this.postContent = postContent;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

}
