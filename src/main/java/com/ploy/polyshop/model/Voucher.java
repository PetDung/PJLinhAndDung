package com.ploy.polyshop.model;

import java.sql.Date;

public class Voucher {
    private int voucherId;
    private String code;
    private int value;
    private Date startDate;
    private Date endDate;
    private Date createdAt;
    private Date updatedAt;
    private int quantity;
    private String description;
    private boolean isActive;

    public Voucher(int voucherId, String code, int value, Date startDate, Date endDate, Date createdAt, Date updatedAt, int quantity, String description, boolean isActive) {
        this.voucherId = voucherId;
        this.code = code;
        this.value = value;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.quantity = quantity;
        this.description = description;
        this.isActive = isActive;
    }

    public Voucher() {
    }

    // Getters and Setters

    public int getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
    
    public boolean isVoucherUsable() {
        // Kiểm tra trạng thái isActive của voucher
        if (!isActive) {
            return false;
        }
        
        // Kiểm tra ngày hiện tại có nằm trong khoảng startDate và endDate hay không
        Date currentDate = new Date(System.currentTimeMillis());
        if (currentDate.before(startDate) || currentDate.after(endDate)) {
            return false;
        }
        
        // Kiểm tra số lượng voucher còn lại
        if (quantity <= 0) {
            return false;
        }
        
        return true;
    }
}
