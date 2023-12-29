package org;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean userExists(ArrayList<UserDetails> arr, String userId) {
        for (UserDetails userDetails : arr) {
            if (userDetails.getUserId().equals(userId))
                return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        PostAnalyzer postAnalyzer = new PostAnalyzer();
        ArrayList<UserDetails> arr = new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 to register");
            System.out.println("Enter 2 to login");
            System.out.println("Enter 3 to exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter name : ");
                String name = scanner.next();

                System.out.println("Enter email : ");
                String email = scanner.next();

                System.out.println("Enter userId");
                String userId = scanner.next();

                if (postAnalyzer.validateName(name) && postAnalyzer.validateEmail(email)
                        && postAnalyzer.validateUserId(userId)) {
                    UserDetails userDetails = new UserDetails(name, email, userId);
                    arr.add(userDetails);
                    System.out.println("Registered Successfully");
                } else {
                    throw new InvalidCredentialsException("Invalid details!! Could not register");
                }

            } else if (choice == 2) {
                System.out.println("Enter userId : ");
                String userId = scanner.next();
                scanner.nextLine();

                if (userExists(arr, userId)) {
                    System.out.println("Welcome ");
                    System.out.println("Enter post content : ");
                    String postContent = scanner.nextLine();

                    if (postAnalyzer.validatePostContent(postContent)) {
                        System.out.println("Post created successfully");
                        String category = postAnalyzer.categorize(postContent);
                        System.out.println("Category : " + category);
                    } else {
                        throw new InvalidPostException("Invalid content type !!");
                    }
                } else {
                    throw new InvalidUserException("User does not exists!!");
                }
            } else if (choice == 3) {
                return;

            } else {
                System.out.println("Invalid choice");
            }
        }

    }
}