package Main;

import Playgrounds.*;
import Users.*;
import java.util.Scanner;

/**
 * @author  20190329    Abdallah Mohmad Abdullatif
 * @author  20190462	Mohamed Essam Said Hanafi
 * @author  20190030	Ahmed Ragab Eissa Elsayed
 * the main method used to declare and initialize the list of users and playgrounds to be used in the system
 * 
 */

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int P_ID=1;
        userList _userList = new userList();
        PlaygroundList _playgroundList = new PlaygroundList();

        user currentUser = _userList.Logout();

        
        while(true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            int select = input.nextInt();
            switch (select){
                case 1 :{
                    System.out.print("Username: ");
                    String aName = input.next();
                    System.out.print("Password: ");
                    String aPassword = input.next();
                    currentUser = _userList.login(aName,aPassword);
                    if (currentUser == _userList.Logout()){
                        System.out.println("Error");
                        continue;
                    }

                    if (currentUser == _userList.Logout()){
                        System.out.println("Wrong in Username Or Password");
                        continue;
                    }
                    else if(currentUser.getAccountType()== account.Player)
                    {
                        boolean flag = true;
                        while (flag) {                            
                            System.out.println("1. Search about Playgrounds");
                            System.out.println("2. Set Money");
                            System.out.println("3. Check Balance");
                            System.out.println("4. Logout");

                            int select1 = input.nextInt();
                            switch (select1){
                                case 1:{
                            System.out.print("Set Playground's name: ");
                            String name = input.next();
                            System.out.print("Set Playground's location: ");
                            String location = input.next();

                            PlaygroundList playgrounds = _playgroundList.SearchPlaygrounds(name, location);
                            if(playgrounds.displayplaygrounds()){

                            System.out.print("Choose Playground by it's id: ");
                            int id = input.nextInt();

                            System.out.print("Set Month's Day : ");
                            int day = input.nextInt();

                            System.out.print("The available slots is : ");
                            _playgroundList.SearchPlaygrounds(name, location).getPlaygroundByID(id).getTimeSlots_(day);

                            System.out.print("Book from slot : ");
                            int slot1 = input.nextInt(); 
                            System.out.print("To slot : ");
                            int slot2 = input.nextInt(); 

                            Booking book = new Booking(day, slot1, slot2, _playgroundList.SearchPlaygrounds(name, location).getPlaygroundByID(id), _userList.login(aName,aPassword).getID());
                            
                            if(_userList.login(aName,aPassword).send_money(book, _playgroundList.SearchPlaygrounds(name, location).getPlaygroundByID(id))){
                                _playgroundList.SearchPlaygrounds(name, location).getPlaygroundByID(id).addBook(book);
                                _playgroundList.SearchPlaygrounds(name, location).getPlaygroundByID(id).changeTimeSlots_(book);
                                
                            }
                            else
                                System.out.println("No enough money");

                            }
                            else
                                    System.out.println("No Playground was Found");

                             break;
                            }

                            case 2:{
                                System.out.print("Set amount of money: ");
                                double money = input.nextInt(); 
                                _userList.login(aName,aPassword).addBalance(money);
                                break;
                            }
                            case 3:{
                                System.out.println("Your Balance: "+_userList.login(aName,aPassword).checkBalance());
                                break;
                            }
                            case 4:{flag=false;}
                            }
                        }
                    }
                   else{
                    boolean flag = true;
                     while (flag) {                            
                        System.out.println("1. Add a Playground");
                        System.out.println("2. Display Personal Playgrounds");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Logout");

                        int select1 = input.nextInt();
                        switch (select1){
                            case 1:{
                                System.out.print("Set Playground's name: ");
                                String playgroundName = input.next();
                                System.out.print("Set Playground's location: ");
                                String playgroundLocation = input.next();
                                System.out.print("Set Playground's price per hour: ");
                                double playgroundPrice = input.nextInt();
                                System.out.print("Playground Available From: ");
                                int playgroundFrom = input.nextInt();
                                System.out.print("Playground Available To: ");
                                int playgroundTo = input.nextInt();

                                _userList.login(aName,aPassword).addplayground(playgroundName, playgroundLocation, playgroundPrice, playgroundFrom, playgroundTo, P_ID);
                                _playgroundList.addPlayGround(new Playground(playgroundName, playgroundLocation, playgroundPrice, playgroundFrom, playgroundTo, _userList.login(aName,aPassword), P_ID++));
                                
                                break;
                            }
                            case 2:{
                                if(!_userList.login(aName,aPassword).displaypersonalplaygrounds()){
                                    System.out.println("No Playground was Found");
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("Your Balance: "+_userList.login(aName,aPassword).checkBalance());
                                break;
                            }
                            case 4:{flag=false;}
                        }
                     }
                    }
            break;
        }
                case 2:{
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
                                System.out.println("Username is already exist");
                                continue;
                            }
                            currentUser = _userList.login(aName, aPassword);
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 3: {return;}
                default : {
                    System.out.println("Error Try again");
                    continue;
                }
            }
            //currentUser.displayMenu();
            //currentUser.displayMenu();
            _userList.listAccounts();
                }
            }
        }
    

