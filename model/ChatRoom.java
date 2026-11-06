package model;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    String roomName;
    List<User> members;

    public ChatRoom(String roomName) {
        this.roomName = roomName;
        this.members = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public void registerUser(User user) {
        members.add(user);
        user.setChatRoom(this);
    }

    public void sendBroatcast(User sender, String message) {
        System.out.println("[" + sender.getName() + " di grup " + this.roomName + "]: " + message);

        for (User user : members) {
            if (user != sender) {
                user.receiveMessage(sender, message);
            }
        }
    }

}
