package com.ploy.polyshop.view.component;

import com.ploy.polyshop.model.Color;
import com.ploy.polyshop.model.OrderDetail;
import com.ploy.polyshop.model.ProductDetail;
import com.ploy.polyshop.model.Size;
import com.ploy.polyshop.repository.ColorRepository;
import com.ploy.polyshop.repository.ProductDetailRepository;
import com.ploy.polyshop.repository.SizeRepository;
import com.ploy.polyshop.view.Panel.SalePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AddProductSale extends javax.swing.JFrame {

    SalePanel father;
    Timer timer;
    Timer timerThuocTinh;

    ProductDetailRepository productDetailRepository = new ProductDetailRepository();
    List<ProductDetail> productDetailList;
    ColorRepository colorRepository = new ColorRepository();
    SizeRepository sizeRepository = new SizeRepository();
    List<Color> listColor;
    List<Size> listSize;
    boolean firstRender = true;

    public AddProductSale(SalePanel father) {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK);
        // Thiết lập đường viền cho JFrame
        getRootPane().setBorder(border);
        initComponents();

        this.father = father;
        father.father.setEnabled(false);
        intit();
    }

    public AddProductSale() {
        initComponents();
        intit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfTim = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lbThongBao = new javax.swing.JLabel();
        cbColor = new javax.swing.JComboBox<>();
        cbSize = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Màu", "Size", "Hành động", "Giá", "Giảm"
            }
        ));
        jTable1.setRowSelectionAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTimKeyReleased(evt);
            }
        });

        jButton2.setText("Xong");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        lbThongBao.setForeground(new java.awt.Color(255, 51, 51));

        cbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbColorItemStateChanged(evt);
            }
        });
        cbColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbColorMouseClicked(evt);
            }
        });
        cbColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbColorActionPerformed(evt);
            }
        });

        cbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSizeItemStateChanged(evt);
            }
        });
        cbSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbSizeMouseClicked(evt);
            }
        });
        cbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSizeActionPerformed(evt);
            }
        });

        jButton1.setText("Tất cả");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Tìm kiếm ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(802, 802, 802)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(lbThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.rowAtPoint(evt.getPoint());
        int column = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0 && column == 5) {
            Integer value = 1;
            ProductDetail productDetail = productDetailList.get(row);

            for (int i = 0; i < father.getOrderDetailsList().size(); i++) {
                OrderDetail orderDetail = father.getOrderDetailsList().get(i);
                ProductDetail oldProductDetail = orderDetail.getProductDetail();
                if (oldProductDetail.getProductDetailsId() == productDetail.getProductDetailsId()) {
                    orderDetail.setQuantity(orderDetail.getQuantity() + value);
                    if (!(productDetail.getQuantity() > orderDetail.getQuantity())) {
                        thongBao("Đã thêm hết số lượng trong kho!");
                        return;
                    }
                    orderDetail.setTotal(productDetail.getPrice() * orderDetail.getQuantity());
                    orderDetail.setTotalCost(orderDetail.getTotal() - orderDetail.getQuantity() * orderDetail.getDiscount());
                    thongBao("Thêm thành công!" + father.getOrderDetailsList().size());
                    father.loadTable();
                    return;
                }
            }
            OrderDetail newOrderDetail = new OrderDetail();
            newOrderDetail.setQuantity(value);
            newOrderDetail.setProductDetail(productDetail);
            newOrderDetail.setCurrentPrice(productDetail.getPrice());
            newOrderDetail.setDiscount(0.0);
            newOrderDetail.setDiscountId(productDetail.getDiscountId() == 0 ? null : productDetail.getDiscountId());
            System.out.println(newOrderDetail.getDiscountId());
            newOrderDetail.setTotal(productDetail.getPrice() * newOrderDetail.getQuantity());
            newOrderDetail.setTotalCost(newOrderDetail.getTotal() - newOrderDetail.getQuantity() * newOrderDetail.getDiscount());

            LocalDate updatedAtLCD = LocalDate.now();
            Date updatedAt = Date.valueOf(updatedAtLCD);
            Date createdAt = updatedAt;

            newOrderDetail.setCreatedAt(createdAt);
            newOrderDetail.setUpdatedAt(updatedAt);

            father.getOrderDetailsList().add(newOrderDetail);

            thongBao("Thêm thành công!" + father.getOrderDetailsList().size());

            father.loadTable();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void cbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSizeActionPerformed

    private void tfTimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTimKeyReleased
        search();
    }//GEN-LAST:event_tfTimKeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        productDetailList = productDetailRepository.selectActive();
        cbColor.setSelectedIndex(0);
        cbSize.setSelectedIndex(0);
        loadTable(productDetailList);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        father.father.setEnabled(true);
        this.dispose();

    }//GEN-LAST:event_jButton2MouseClicked

    private void cbColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbColorMouseClicked

    }//GEN-LAST:event_cbColorMouseClicked

    private void cbColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbColorActionPerformed

    }//GEN-LAST:event_cbColorActionPerformed

    private void cbSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSizeMouseClicked

    }//GEN-LAST:event_cbSizeMouseClicked

    private void cbColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbColorItemStateChanged
        filter();
    }//GEN-LAST:event_cbColorItemStateChanged

    private void cbSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSizeItemStateChanged
        filter();
    }//GEN-LAST:event_cbSizeItemStateChanged

    void intit() {
        jTable1.setRowHeight(40);
        jTable1.setDefaultEditor(Object.class, null);
        // Disable editing for a specific column (e.g., Age column)
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        productDetailList = productDetailRepository.selectActive();
        loadTable(productDetailList);
        loadThuocTinh();
    }

    void loadTable(List<ProductDetail> productDetailList) {

        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                productDetailList.forEach(productDetail -> {
                    model.addRow(new Object[]{
                        productDetail.getProduct().getProductName() + productDetail.getProduct().getMaterial().getMaterialName(),
                        productDetail.getColor().getColorName(),
                        productDetail.getSize().getSizeName(),
                        productDetail.getPrice(),
                        0,
                        "Thêm",});
                });

            }
        });
        timer.setRepeats(false);
        timer.start();

    }

    void loadThuocTinh() {
        if (timerThuocTinh != null && timerThuocTinh.isRunning()) {
            timerThuocTinh.stop();
        }
        timerThuocTinh = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listColor = colorRepository.selectAll();
                cbColor.removeAllItems();
                cbColor.addItem("Chọn màu");
                listColor.forEach(item -> {
                    cbColor.addItem(item.getColorName());
                });
                listSize = sizeRepository.selectAll();
                cbSize.removeAllItems();
                cbSize.addItem("Chọn size");
                listSize.forEach(item -> {
                    cbSize.addItem(item.getSizeName());
                });
                firstRender = false;
            }
        });
        timerThuocTinh.setRepeats(false);
        timerThuocTinh.start();
    }

    void thongBao(String content) {

        lbThongBao.setText(content);
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbThongBao.setText("");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public void search() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }
        timer = new Timer(300, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfTim.getText().trim();
                if (name.isBlank()) {
                    productDetailList = productDetailRepository.selectActive();
                }
                productDetailList = productDetailRepository.selectByProductName(name);
                loadTable(productDetailList);

            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    void filter() {
        if (firstRender) {
            return;
        }
        int colorIndex = cbColor.getSelectedIndex();
        int sizeIndex = cbSize.getSelectedIndex();
        if (sizeIndex > 0 && colorIndex > 0 && listColor != null && listSize != null) {
            Color color = listColor.get(colorIndex - 1);
            Size size = listSize.get(sizeIndex - 1);
            List<ProductDetail> filterList = new ArrayList<>();
            for (ProductDetail productDetail : productDetailList) {
                if (color.getColorId() == productDetail.getColor().getColorId()
                        && size.getSizeId() == productDetail.getSize().getSizeId()) {
                    filterList.add(productDetail);
                }
                loadTable(filterList);
                return;
            }
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbColor;
    private javax.swing.JComboBox<String> cbSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JTextField tfTim;
    // End of variables declaration//GEN-END:variables
}
