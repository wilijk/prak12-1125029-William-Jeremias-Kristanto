package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<User> contacts;
    
    public User (String name){
        this.name = name;
        this.contacts = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public List<User> getContacts() {
        return contacts;
    }

    public void setContacts(List<User> contacts) {
        this.contacts = contacts;
    }

    public void sendMessage(User receiver, String message){
        System.out.println("[" + this.name + " -> " + receiver.getName() + "]: " + message);
        receiver.receiveMessage(receiver, message);
    }
    
    public void receiveMessage(User sender, String message){
        System.out.println("[" + this.name + "] Menerima pesan dari "+ sender.getName() + ": " + message);
    }

    public void addContact(User user){
        contacts.add(user);
    }
}
