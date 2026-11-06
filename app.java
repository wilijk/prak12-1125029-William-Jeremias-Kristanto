import model.ChatRoom;
import model.User;

public class app {
    public static void main(String[] args) {
        ChatRoom gchat = new ChatRoom("Keluarga Tercemar");

        User user1 = new User("Budi");
        User user2 = new User("Andi");
        User user3 = new User("Tono");
        User user4 = new User("Manto");

        gchat.registerUser(user1);
        gchat.registerUser(user2);
        gchat.registerUser(user3);

        user1.send("test1");
        user4.send("test2");
    }
}
