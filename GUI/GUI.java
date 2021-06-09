import Playgrounds.*;
import Users.*;
import java.util.Scanner;
public class GUI {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        userList _userList = new userList();
        playgroundList _playgroundList = new playgroundList();

        user currentUser = _userList.Logout();
        while(true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            int val = input.nextInt();
            switch (val){
                case 1 ->{
                    System.out.print("Username: ");
                    String aName = input.next();
                    System.out.print("Password: ");
                    String aPassword = input.next();
                    currentUser = _userList.login(aName,aPassword);
                    if (currentUser == _userList.Logout()){
                        System.out.println("Error");
                        continue;
                    }
                }
                case 2->{
                    while(true){
                        System.out.println("1. Player");
                        System.out.println("2. PlaygroundOwner");
                        System.out.print("Type: ");
                        int type = input.nextInt();
                        if (type != 1 && type != 2) {
                            System.out.println("Error try again");
                            continue;
                        }
                        while(true) {
                            System.out.print("Username: ");
                            String aName = input.next();
                            System.out.print("Password: ");
                            String aPassword = input.next();
                            if (!_userList.addUser(aName, aPassword, type == 1 ? account.Player : account.playgroundOwner)) {
                                System.out.println("Username is not available");
                                continue;
                            }
                            currentUser = _userList.login(aName, aPassword);
                            break;
                        }
                        break;
                    }
                }
                case 3-> {return;}
                default -> {
                    System.out.println("Error Try again");
                    continue;
                }
            }
            currentUser.displayMenu();
            _userList.listAccounts();
        }
    }
}
