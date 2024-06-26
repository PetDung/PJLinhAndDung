package com.ploy.polyshop.model;
import java.sql.Date;

public class OrderDetail {
    private int orderDetailsId;
    private Order order;
    private ProductDetail productDetail;
    private Integer discountId;
    private Double currentPrice;
    private int quantity;
    private Double discount;
    private Double total;
    private Double totalCost;
    private boolean status;
    private Date updatedAt;
    private Date createdAt;

    public OrderDetail() {
        // Constructor mặc định
    }

    public OrderDetail(int orderDetailsId, Order order, ProductDetail productDetail, Integer discountId, Double currentPrice, int quantity, Double discount, Double total, Double totalCost, boolean status, Date updatedAt, Date createdAt) {
        this.orderDetailsId = orderDetailsId;
        this.order = order;
        this.productDetail = productDetail;
        this.discountId = discountId;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.total = total;
        this.totalCost = totalCost;
        this.status = status;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    
   
}

