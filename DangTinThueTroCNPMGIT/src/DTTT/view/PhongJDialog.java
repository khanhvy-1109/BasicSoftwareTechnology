/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTTT.view;

import DTTT.controller.ThongTinPhongController;
import DTTT.dao.DBConnect;
import DTTT.model.Anh;
import DTTT.model.ChuanHoa;
import DTTT.model.LoaiPhong;
import DTTT.model.ThongTinPhong;
import DTTT.model.ThongTinTin;
import DTTT.service.AnhService;
import DTTT.service.AnhServiceImpl;
import DTTT.service.ThongTinPhongService;
import DTTT.service.ThongTinPhongServiceImpl;
import DTTT.utility.ClassTableModel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.lang.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleRole;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

/**
 *
 * @author Snorlax
 */

public class PhongJDialog extends javax.swing.JDialog {
    
    String MaTinTin = ""; 
    public PhongJDialog() throws SQLException {
        initComponents();
        this.anhService = new AnhServiceImpl();
        
    }
    
    private AnhService anhService = new AnhServiceImpl();
    
    private ThongTinPhongService thongTinPhongService = null;
    
//    public PhongJDialog(ThongTinPhong tinphong, LoaiPhong lp) throws SQLException {
//        initComponents();
//        this.anhService = new AnhServiceImpl();
//        this.thongTinPhongService = new  ThongTinPhongServiceImpl();
//        ThongTinPhongController controller = new ThongTinPhongController(jtfMaTin,jtfDienTich,jtfGiaPhong,jtfSoPhong,jtfDieuHoa,jtfLoaiPhong,jtaMoTa);
//        controller.setView(tinphong, lp);
//         
//    }
    
    public PhongJDialog(ThongTinPhong tinphong, LoaiPhong lp) {
        initComponents();
        this.anhService = new AnhServiceImpl();
        this.thongTinPhongService = new  ThongTinPhongServiceImpl();
//        ThongTinPhongController controller = new ThongTinPhongController(jtfMaTin,jtfDienTich,jtfGiaPhong,jtfSoPhong,jtfDieuHoa,jtfLoaiPhong,jtaMoTa);
//        controller.setView(tinphong, lp);
         
    }
    
    public PhongJDialog(java.awt.Frame parent, boolean modal, ThongTinPhong tinphong, LoaiPhong lp) throws SQLException {
        super(parent, modal);
        
        initComponents();
        
        this.anhService = new AnhServiceImpl();
        ThongTinPhongController controller = new ThongTinPhongController(jtfMaTin,jtfDienTich,jtfGiaPhong,jtfSoPhong,jtfDieuHoa,jtfLoaiPhong,jtaMoTa);
        controller.setView(tinphong, lp);  
    }
    
    ThongTinTin ttt = new ThongTinTin();
    ThongTinPhong ttp = new ThongTinPhong(); 
//    List<Anh> listAnh = anhService.getList();
    Anh hinhAnh = new Anh(); // dùng để thêm hình ảnh mới  
    Anh ha = new Anh(); // dùng để duyệt hình ảnh đã có
    
    
    
   
    int loai=0,luu=0;
    ButtonGroup bg = new ButtonGroup();
    byte[] picture = null;
    List<byte[]> listAnhByte = null;
    
    
    public PhongJDialog(ThongTinPhong tinphong) throws SQLException {
        initComponents();
        
        
        this.anhService = new AnhServiceImpl();
        ThongTinPhongController controller = new ThongTinPhongController(jtfMaTin,jtfDienTich,jtfGiaPhong,jtfSoPhong,jtfDieuHoa,jtfLoaiPhong,jtaMoTa);
        controller.setView(tinphong);
        
         
    }
    
//    public PhongJDialog() {
//    }
    public void setTinPhong(ThongTinPhong tinphong){
        ThongTinPhongController controller = new ThongTinPhongController(jtfMaTin,jtfDienTich,jtfGiaPhong,jtfSoPhong,jtfDieuHoa,jtfLoaiPhong,jtaMoTa);
        controller.setView(tinphong);
    }
    
    public void setTinPhong(ThongTinPhong tinphong, LoaiPhong lp){
        ThongTinPhongController controller = new ThongTinPhongController(jtfMaTin,jtfDienTich,jtfGiaPhong,jtfSoPhong,jtfDieuHoa,jtfLoaiPhong,jtaMoTa);
        controller.setView(tinphong, lp);
    }
        
//        public void setTinPhong(ThongTinPhong tinphong, LoaiPhong lp, String MaTinTin){
//        ThongTinPhongController controller = new ThongTinPhongController(jtfDienTich,jtfGiaPhong,jtfSoPhong,jtfDieuHoa,jtfLoaiPhong,jtaMoTa);
//        controller.setView(tinphong, lp);
//        tinphong.getMaTin();
//    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfMaTin = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtfGiaPhong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfSoPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDieuHoa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfLoaiPhong = new javax.swing.JTextField();
        jtaMoTa = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jtfDienTich = new javax.swing.JTextField();
        jbtXemHinhPhong = new javax.swing.JButton();
        jbtnHenXemPhong = new javax.swing.JButton();

        jtfMaTin.setEditable(false);
        jtfMaTin.setBackground(new java.awt.Color(224, 236, 255));
        jtfMaTin.setForeground(new java.awt.Color(204, 239, 255));
        jtfMaTin.setText("jTextField1");
        jtfMaTin.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(224, 236, 255));

        jPanel2.setBackground(new java.awt.Color(12, 0, 126));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)), "Thông tin phòng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jtfGiaPhong.setEditable(false);
        jtfGiaPhong.setBackground(new java.awt.Color(12, 0, 126));
        jtfGiaPhong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfGiaPhong.setForeground(new java.awt.Color(255, 255, 255));
        jtfGiaPhong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfGiaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfGiaPhongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DTTT/images/round_attach_money_white_24dp.png"))); // NOI18N
        jLabel1.setText("Giá Phòng :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DTTT/images/round_meeting_room_white_24dp.png"))); // NOI18N
        jLabel2.setText("Số phòng :");

        jtfSoPhong.setEditable(false);
        jtfSoPhong.setBackground(new java.awt.Color(12, 0, 126));
        jtfSoPhong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfSoPhong.setForeground(new java.awt.Color(255, 255, 255));
        jtfSoPhong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfSoPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSoPhongActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DTTT/images/round_ac_unit_white_24dp.png"))); // NOI18N
        jLabel3.setText("Điều hòa :");

        jtfDieuHoa.setEditable(false);
        jtfDieuHoa.setBackground(new java.awt.Color(12, 0, 126));
        jtfDieuHoa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfDieuHoa.setForeground(new java.awt.Color(255, 255, 255));
        jtfDieuHoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfDieuHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDieuHoaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DTTT/images/baseline_format_list_bulleted_white_24dp.png"))); // NOI18N
        jLabel4.setText("Loại phòng :");

        jtfLoaiPhong.setEditable(false);
        jtfLoaiPhong.setBackground(new java.awt.Color(12, 0, 126));
        jtfLoaiPhong.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfLoaiPhong.setForeground(new java.awt.Color(255, 255, 255));
        jtfLoaiPhong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoaiPhongActionPerformed(evt);
            }
        });

        jtaMoTa.setEditable(false);
        jtaMoTa.setBackground(new java.awt.Color(12, 0, 126));
        jtaMoTa.setColumns(20);
        jtaMoTa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtaMoTa.setForeground(new java.awt.Color(255, 255, 255));
        jtaMoTa.setRows(5);
        jtaMoTa.setTabSize(15);
        jtaMoTa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mô tả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DTTT/images/baseline_architecture_white_24dp.png"))); // NOI18N
        jLabel6.setText("Diện tích :");

        jtfDienTich.setEditable(false);
        jtfDienTich.setBackground(new java.awt.Color(12, 0, 126));
        jtfDienTich.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtfDienTich.setForeground(new java.awt.Color(255, 255, 255));
        jtfDienTich.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfDienTich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDienTichActionPerformed(evt);
            }
        });

        jbtXemHinhPhong.setBackground(new java.awt.Color(255, 255, 255));
        jbtXemHinhPhong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtXemHinhPhong.setText("Xem ảnh phòng");
        jbtXemHinhPhong.setBorder(null);
        jbtXemHinhPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXemHinhPhongActionPerformed(evt);
            }
        });

        jbtnHenXemPhong.setBackground(new java.awt.Color(255, 255, 255));
        jbtnHenXemPhong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnHenXemPhong.setText("Hẹn xem phòng");
        jbtnHenXemPhong.setBorder(null);
        jbtnHenXemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHenXemPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfDieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDienTich))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jtfGiaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                    .addComponent(jtfSoPhong))))
                        .addGap(117, 117, 117))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtXemHinhPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbtnHenXemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtaMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfDieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtaMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnHenXemPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtXemHinhPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfGiaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfGiaPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfGiaPhongActionPerformed

    private void jtfSoPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSoPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoPhongActionPerformed

    private void jtfDieuHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDieuHoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDieuHoaActionPerformed

    private void jtfLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLoaiPhongActionPerformed

    private void jtfDienTichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDienTichActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDienTichActionPerformed

    private void jbtXemHinhPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXemHinhPhongActionPerformed
<<<<<<< HEAD

        MaTinTin = ChuanHoa.chuanHoaMa(jtfMaTin.getText());

=======
//        int anhIndex = 0;
        
         
        
//        List<ThongTinPhong> listPhong = thongTinPhongService.getList();
//        List<Anh> listAnh = anhService.getList();
        
//        for (int i = 0; i < listAnh.size(); i++) {
//            anhIndex = i;
//        }
//        picture = listAnh.get(anhIndex).getHinhAnh();
//        System.out.println(picture);
              
//        listAnhByte.add(picture);
              
//        Hinh hinh = new Hinh(hinhAnh.getDsha()); 
//            ha.setDsha(hinh.layDSHinh());    
//        HinhPhong hinh = new HinhPhong(listAnh, MaTinTin);  
           
        MaTinTin = jtfMaTin.getText();
        MaTinTin = ChuanHoa.chuanHoaMa(MaTinTin);
        
       
        
        System.out.println("Mã tin: "+MaTinTin+"/");
>>>>>>> 4cc4a4b37526423418ca6f20d502249c8d954521
        try {
            //        System.out.println(hinhAnh.getDsha());
            setTin(MaTinTin);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        HinhPhong hinhphong = new HinhPhong(hinhAnh.getDsha());
            ha.setDsha(hinhphong.layDSHinh());
            
    }//GEN-LAST:event_jbtXemHinhPhongActionPerformed

    private void jbtnHenXemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHenXemPhongActionPerformed
        try {
<<<<<<< HEAD
            MaTinTin = jtfMaTin.getText();
            MaTinTin = ChuanHoa.xoaKhoangTrang(MaTinTin);
            
=======
            // TODO add your handling code here:
            
            MaTinTin = jtfMaTin.getText();
            MaTinTin = ChuanHoa.xoaKhoangTrang(MaTinTin);
            
            
>>>>>>> 4cc4a4b37526423418ca6f20d502249c8d954521
            DatLichHen dl = new DatLichHen(MaTinTin);
            dl.setVisible(false);
            dl.setBounds(90, 90, 620, 470);
            dl.setLocationRelativeTo(null);
            dl.setVisible(true);
<<<<<<< HEAD
=======
            Container frame = jbtnHenXemPhong.getParent();
            do 
            frame = frame.getParent(); 
            while (!(frame instanceof PhongJDialog));                                      
            ((PhongJDialog) frame).dispose();
>>>>>>> 4cc4a4b37526423418ca6f20d502249c8d954521
        } catch (SQLException ex) {
            Logger.getLogger(PhongJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtnHenXemPhongActionPerformed
    
    public void setTin(String MaTinTin) throws SQLException{
        Connection conn = DBConnect.getConnection();
        String sql = "SELECT * FROM Thong_Tin_Tin ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        
        this.MaTinTin=MaTinTin;
        MaTinTin = ChuanHoa.chuanHoaMa(MaTinTin);
        conn.close();
        setThongTinPhong(MaTinTin);
    }
        
        public void setThongTinPhong(String MaTinTin) throws SQLException{
        Connection conn = DBConnect.getConnection();
        String sql = "SELECT * FROM Thong_Tin_Phong";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            if(ChuanHoa.chuanHoaMa(rs.getString("MaTin")).equals(MaTinTin)){

                  setHinhAnh(MaTinTin); 
                 
            }
        }
        
    }
    
    public void setHinhAnh(String MaTinTin) throws SQLException{
        Anh ha = new Anh();
        Connection conn = DBConnect.getConnection();
        String sql = "Select * FROM Hinh_Anh";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            if(ChuanHoa.chuanHoaMa(rs.getString("MaTin")).equals(MaTinTin)){
               
                ha.themHinh(rs.getBytes("HinhAnh"));
                ha.themID(rs.getString("MaHinhAnh"));
            }
        }
        this.hinhAnh=ha;
      
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtXemHinhPhong;
    private javax.swing.JButton jbtnHenXemPhong;
    private javax.swing.JTextArea jtaMoTa;
    private javax.swing.JTextField jtfDienTich;
    private javax.swing.JTextField jtfDieuHoa;
    private javax.swing.JTextField jtfGiaPhong;
    private javax.swing.JTextField jtfLoaiPhong;
    private javax.swing.JTextField jtfMaTin;
    private javax.swing.JTextField jtfSoPhong;
    // End of variables declaration//GEN-END:variables
}
