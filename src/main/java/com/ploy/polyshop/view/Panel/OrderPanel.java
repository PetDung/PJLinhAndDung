package com.ploy.polyshop.view.Panel;

import com.ploy.polyshop.model.Order;
import com.ploy.polyshop.model.OrderDetail;
import com.ploy.polyshop.repository.CustomerRepository;
import com.ploy.polyshop.repository.OrderDetailReository;
import com.ploy.polyshop.repository.OrderRepository;
import com.ploy.polyshop.view.HomeFrame;
import com.ploy.polyshop.view.component.LineWrapCellRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class OrderPanel extends javax.swing.JPanel {
    
    public HomeFrame father;
    
    List<Order> orders;
    List<OrderDetail> orderDetails;
    OrderRepository orderRepository = new OrderRepository();
    OrderDetailReository orderDetailReository = new OrderDetailReository();
    CustomerRepository customerRepository = new CustomerRepository();

    public OrderPanel(  HomeFrame father) {
        initComponents();
        init();
        this.father = father;
    }

    void init() {
        orders = orderRepository.selectAll();
        tbHD.setDefaultEditor(Object.class, null);
        tbSP.setDefaultEditor(Object.class, null);
        tbSP.getColumnModel().getColumn(0).setCellRenderer(new LineWrapCellRenderer());
        loadTableHD();
        cbbtt.removeAllItems();
        cbbtt.addItem("Đang xử lý");
        cbbtt.addItem("Hoàn thành");
        cbbtt.addItem("Đã hủy");
    }

    void loadTableHD() {
        DefaultTableModel model = (DefaultTableModel) tbHD.getModel();
        model.setRowCount(0);

        orders.forEach(item -> {
            String status = "Đang xử lý";
            if (item.getStatusOrderId() == 2) {
                status = "Hoàn thành";
            }
            if (item.getStatusOrderId() == 3) {
                status = "Đã hủy";
            }
            model.addRow(new Object[]{
                item.getOrderId(),
                item.getCustomerName(),
                item.getPhoneNumber(),
                item.getAddress(),
                item.getTotalCost(),
                status,
                item.getQuantity(),
                item.getCreatedAt().toString()
            });
        });
    }

    void loadTableSP() {
        DefaultTableModel model = (DefaultTableModel) tbSP.getModel();
        model.setRowCount(0);
        orderDetails.forEach(item -> {
            model.addRow(new Object[]{
                item.getProductDetail().getProduct().getProductName()
                + "\n" + item.getProductDetail().getColor().getColorName()
                + "\n" + item.getProductDetail().getSize().getSizeName(),
                item.getQuantity(),
                item.getCurrentPrice(),
                item.getDiscount(),
                item.getTotalCost()

            });

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHD = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnTao = new javax.swing.JButton();
        btnDoiKH = new javax.swing.JButton();
        btnKL = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        cbbtt = new javax.swing.JComboBox<>();

        tbHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Khách hàng", "Số điện thoại", "Địa chỉ", "Tổng giá trị", "Trạng thái", "Số lượng", "Ngày tạo hóa đơn", "Vocher giảm"
            }
        ));
        tbHD.setRowHeight(40);
        tbHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbHDMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbHD);

        tbSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sản phẩm", "Số lượng", "Đơn giá", "Giảm", "Thành tiền"
            }
        ));
        tbSP.setRowHeight(60);
        jScrollPane2.setViewportView(tbSP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh sách sản phẩm ");

        btnXoa.setBackground(new java.awt.Color(255, 0, 102));
        btnXoa.setText("Xóa sản phẩm");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(0, 204, 204));
        btnThem.setText("Thêm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Danh sách hóa đơn");

        jLabel3.setText("Tên khách hàng");

        jLabel4.setText("Số điện thoại");

        jLabel5.setText("Địa chỉ");

        jLabel6.setText("Trạng thái");

        btnSua.setBackground(new java.awt.Color(0, 204, 204));
        btnSua.setText("Sửa");

        btnTao.setBackground(new java.awt.Color(102, 255, 204));
        btnTao.setText("Tạo");

        btnDoiKH.setBackground(new java.awt.Color(51, 255, 204));
        btnDoiKH.setText("Đổi khách hàng");

        btnKL.setBackground(new java.awt.Color(255, 0, 0));
        btnKL.setText("Khách lẻ");

        jLabel7.setText("Tìm kiếm");

        jToggleButton1.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("Đang xử lý");

        jToggleButton2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Hoàn thành");

        jToggleButton3.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jToggleButton3.setText("Đã hủy");

        jToggleButton4.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setSelected(true);
        jToggleButton4.setText("Tất cả");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Trang chủ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbbtt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(508, 508, 508)
                                        .addComponent(btnXoa)
                                        .addGap(45, 45, 45)
                                        .addComponent(btnThem))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnKL)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                        .addComponent(tfTen, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfSDT, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSua)
                                        .addGap(39, 39, 39)
                                        .addComponent(btnTao))
                                    .addComponent(btnDoiKH)
                                    .addComponent(cbbtt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(480, 480, 480))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)))
                                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnXoa)
                            .addComponent(btnThem))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnDoiKH)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbbtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnKL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTao)
                            .addComponent(btnSua))
                        .addGap(349, 349, 349))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHDMouseClicked
        int row = tbHD.getSelectedRow();
        if (row >= 0) {
            Order order = orders.get(row);
            orderDetails = orderDetailReository.selectByOrderId(order.getOrderId());
            loadTableSP();
            cbbtt.setEditable(false);
            if (order.getStatusOrderId() != 1) {
                btnThem.setEnabled(false);
                btnXoa.setEnabled(false);
                btnDoiKH.setEnabled(false);
                btnKL.setEnabled(false);
                btnSua.setEnabled(false);
                btnTao.setEnabled(false);
                tfDiaChi.setEditable(false);
                tfSDT.setEditable(false);
                tfTen.setEditable(false);
 

            } else {
                btnThem.setEnabled(true);
                btnXoa.setEnabled(true);
                btnDoiKH.setEnabled(true);
                btnKL.setEnabled(true);
                btnSua.setEnabled(true);
                btnTao.setEnabled(true);
                tfDiaChi.setEditable(true);
                tfSDT.setEditable(true);
                tfTen.setEditable(true);
            }
            tfTen.setText(order.getCustomerName());
            tfSDT.setText(order.getPhoneNumber() == null ? "" : order.getPhoneNumber());
            tfDiaChi.setText(order.getAddress() == null ? "" : order.getAddress());
            cbbtt.setSelectedIndex(order.getStatusOrderId()-1);

        }
    }//GEN-LAST:event_tbHDMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tbSP.getSelectedRow();
        if (row >= 0) {
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Bạn có chắc chắn xóa không?",
                    "Xóa",
                    JOptionPane.YES_NO_OPTION);

            // Kiểm tra lựa chọn của người dùng
            if (choice == JOptionPane.YES_OPTION) {

                OrderDetail orderDetail = orderDetails.get(row);
                Order order = orderDetail.getOrder();
                if (order.getStatusOrderId() != 1) {
                    JOptionPane.showMessageDialog(this, "Ở trạng thái này không thể sửa hóa đơn!");
                    return;
                }
                orderDetailReository.delete(orderDetail.getOrderDetailsId());
                orderDetails.remove(orderDetail);
                loadMoney(order);
                System.out.println(order.getQuantity());
                orderRepository.update(order);
                orders = orderRepository.selectAll();
                loadTableSP();
                loadTableHD();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm!");
            return;
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void tbHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbHDMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        father.setContentPane(new HomePanel(father));
        father.revalidate();
        father.repaint();
        father.pack();
    }//GEN-LAST:event_jButton1ActionPerformed
    Timer timer;
    
    public void loadMoney( Order order) {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order.setTotal(0.0);
                order.setTotalCost(0.0);
                order.setDiscount(0.0);
                order.setQuantity(0);
                for (OrderDetail item : orderDetails) {
                    order.setTotal(order.getTotal() + item.getTotal());
                    order.setDiscount(order.getDiscount() + item.getDiscount());
                    order.setTotalCost(order.getTotalCost() + item.getTotalCost());
                    order.setQuantity(item.getQuantity() + order.getQuantity());

                }
                
//                if (voucher != null) {
//                    order.setDiscount(order.getDiscount() + ((voucher.getValue() / 100.0) * order.getTotalCost()));
//                    order.setTotalCost(order.getTotalCost() - ((voucher.getValue() / 100.0) * order.getTotalCost()));
//
//                }
//
//                lbTong.setText(String.valueOf(order.getTotal()));
//                lbGiam.setText(String.valueOf(order.getDiscount()));
//                lbThanhTien.setText(String.valueOf(order.getTotalCost()));
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoiKH;
    private javax.swing.JButton btnKL;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbtt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTable tbHD;
    private javax.swing.JTable tbSP;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables
}
