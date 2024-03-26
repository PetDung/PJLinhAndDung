
package com.ploy.polyshop.repository;

import com.ploy.polyshop.model.Order;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository implements XRepository<Order, Integer>{
    
    String SQL_INSERT = "INSERT INTO Orders (account_id, customer_id, payment_method_id, status_order_id, voucher_id, quantity, total, discount, total_cost, customer_name, address, phone_number, note, updated_at, created_at) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String SQL_SELECT_NEW = "SELECT TOP 1 * FROM Orders ORDER BY orders_id DESC";
    String SQL_BY_ID = "SELECT * FROM Orders WHERE orders_id  = ?";
    
    String SQL_SELECT_ALL = "SELECT * FROM Orders";

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
    
    public Order getNewOrderId(){
        return selectBySQL(SQL_SELECT_NEW).get(0);
    }
    
    @Override
    public void update(Order entity) {
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public Order selectById(Integer id) {
        List<Order> list = selectBySQL(SQL_BY_ID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<Order> selectAll() {
        return selectBySQL(SQL_SELECT_ALL);
    }

    @Override
    public List<Order> selectBySQL(String sql, Object... args) {
        
        List<Order> orders = new ArrayList<>();
        try{
            // Execute the query
            ResultSet rs = DatBaseConnect.executeQuery(sql, args);
            // Process the result set
            while (rs.next()) {
                Order order = new Order();
                order.setOrderId(rs.getInt("orders_id"));
                order.setAccountId(rs.getInt("account_id"));
                order.setCustomerId(rs.getInt("customer_id"));
                order.setPaymentMethodId(rs.getInt("payment_method_id"));
                order.setStatusOrderId(rs.getInt("status_order_id"));
                order.setVoucherId(rs.getInt("voucher_id"));
                order.setQuantity(rs.getInt("quantity"));
                order.setTotal(rs.getDouble("total"));
                order.setDiscount(rs.getDouble("discount"));
                order.setTotalCost(rs.getDouble("total_cost"));
                order.setCustomerName(rs.getString("customer_name"));
                order.setAddress(rs.getString("address"));
                order.setPhoneNumber(rs.getString("phone_number"));
                order.setNote(rs.getString("note"));
                order.setUpdatedAt(rs.getDate("updated_at"));
                order.setCreatedAt(rs.getDate("created_at"));
                
                orders.add(order);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return orders ;
    }
    
}
