package com.ploy.polyshop.repository;

import com.ploy.polyshop.model.Voucher;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoucherRepsitory implements XRepository<Voucher, Integer>{
    
    String SELECT_BY_CODE = "SELECT * FROM Voucher WHERE code = ?";

    @Override
    public void insert(Voucher entity) {
    }

    @Override
    public void update(Voucher entity) {
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public Voucher selectById(Integer id) {
        return null;
    }

    @Override
    public List<Voucher> selectAll() {
        return null;
    }
    
    public Voucher selectByCode(String code){
        List<Voucher> list = selectBySQL(SELECT_BY_CODE, code);
        return !list.isEmpty() ? list.get(0) : null; 
    }

    @Override
    public List<Voucher> selectBySQL(String sql, Object... args) {
        
        List<Voucher> list = new ArrayList<>();
        try {
            ResultSet rs = DatBaseConnect.executeQuery(sql, args);
            while (rs.next()) {
                Voucher entity = new Voucher();

                entity.setVoucherId(rs.getInt("voucher_id"));
                entity.setCode(rs.getString("code"));
                entity.setValue(rs.getInt("value"));
                entity.setStartDate(rs.getDate("start_date"));
                entity.setEndDate(rs.getDate("end_date"));
                entity.setQuantity(rs.getInt("quantity"));
                entity.setDescription(rs.getString("description"));
                entity.setUpdatedAt(rs.getDate("updated_at"));
                entity.setCreatedAt(rs.getDate("created_at"));
                entity.setActive(rs.getBoolean("is_active"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
}
