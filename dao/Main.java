import dao.UserDAO;
import model.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDAO userDAO = new UserDAO();
        System.out.println("Welcome to Online Learning Management System");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter user type (student/instructor): ");
        String userType = scanner.nextLine();
        User user = new User(0, name, email, password, userType);
        userDAO.addUser(user);
        System.out.println("User added successfully!");
        scanner.close();
    }
}
