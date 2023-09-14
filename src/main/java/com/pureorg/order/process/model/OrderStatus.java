package com.pureorg.order.process.model;

public enum OrderStatus {

    NEW ("New"), INVENTORY_ASSIGNED("Inventory Allocated"),
    DELIVERY_SCHEDULED ("Delivery Scheduled"), DELIVERED ("Delivered"), PAYMENT_COMPLETED ("Paid"),
    COMPLETED ("Completed");

    public final String label;

    private OrderStatus(String label) {
        this.label = label;
    }
}
