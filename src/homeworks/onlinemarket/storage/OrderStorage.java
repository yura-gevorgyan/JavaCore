package homeworks.onlinemarket.storage;

import homeworks.onlinemarket.model.Order;
import homeworks.onlinemarket.model.User;
import homeworks.onlinemarket.util.StorageSerializeUtil;

import java.io.Serializable;

public class OrderStorage implements Serializable {
    private Order[] orders = new Order[10];
    private int size = 0;

    public void add(Order order) {
        if (size == orders.length - 1) {
            extend();
        }
        orders[size++] = order;
        StorageSerializeUtil.serializeOrderStorage(this);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, orders.length);
        orders = tmp;
    }

    public Order getById(String orderId) {

        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(orderId)) {
                return orders[i];
            }
        }
        return null;
    }

    public void getOrderByUser(User user) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getUser().equals(user)) {
                System.out.println(orders[i]);
            }
        }
    }
}
