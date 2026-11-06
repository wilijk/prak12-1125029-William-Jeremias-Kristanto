import model.User;

public class app {
    public static void main(String[] args) {
        User user1 = new User("Budi");
        User user2 = new User("Andi");

        user1.sendMessage(user2, "Halo Andi!");

    }
}
