package org;

public class PostAnalyzer {

    public boolean validateName(String name) {
        String nameRegex = "[A-Z][a-z]{3,}";
        return name.matches(nameRegex);
    }

    public boolean validateEmail(String email) {
        String emailRegex = "[a-zA-Z]+\\.[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+";
        return email.matches(emailRegex);
    }

    public boolean validateUserId(String userId) {
        String userIdRegex = "[a-zA-Z0-9]*";
        return userId.matches(userIdRegex);
    }

    public boolean validatePostContent(String postContent) {
        String postContentRegex = "[a-zA-Z0-9\\W ]{5,}";
        return postContent.matches(postContentRegex);
    }

    public String categorize(String postContent) {
        String[] parts = postContent.split(" ");
        System.out.println(parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
            if (parts[i].equals("great"))
                return "positive";
            else if (parts[i].equals("sad"))
                return "negative";
        }

        return "neutral";
    }
}
