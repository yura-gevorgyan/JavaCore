package homeworks.onlinemarket.storage;

import homeworks.onlinemarket.model.User;

public class UserStorage {

    private User[] users = new User[10];
    private int size = 0;

    public void add(User user) {
        if (size == users.length - 1) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }


    public User searchUser(String userEmail, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(userEmail)
                    && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }
}
