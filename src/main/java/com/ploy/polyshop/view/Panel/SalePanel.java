package com.ploy.polyshop.view.Panel;

import com.ploy.polyshop.model.Customer;
import com.ploy.polyshop.model.Order;
import com.ploy.polyshop.model.OrderDetail;
import com.ploy.polyshop.model.ProductDetail;
import com.ploy.polyshop.model.Voucher;
import com.ploy.polyshop.repository.OrderRepository;
import com.ploy.polyshop.repository.VoucherRepsitory;
import com.ploy.polyshop.uint.ImageFromSystem;
import com.ploy.polyshop.view.HomeFrame;
import com.ploy.polyshop.view.component.AddCustomerSalePanel;
import com.ploy.polyshop.view.component.AddProductSale;
import com.ploy.polyshop.view.component.ImageTableCellRenderer;
import com.ploy.polyshop.view.component.LineWrapCellRenderer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class SalePanel extends javax.swing.JPanel {

    public HomeFrame father;

    Timer timer;

    List<OrderDetail> orderDetailsList = new ArrayList<>();
    VoucherRepsitory voucherRepsitory = new VoucherRepsitory();
    OrderRepository orderRepository = new OrderRepository();
    Voucher voucher;
    Customer customer;

    Order order = new Order();

    public SalePanel(HomeFrame father) {

        initComponents();
        this.father = father;
        tbOrderDetails.getColumnModel().getColumn(0).setCellRenderer(new ImageTableCellRenderer());
        tbOrderDetails.setDefaultEditor(Object.class, null);
        tbOrderDetails.getColumnModel().getColumn(4).setCellRenderer(new LineWrapCellRenderer());
        tbOrderDetails.getColumnModel().getColumn(2).setCellRenderer(new LineWrapCellRenderer());
        tbOrderDetails.getColumnModel().getColumn(1).setCellRenderer(new LineWrapCellRenderer());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrderDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbTong = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbGiam = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbThanhTien = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfSL = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        leftPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        tgbtnChuyenKhoan = new javax.swing.JToggleButton();
        tgbtnTienMat = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfTenKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfVoucher = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfNote = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ảnh", "Tên", "Thuộc Tính", "Đơn giá", "Thành tiền"
            }
        ));
        tbOrderDetails.setRowHeight(60);
        tbOrderDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrderDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrderDetails);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tổng ");

        lbTong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTong.setText("0");

        jLabel3.setText("Giảm");

        lbGiam.setForeground(new java.awt.Color(255, 51, 51));
        lbGiam.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Thành tiền");

        lbThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbThanhTien.setText("0");

        jButton2.setText("Trang chủ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Thêm sản phẩm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Số lượng:");

        jButton5.setText("Thêm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Xóa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTong, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSL, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(tfSL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbGiam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbThanhTien))
                .addGap(15, 15, 15))
        );

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Thanh toán");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tgbtnChuyenKhoan.setBackground(new java.awt.Color(251, 245, 244));
        buttonGroup1.add(tgbtnChuyenKhoan);
        tgbtnChuyenKhoan.setSelected(true);
        tgbtnChuyenKhoan.setText("Chuyển khoản");
        tgbtnChuyenKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtnChuyenKhoanActionPerformed(evt);
            }
        });

        tgbtnTienMat.setBackground(new java.awt.Color(251, 245, 244));
        buttonGroup1.add(tgbtnTienMat);
        tgbtnTienMat.setText("Thanh toán tiền mặt");

        jButton4.setText("Chọn khách hàng");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel2.setText("Tên khách hàng");

        jLabel4.setText("Số điện thoại");

        jLabel8.setText("Code Voucher");

        jLabel9.setText("Địa chỉ");

        tfNote.setColumns(20);
        tfNote.setRows(5);
        jScrollPane2.setViewportView(tfNote);

        jLabel10.setText("Ghi chú");

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Lưu");

        jButton8.setBackground(new java.awt.Color(255, 102, 102));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Xóa khách hàng ");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 153, 153));
        jButton9.setText("Áp dụng");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                        .addComponent(tgbtnChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tgbtnTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTenKH)
                                    .addComponent(tfSDT)
                                    .addComponent(jScrollPane2)
                                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(leftPanelLayout.createSequentialGroup()
                                        .addComponent(tfVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton9))))
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton8)
                                .addGap(3, 3, 3)))
                        .addGap(17, 17, 17))))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgbtnTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbtnChuyenKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(leftPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        father.setContentPane(new HomePanel(father));
        father.pack();
        father.revalidate();
        father.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed


    private void tgbtnChuyenKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtnChuyenKhoanActionPerformed

    }//GEN-LAST:event_tgbtnChuyenKhoanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        SalePanel this_ = this;

        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddProductSale(this_).setVisible(true);
            }
        });
        timer.setRepeats(false);
        timer.start();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbOrderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrderDetailsMouseClicked
        int row = tbOrderDetails.getSelectedRow();
        if (row >= 0) {
            OrderDetail orderDetail = orderDetailsList.get(row);
            tfSL.setText(orderDetail.getQuantity().toString());
        }

    }//GEN-LAST:event_tbOrderDetailsMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int row = tbOrderDetails.getSelectedRow();

        if (row >= 0) {
            Integer sl = Integer.parseInt(tfSL.getText());
            OrderDetail orderDetail = orderDetailsList.get(row);
            ProductDetail productDetail = orderDetail.getProductDetail();
            orderDetail.setQuantity(sl);
            orderDetail.setTotal(productDetail.getPrice() * orderDetail.getQuantity());
            orderDetail.setTotalCost(orderDetail.getTotal() - orderDetail.getQuantity() * orderDetail.getDiscount());
            loadTable();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int row = tbOrderDetails.getSelectedRow();
        if (row >= 0) {
            OrderDetail orderDetail = orderDetailsList.get(row);
            orderDetailsList.remove(orderDetail);
            loadTable();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        new AddCustomerSalePanel(this).setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        tfTenKH.setText("");
        tfSDT.setText("");
        tfDiaChi.setText("");
        customer = null;
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        handlerSave("PAYED");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        String code  = tfVoucher.getText().trim();
        if(code.isBlank()) {
            JOptionPane.showMessageDialog(this, "Chưa điền code!");
            return;
        }
        
        if (!code.isBlank()) {
            voucher = voucherRepsitory.selectByCode(code);
////            if (voucher == null) {
//                JOptionPane.showMessageDialog(this, "Code voucher không đúng!");
//                return;
//            }
//            order.setVoucherId(voucher.getVoucherId());
        }
       loadMoney();
    }//GEN-LAST:event_jButton9ActionPerformed

    public void loadTable() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tbOrderDetails.getModel();
                model.setRowCount(0);
                orderDetailsList.forEach(item -> {
                    ImageIcon image;
                    try {
                        image = new ImageFromSystem().getImage(item.getProductDetail().getImageUrl());
                    } catch (Exception ex) {
                        image = new ImageFromSystem().getImage("/images/defaul.jpg");
                    }
                    model.addRow(new Object[]{
                        image,
                        item.getProductDetail().getProduct().getProductName(),
                        "Màu: " + item.getProductDetail().getColor().getColorName()
                        + "\nSize: " + item.getProductDetail().getSize().getSizeName(),
                        item.getCurrentPrice(),
                        "Số lượng: " + item.getQuantity()
                        + "\nGiảm giá: " + item.getDiscount()
                        + "\nThành tiền: " + (item.getTotalCost())
                    });
                });
                loadMoney();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public void loadInfoCustomer() {
        if (customer != null) {
            tfTenKH.setText(customer.getCustomerName());
            tfSDT.setText(customer.getPhoneNumber());
            tfDiaChi.setText(customer.getAddress());
        }
    }

    public void loadMoney() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order.setTotal(0.0);
                order.setTotalCost(0.0);
                order.setDiscount(0.0);
                for (OrderDetail item : orderDetailsList) {
                    order.setTotal(order.getTotal() + item.getTotal());
                    order.setDiscount(order.getDiscount()+ item.getDiscount());
                    order.setTotalCost(order.getTotalCost()+item.getTotalCost());
                    
                }
                if(voucher !=null ){
                    order.setDiscount(order.getDiscount() + ((voucher.getValue()/100)* order.getTotalCost()));
                    order.setTotalCost(order.getTotalCost()- ((voucher.getValue()/100)* order.getTotalCost()));
                    System.out.println( ((voucher.getValue()/100)* order.getTotalCost()) + "||" + voucher.getValue() + "||"+ order.getTotalCost());
                }
                
                lbTong.setText(String.valueOf(order.getTotal()));
                lbGiam.setText(String.valueOf(order.getDiscount()));
                lbThanhTien.setText(String.valueOf(order.getTotalCost()));
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public List<OrderDetail> getOrderDetailsList() {
        return orderDetailsList;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderDetailsList(List<OrderDetail> orderDetailsList) {
        this.orderDetailsList = orderDetailsList;
    }

    public void handlerSave(String type) {

        if (orderDetailsList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hóa đơn chưa có sản phẩm");
            return;
        }

        String customerName = tfTenKH.getText().trim();
        String sdt = tfSDT.getText().trim();
        String note = tfNote.getText().trim();
        String code = tfVoucher.getText().trim();
        String address = tfDiaChi.getText().trim();

        order.setPhoneNumber(customerName);
        order.setAddress(address);
        order.setNote(note);
        order.setPhoneNumber(sdt);
        order.setAccountId(1); // đang fix cứng
        order.setStatusOrderId(4);
        order.setPaymentMethodId(1);
        if (type.equals("SAVE")) {
            order.setStatusOrderId(1);
        }

        if (customer == null) {

            if (customerName.isBlank()) {
                order.setCustomerName("Khách lẻ");
            }
            if (!sdt.isBlank() && !customerName.isBlank()) {

            }
            order.setCustomerId(null);

        } else {
            order.setCustomerId(customer.getCustomerId());
        }
       
        int value = 0;
        order.setVoucherId(null);
        if (!code.trim().isBlank()) {
            voucher = voucherRepsitory.selectByCode(code);
            if (voucher == null) {
                JOptionPane.showMessageDialog(this, "Code voucher không đúng!");
                return;
            }
            value = voucher.getValue();
            order.setVoucherId(voucher.getVoucherId());
        }
        loadMoney();
        
        LocalDate updatedAtLCD = LocalDate.now();
        Date updatedAt = Date.valueOf(updatedAtLCD);
        Date createdAt = updatedAt;
        order.setCreatedAt(createdAt);
        order.setUpdatedAt(updatedAt);

        orderRepository.insert(order);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbGiam;
    private javax.swing.JLabel lbThanhTien;
    private javax.swing.JLabel lbTong;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JTable tbOrderDetails;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextArea tfNote;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfSL;
    private javax.swing.JTextField tfTenKH;
    private javax.swing.JTextField tfVoucher;
    private javax.swing.JToggleButton tgbtnChuyenKhoan;
    private javax.swing.JToggleButton tgbtnTienMat;
    // End of variables declaration//GEN-END:variables
}
