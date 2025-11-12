/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yzf01
 */
public class Order {
    ArrayList<OrderItem> orderItemList;

    public Order() {
        this.orderItemList = new ArrayList<>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(Product p, double price, int quantity) {
        OrderItem orderItem = new OrderItem(p, price, quantity);
        orderItemList.add(orderItem);
        
    }

    public OrderItem findProduct(Product product) {
        // Search through the order's orderItemList to find if this product already exists
        for (OrderItem orderItem : orderItemList) {
            // Compare products by model number
            if (orderItem.getProduct().getModelNumber() == product.getModelNumber()) {
                return orderItem; // Found existing item in cart
            }
        }
        return null; // Product not in cart yet
    }

    public void removeOrderItem(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }


}
