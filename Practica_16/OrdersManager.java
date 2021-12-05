package Practica_16;

public interface OrdersManager {
    int ItemsQuantity(String itemName);
    int ItemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
