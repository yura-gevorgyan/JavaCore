package homeworks.onlinemarket;

import homeworks.onlinemarket.model.*;
import homeworks.onlinemarket.storage.OrderStorage;
import homeworks.onlinemarket.storage.ProductStorage;
import homeworks.onlinemarket.storage.UserStorage;

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
            }
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
            userCommand();
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
                    userStorage.print();
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
            if (value.equals(orderFromStorage.getOrderStatus())) {
                continue;
            }
            System.out.println(value);
        }

        System.out.println("Please choose NEW STATUS");
        String orderStatusStr = scanner.nextLine();
        try {
            OrderStatus orderStatus = OrderStatus.valueOf(orderStatusStr.toUpperCase());
            orderFromStorage.setOrderStatus(orderStatus);
            System.out.println("ORDER STATUS is updated !!!");
        }catch (IllegalArgumentException e){
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

    private static void userCommand() {

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
                    buyProduct();
                    break;
                case PRINT_MY_ORDERS:
                    break;
                case CANCEL_ORDER:
                    break;
            }
        }
    }


    private static void buyProduct() {
        productStorage.print();
        System.out.println("Please choose PRODUCT BY ID");
        String productId = scanner.nextLine();
        Product productFromStorage = productStorage.getProductByID(productId);
        if (productFromStorage == null) {
            System.out.println("You input PRODUCT ID wrong !!!");
            return;
        }


    }
}
