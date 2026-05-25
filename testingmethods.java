/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import act.quickchat.message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author mnisi
 */

public class testingmethods {
   
 @Test
    public void sentMessage_Send() {
        assertEquals("Sent", message.sentMessage("Send"));
    }
    
 @Test
    public void sentMessage_Store() {
        assertEquals("Stored", message.sentMessage("Store"));
    }
    
 @Test
    public void sentMessage_Disregard() {
        assertEquals("Deleted", message.sentMessage("Disregard"));
    }
   
 @Test
    public void checkRecipientCell_True(Object result){
          String recipientNum = "+27838968976";
       boolean isValid  = recipientNum.startsWith("+27") && recipientNum.substring(3).length() == 9;
       boolean actual = recipientNum.substring(3).length() == 9 && recipientNum.startsWith("+27");
       assertEquals("Message successfully sent.", result);
    }
    
 @Test
    public void checkCellPhoneNumber_False(){
        String recipientNum = "08966663";
       boolean actual = recipientNum.substring(3).length() == 9 && recipientNum.startsWith("+27");
        assertEquals(false, actual);
    }
    
 @Test
    public void checkMessageID() {
        String messageID = "2783896897"; // Example 10-digit ID
        boolean actual = messageID.length() == 10;
        assertTrue(actual);
    }
    
 @Test
    public void returnTotalMessages() {
        message obj = new message();
        assertEquals(5, obj.returnTotalMessages(5));
    }}

    
