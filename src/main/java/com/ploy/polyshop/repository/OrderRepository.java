
package com.ploy.polyshop.repository;

import com.ploy.polyshop.model.Order;
import java.util.List;

public class OrderRepository implements XRepository<Order, Integer>{
    
    String SQL_INSERT = "INSERT INTO Orders (account_id, customer_id, payment_method_id, status_order_id, voucher_id, quantity, total, discount, total_cost, customer_name, address, phone_number, note, updated_at, created_at) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


    @Override
    public void insert(Order entity) {
        DatBaseConnect.executeUpdate(SQL_INSERT,
                entity.getAccountId(),
                entity.getCustomerId(),
                entity.getPaymentMethodId(),
                entity.getStatusOrderId(),
                entity.getVoucherId(),
                entity.getQuantity(),
                entity.getTotal(),
                entity.getDiscount(),
                entity.getTotalCost(),
                entity.getCustomerName(),
                entity.getAddress(),
                entity.getPhoneNumber(),
                entity.getNote(),
                entity.getUpdatedAt(),
                entity.getCreatedAt()
                );
    }

    @Override
    public void update(Order entity) {
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public Order selectById(Integer id) {
        return null;
    }

    @Override
    public List<Order> selectAll() {
        return null;
    }

    @Override
    public List<Order> selectBySQL(String sql, Object... args) {
        return null;
    }
    
}
