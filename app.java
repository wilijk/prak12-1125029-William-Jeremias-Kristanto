import model.User;

public class app {
    public static void main(String[] args) {
        User user1 = new User("Budi");
        User user2 = new User("Andi");
        User user3 = new User("Tono");
        User user4 = new User("Manto");

        user1.sendMessage(user2, "Halo Andi!");
        user1.addContact(user2);
        user1.addContact(user3);
        user1.addContact(user4);
        
        int count = 1;
        for (User contact : user1.getContacts()) {
            System.out.println(count + ". " + contact.getName());
            count++;
        }

    }
}
