/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package act.quickchat;
import java.util.Scanner;
/**
 *
 * @author mnisi
 */
public class Quickchat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declarations
        String username;
        String password;
        String[] messages = new String[100];
        String[] storedMessages = new String[100];
        String cellnum;
        int i;
        String recipientNum;
        String x;
        
        // REGISTRATION: Using a while loop to prompt user for correct format of a Username else will repeat asking for the correct format
        while (true) {
            System.out.println("Enter your username: e.g Ka_li");
            username = sc.nextLine();
            if (login.checkUserName(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length");
            }}

        // CAPTURING PASSWORD
        while (true) {
            System.out.println("Set up a unique password: (e.g ZphisherPreInstalled101!)");
            password = sc.nextLine();
            if (login.checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special symbol");
            }}

        // CAPTURING CELLPHONE NUMBER
        while (true) {
            System.out.println("Enter your cellphone number (e.g +2761345600)");
            cellnum = sc.nextLine();
            if (login.checkCellPhoneNumber(cellnum)) {
                System.out.println("Cell phone number successfully added.");
                System.out.println(login.registerUser(username, password));
                break;
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }}
        
        // LOGIN LOOP: User needs to input correct creditionls to be granted access 
            System.out.println("Login with your username and password");
            String loginUsername = sc.nextLine();
            System.out.println("Password:");
            String loginPassword = sc.nextLine();
            //while(true){
            if (login.loginUser(loginUsername, loginPassword)) {
                System.out.println("Welcome " + username + ",to QuickChat");
                System.out.println(login.returnLoginStatus(loginUsername, loginPassword));
            }
            
             while (true) {
    int userOption;
    System.out.println("Welcome " + username + ",to QuickChat");
    System.out.println("Option 1) Send Message");
    System.out.println("Option 2) Show recently sent messages");
    System.out.println("Option 3) Quit");
    userOption = sc.nextInt();
    sc.nextLine(); //ensure no buffer and takes enter (key) as input

    if (userOption == 1) {
        System.out.println("Enter recipient number along with country code (e.g. +27831234567):");
        recipientNum = sc.nextLine();

        if (!message.checkRecipientCell(recipientNum).equals("+27")) {
            System.out.println("Invalid number. Must start with +27");
        }
        
        System.out.println("How many messages would you like to send?");
        int userMessageCounter = sc.nextInt();
        sc.nextLine();

        int totalSent = 0;
        int z;
        for (i = 0; i < userMessageCounter; i++) {

            System.out.println("Type message: ");
            messages[i] = sc.nextLine();
            String messageID = message.checkMessageID();//calling our method that generates digits

            System.out.println("Message ID: " + messageID);
            System.out.println("Do you want to Send, Store or Disregard?");
            x = sc.nextLine();
            
            System.out.println(message.sentMessage(x));
             System.out.println(message.printMessage(messages[i]));
            totalSent++;

            if (x.equals("Store")) {
                storedMessages[i] = messages[i];
                message.storeMessage(storedMessages);//calling our method that will store out messages in a Json file
                System.out.println("Stored");
            }
    
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total sent messages:" + totalSent);
        System.out.println(messages[i]);

    } else if (userOption == 2) {
        System.out.println("Coming soon");

        for (String stored : storedMessages) {
            if (stored != null) {
                //System.out.println(stored);
            }
        }

    } else if (userOption == 3) {
        break;
    }}}}
    

