package com.ploy.polyshop.repository;

import com.ploy.polyshop.model.OrderDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailReository implements XRepository<OrderDetail, Integer>{
    
   String SQL_INSERT = "INSERT INTO Order_Details (orders_id, product_details_id, discount_id, current_price, quantity, discount, total, total_cost, status, updated_at, created_at) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    
    @Override
    public void insert(OrderDetail entity) {
        DatBaseConnect.executeUpdate(SQL_INSERT,
                entity.getOrder().getOrderId(),
                entity.getProductDetail().getProductDetailsId(),
                entity.getDiscountId(),
                entity.getCurrentPrice(),
                entity.getQuantity(),
                entity.getDiscount(),
                entity.getTotal(),
                entity.getTotalCost(),
                entity.isStatus(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
                );
    }

    @Override
    public void update(OrderDetail entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OrderDetail selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<OrderDetail> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<OrderDetail> selectBySQL(String sql, Object... args) {
        
        List<OrderDetail> orderDetails = new ArrayList<>();
         try {
            // Execute the query
            ResultSet rs = DatBaseConnect.executeQuery(sql, args);
            
            // Process the result set
            while (rs.next()) {
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setOrderDetailsId(rs.getInt("order_details_id"));
                
                int orderId = rs.getInt("orders_id");
                
                orderDetail.setOrder(new OrderRepository().selectById(orderId));
                
                int productDetailsId = rs.getInt("product_details_id");
                orderDetail.setProductDetail(new ProductDetailRepository().selectById(productDetailsId));
                orderDetail.setDiscountId(rs.getInt("discount_id"));
                orderDetail.setCurrentPrice(rs.getDouble("current_price"));
                orderDetail.setQuantity(rs.getInt("quantity"));
                orderDetail.setDiscount(rs.getDouble("discount"));
                orderDetail.setTotal(rs.getDouble("total"));
                orderDetail.setTotalCost(rs.getDouble("total_cost"));
                orderDetail.setStatus(rs.getBoolean("status"));
                orderDetail.setUpdatedAt(rs.getDate("updated_at"));
                orderDetail.setCreatedAt(rs.getDate("created_at"));
                
                orderDetails.add(orderDetail);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return orderDetails;
    }
    
    
    
}
