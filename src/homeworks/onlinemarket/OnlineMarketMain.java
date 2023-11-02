package homeworks.onlinemarket;

import homeworks.onlinemarket.model.*;
import homeworks.onlinemarket.storage.OrderStorage;
import homeworks.onlinemarket.storage.ProductStorage;
import homeworks.onlinemarket.storage.UserStorage;
import homeworks.onlinemarket.util.UUIDUtil;

import java.util.Date;
import java.util.Scanner;

public class OnlineMarketMain implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static UserStorage userStorage = new UserStorage();
    private static ProductStorage productStorage = new ProductStorage();
    private static OrderStorage orderStorage = new OrderStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Command.printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
            }
        }
    }

    private static void register() {

        String userId = UUIDUtil.randomId();

        System.out.println("Please input NAME");
        String userName = scanner.nextLine();

        System.out.println("Please input E MAIL");
        String userEmail = scanner.nextLine();
        User userFromStorage = userStorage.getByEmail(userEmail);

        if (userFromStorage != null) {
            System.out.println("User with this EMAIL have already added");
            return;
        }

        System.out.println("Please input password");
        String userPassword = scanner.nextLine();

        for (UserType value : UserType.values()) {
            System.out.print(value + " ");
        }

        System.out.println("Please choose USER TYPE");
        String userTypeStr = scanner.nextLine();
        try {

            UserType userType = UserType.valueOf(userTypeStr.toUpperCase());
            User user = new User(userId, userName, userEmail, userPassword, userType);
            userStorage.add(user);

        } catch (IllegalArgumentException e) {
            System.out.println("Please write right USER TYPE !!!");
        }
    }

    private static void login() {

        System.out.println("Please input E MAIL");
        String userEmail = scanner.nextLine();
        System.out.println("Please input PASSWORD");
        String password = scanner.nextLine();

        User user = userStorage.searchUser(userEmail, password);

        if (user == null) {
            System.out.println("Invalid E-mail or Password !!!");
            return;
        }

        if (user.getUserType().equals(UserType.USER)) {
            userCommand(user);
        }

        if (user.getUserType().equals(UserType.ADMIN)) {
            adminCommand();
        }
    }

    private static void adminCommand() {
        boolean isRun = true;
        while (isRun) {
            Command.printAdminCommand();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case ADD_PRODUCT:
                    addProduct();
                    break;
                case REMOVE_PRODUCT_BY_ID:
                    deleteProduct();
                    break;
                case PRINT_PRODUCTS:
                    productStorage.print();
                    break;
                case PRINT_USERS:
                    userStorage.printUser();
                    break;
                case PRINT_ORDERS:
                    orderStorage.print();
                    break;
                case CHANGE_ORDER_STATUS:
                    changeOrderStatus();
                    break;
                default:
                    System.out.println("Invalid command. PLEASE TRY AGAIN !!!");
            }
        }
    }

    private static void changeOrderStatus() {
        orderStorage.print();

        System.out.println("Please choose ORDER ID");
        String orderId = scanner.nextLine();

        Order orderFromStorage = orderStorage.getById(orderId);

        if (orderFromStorage == null) {
            System.out.println("Wrong ORDER ID !!!");
            return;
        }

        for (OrderStatus value : OrderStatus.values()) {
            System.out.print(value + " ");
        }

        System.out.println("Please choose NEW STATUS");
        String orderStatusStr = scanner.nextLine();

        try {
            OrderStatus orderStatus = OrderStatus.valueOf(orderStatusStr.toUpperCase());
            if (orderFromStorage.getOrderStatus() == OrderStatus.NEW && orderStatus == OrderStatus.DELIVERED) {
                int count = orderFromStorage.getProduct().getStockQty() - orderFromStorage.getCount();
                orderFromStorage.setOrderStatus(orderStatus);
                orderFromStorage.getProduct().setStockQty(count);
                System.out.println("ORDER STATUS is updated !!!");
                return;
            }

            if (orderFromStorage.getOrderStatus() == OrderStatus.DELIVERED && orderStatus == OrderStatus.CANCELED || orderStatus == OrderStatus.NEW) {
                int count = orderFromStorage.getCount() + orderFromStorage.getProduct().getStockQty();
                orderFromStorage.getProduct().setStockQty(count);
                orderFromStorage.setOrderStatus(orderStatus);
                System.out.println("ORDER STATUS is updated !!!");
                return;
            }

            if (orderFromStorage.getOrderStatus() == OrderStatus.NEW && orderStatus == OrderStatus.CANCELED) {
                orderFromStorage.setOrderStatus(orderStatus);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Please write right STATUS !!!");
        }
    }

    private static void deleteProduct() {
        productStorage.print();
        System.out.println("Please choose PRODUCT ID");
        String productId = scanner.nextLine();
        Product productFromStorage = productStorage.getProductByID(productId);

        if (productFromStorage == null) {
            System.out.println("Wrong PRODUCT ID !!!");
            return;
        }

        productStorage.deleteProduct(productFromStorage);
    }

    private static void addProduct() {
        System.out.println("Please input PRODUCT ID");
        String productId = scanner.nextLine();
        Product productFromStorage = productStorage.getProductByID(productId);

        if (productFromStorage != null) {
            System.out.println("Product by " + productId + " have already added!!!");
            return;
        }
        System.out.println("Please input PRODUCT NAME");
        String productName = scanner.nextLine();

        System.out.println("Please input PRODUCT DESCRIPTION");
        String productDescription = scanner.nextLine();

        System.out.println("Please input PRODUCT PRICE");
        double productPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input PRODUCT COUNT");
        int productCount = Integer.parseInt(scanner.nextLine());

        System.out.println("Please choose PRODUCT TYPE");

        for (ProductType value : ProductType.values()) {
            System.out.print(value + " ");
        }

        try {

            String productTypeStr = scanner.nextLine();
            ProductType productType = ProductType.valueOf(productTypeStr.toUpperCase());

            Product product = new Product(productId, productName, productDescription, productPrice, productCount, productType);
            productStorage.add(product);

            System.out.println("Product is added !!!");

        } catch (IllegalArgumentException e) {
            System.out.println("Wrong PRODUCT TYPE !!!");
        }


    }

    private static void userCommand(User user) {

        boolean isRun = true;
        while (isRun) {
            Command.printUserCommand();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case PRINT_ALL_PRODUCTS:
                    productStorage.print();
                    break;
                case BUY_PRODUCT:
                    buyProduct(user);
                    break;
                case PRINT_MY_ORDERS:
                    printOrders(user);
                    break;
                case CANCEL_ORDER:
                    deleteOrder(user);
                    break;
            }
        }
    }

    private static void deleteOrder(User user) {
        orderStorage.getOrderByUser(user);
        System.out.println("Please choose ORDER ID");
        String orderId = scanner.nextLine();

        Order orderFromStorage = orderStorage.getById(orderId);

        if (orderFromStorage == null) {
            System.out.println("Please write right ORDER ID");
            return;
        }

        orderFromStorage.setOrderStatus(OrderStatus.CANCELED);

    }

    private static void printOrders(User user) {
        orderStorage.getOrderByUser(user);
    }

    private static void buyProduct(User user) {
        productStorage.print();
        System.out.println("Please choose PRODUCT BY ID");

        String productId = scanner.nextLine();
        Product productFromStorage = productStorage.getProductByID(productId);

        if (productFromStorage == null) {
            System.out.println("You input PRODUCT ID wrong !!!");
            return;
        }


        String orderID = UUIDUtil.randomId();
        try {
            System.out.println("Please input Order count. We have " + productFromStorage.getStockQty() + " from that product");
            int orderCount = Integer.parseInt(scanner.nextLine());

            if (orderCount > productFromStorage.getStockQty()) {
                System.out.println("Please input little count!!!");
                return;
            }

            double orderPrice = orderCount * productFromStorage.getPrice();

            System.out.println("Please choose PAYMENT METHOD ");

            for (PaymentMethod value : PaymentMethod.values()) {
                System.out.print(value + " ");
            }

            String paymentMethodStr = scanner.nextLine();
            PaymentMethod paymentMethod = PaymentMethod.valueOf(paymentMethodStr);

            Order order = new Order(orderID, user, productFromStorage, new Date(), orderCount, orderPrice, OrderStatus.NEW, paymentMethod);
            orderStorage.add(order);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong count !!!");
        }


    }
}
