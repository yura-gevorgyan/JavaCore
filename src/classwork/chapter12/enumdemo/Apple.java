package classwork.chapter12.enumdemo;

public enum Apple {
    JONATHAN(10), GOLDENDEL(9), REDDEL, WINESAP(15), CORTLAND(8);

    private int price;

    Apple(int p) {
        price = p;
    }

    Apple() {
        price = -1;
    }

    public int getPrice() {
        return price;
    }
}
