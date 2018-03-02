
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.function.UnaryOperator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class QL_DIEM extends javax.swing.JFrame {
    private ArrayList<MarkStudent> list = new ArrayList<MarkStudent>();
    private int CurrentIndex = -1;
    private String header[] ={"Ma SV", "Ten SV", "Lop", "Mon Hoc", "Ma Mon Hoc", "GVHD", "Diem LT", "Diem TH", "Ass1", "Ass2", "Diem BV", "Hinh Anh"};
    private DefaultTableModel modelTableDiem = new DefaultTableModel(header,0);
    MarkStudent ms = new MarkStudent();
    double dtb;
    public QL_DIEM() {
        initComponents();
        loadDataToTable();
        loadData();   
    }
    private void loadDataToTable(){
        try{
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv_ps04107","root", "");
            String sql = "SELECT sinhvien.MaSV, TenSV, Lop, MonHoc, MaMon, GVHD, DiemLT, DiemTH, Ass1, Ass2, DiemBV, HinhAnh FROM bangdiem join sinhvien on bangdiem.MaSV = sinhvien.MaSV";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Vector sv = null;
            modelTableDiem.setRowCount(0);
            while(rs.next()){
                sv = new Vector();
                sv.add(rs.getString("MaSV"));
                sv.add(rs.getString("TenSV"));
                sv.add(rs.getString("Lop"));
                sv.add(rs.getString("MonHoc"));
                sv.add(rs.getString("MaMon"));
                sv.add(rs.getString("GVHD"));
                sv.add(rs.getDouble("DiemLT"));
                sv.add(rs.getDouble("DiemTH"));
                sv.add(rs.getDouble("Ass1"));
                sv.add(rs.getDouble("Ass2"));
                sv.add(rs.getDouble("DiemBV"));
                sv.add(rs.getString("HinhAnh"));
                modelTableDiem.addRow(sv);
            }
            tblSinhVien.setModel(modelTableDiem);
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGVHD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDiemLT = new javax.swing.JTextField();
        txtDiemTH = new javax.swing.JTextField();
        txtAss1 = new javax.swing.JTextField();
        txtAss2 = new javax.swing.JTextField();
        txtDiemBV = new javax.swing.JTextField();
        txtMaMon = new javax.swing.JTextField();
        txtMonHoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        btnBrowser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLop = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDiemTB = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        btnTiemKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Grade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel9.setText("Mã Môn: ");

        jLabel10.setText("Môn Học: ");

        jLabel11.setText("Giáo Viên HD: ");

        jLabel13.setText("Điểm LT: ");

        jLabel14.setText("Điểm TH:");

        jLabel15.setText("Assignment 1:");

        jLabel16.setText("Assignment 2:");

        jLabel17.setText("Điểm BV: ");

        txtDiemBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemBVActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAss2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(txtGVHD)
                            .addComponent(txtDiemLT)
                            .addComponent(txtDiemTH)
                            .addComponent(txtAss1)
                            .addComponent(txtDiemBV)
                            .addComponent(txtMonHoc)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGVHD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemLT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemTH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAss1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAss2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemBV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mark Students Management");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframe.image/default.jpg"))); // NOI18N

        btnBrowser.setText("Browser");
        btnBrowser.setToolTipText("");
        btnBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowserActionPerformed(evt);
            }
        });

        jLabel3.setText("Full Name: ");

        txtTen.setEditable(false);
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        jLabel4.setText("Student ID: ");

        jLabel5.setText("Lớp: ");

        jLabel6.setText("Điểm TB: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen)
                            .addComponent(txtMaSV)
                            .addComponent(txtLop)
                            .addComponent(txtDiemTB, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 0))); // NOI18N

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnTiemKiem.setText("Tim Kiem");
        btnTiemKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiemKiemActionPerformed(evt);
            }
        });

        jLabel2.setText("Source Image: ");

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setText("Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSource, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadData(){
        try{
            Connection conn=null;
            Statement stmt=null;
            //connection databse
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv_ps04107","root", "");
            //Execute a query
            stmt = conn.createStatement();
            String sql = "Select bangdiem.MaSV as MaSV, TenSV, Lop, MonHoc, MaMon, GVHD, DiemLT, DiemTH, Ass1, Ass2, DiemBV, HinhAnh from sinhvien join bangdiem on sinhvien.MaSV = bangdiem.MaSv";
            //dat cau lenh truy van o day...
            ResultSet rs = stmt.executeQuery(sql);
            JOptionPane.showMessageDialog(this, "Connection successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
            //Doc du lieu tu database...
            while(rs.next()){
                String MaSV = rs.getString("MaSV");
                String TenSV = rs.getString("TenSV");
                String Lop = rs.getString("Lop");
                String MonHoc = rs.getString("MonHoc");
                String MaMonHoc = rs.getString("MaMon");
                String GV = rs.getString("GVHD");
                float DiemLT = rs.getFloat("DiemLT");
                float DiemTH = rs.getFloat("DiemTH");
                float Ass1 = rs.getFloat("Ass1");
                float Ass2 = rs.getFloat("Ass2");
                float BV = rs.getFloat("DiemBV");
                String HinhAnh = rs.getString("HinhAnh");
                //Them vao doi tuong vao list
                MarkStudent ms = new MarkStudent(MaSV, TenSV, Lop, MonHoc, MaMonHoc, GV, DiemLT, DiemTH, Ass1, Ass2,BV, HinhAnh);
                list.add(ms);
                //doc du lieu len from
            }
            CurrentIndex=0;
            DisplayDiem();
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            JOptionPane.showMessageDialog(this, "Ket noi den database that bai");
        }
    }
    private void DisplayDiem(){
        MarkStudent ms = list.get(CurrentIndex);
        txtMaSV.setText(ms.getMaSV());
        txtTen.setText(ms.getTenSV());
        txtLop.setText(ms.getLop());
        txtMaMon.setText(ms.getSubID());
        txtMonHoc.setText(ms.getSubject());
        txtGVHD.setText(ms.getGV());
        txtDiemLT.setText(String.valueOf(ms.getDiemLT()));
        txtDiemTH.setText(String.valueOf(ms.getDiemTH()));
        txtAss1.setText(String.valueOf(ms.getAssignment1()));
        txtAss2.setText(String.valueOf(ms.getAssignment2()));
        txtDiemBV.setText(String.valueOf(ms.getDiemBV()));
        lblAvatar.setIcon(new ImageIcon(ms.getHinhAnh()));
        UpdateDTB();
    }
    private void UpdateDTB(){
        double diemLT = Double.parseDouble(txtDiemLT.getText());
        double diemTH = Double.parseDouble(txtDiemTH.getText());
        double Ass1 = Double.parseDouble(txtAss1.getText());
        double Ass2 = Double.parseDouble(txtAss2.getText());
        double BV = Double.parseDouble(txtDiemBV.getText());
        dtb = (diemLT+diemTH+Ass1+Ass2+BV)/5;
        txtDiemTB.setText(dtb+"");
    }
    private void reset(){
        txtMaSV.setText("");
        txtTen.setText("");
        txtLop.setText("");
        txtDiemTB.setText("");
        txtMaMon.setText("");
        txtMonHoc.setText("");
        txtGVHD.setText("");
        txtDiemLT.setText("");
        txtDiemTH.setText("");
        txtAss1.setText("");
        txtAss2.setText("");
        txtDiemBV.setText("");
        lblAvatar.setIcon(new ImageIcon());
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Are you exit?","Confirm", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnTiemKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiemKiemActionPerformed
        // TODO add your handling code here:
        int i;
        String MaSV;
        MaSV = txtTimKiem.getText();
        for(i=0;i<list.size();i++){
            MarkStudent ms = list.get(i);
            if(ms.getMaSV().equalsIgnoreCase(MaSV)){
                JOptionPane.showMessageDialog(this, "Da tim thay", "Thong Bao", JOptionPane.INFORMATION_MESSAGE);
                CurrentIndex = i;
                DisplayDiem();
                break;
            }
        }
        if(i==list.size()){
            JOptionPane.showMessageDialog(this, "Khong tim thay sinh vien nay.", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
            txtTimKiem.requestFocus();
        }
    }//GEN-LAST:event_btnTiemKiemActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Vector dataRow = new Vector();
        dataRow.add(txtMaSV.getText().trim());
        dataRow.add(txtLop.getText().trim());
        dataRow.add(txtMonHoc.getText().trim());
        dataRow.add(txtMaMon.getText().trim());
        dataRow.add(txtGVHD.getText().trim());
        dataRow.add(txtDiemLT.getText().trim());
        dataRow.add(txtDiemTH.getText().trim());
        dataRow.add(txtAss1.getText().trim());
        dataRow.add(txtAss2.getText().trim());
        dataRow.add(txtDiemBV.getText().trim());
        String sql = "Insert into bangdiem(MaSV, Lop, MonHoc, MaMon, GVHD, DiemLT, DiemTH, Ass1, Ass2, DiemBV, DiemTB)values(?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv_ps04107","root", "");
            ps = conn.prepareStatement(sql);
            ps.setString(1, txtMaSV.getText());
            ps.setString(2, txtLop.getText());
            ps.setString(3, txtMonHoc.getText());
            ps.setString(4, txtMaMon.getText());
            ps.setString(5, txtGVHD.getText());
            ps.setDouble(6, Double.parseDouble(txtDiemLT.getText()));
            ps.setDouble(7, Double.parseDouble(txtDiemTH.getText()));
            ps.setDouble(8, Double.parseDouble(txtAss1.getText()));
            ps.setDouble(9, Double.parseDouble(txtAss2.getText()));
            ps.setDouble(10, Double.parseDouble(txtDiemBV.getText()));
            ps.setDouble(11, Double.parseDouble(txtDiemTB.getText()));
            
            //Thuc thi cau lenh insert...
            ps.execute();
            JOptionPane.showMessageDialog(this, "Chen du lieu thanh cong.", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            se.printStackTrace();
            JOptionPane.showMessageDialog(this, "Chen du lieu khong thanh cong.", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int row = tblSinhVien.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this, "Chooser row.", "Message", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String sql = "update bangdiem set DiemLT = ?, DiemTH = ?, Ass1 = ?, Ass2 = ?, DiemBV = ? Where MaSV = ?";
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv_ps04107","root", "");
            ps = conn.prepareStatement(sql);
            ps.setDouble(1, Double.parseDouble(txtDiemLT.getText()));
            ps.setDouble(2, Double.parseDouble(txtDiemTH.getText()));
            ps.setDouble(3, Double.parseDouble(txtAss1.getText()));
            ps.setDouble(4, Double.parseDouble(txtAss2.getText()));
            ps.setDouble(5, Double.parseDouble(txtDiemBV.getText()));
            ps.setString(6, txtMaSV.getText());
            ps.execute();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        //
        modelTableDiem.setValueAt(txtDiemLT.getText().trim(), row, 6);
        modelTableDiem.setValueAt(txtDiemTH.getText().trim(), row, 7);
        modelTableDiem.setValueAt(txtAss1.getText().trim(), row, 8);
        modelTableDiem.setValueAt(txtAss2.getText().trim(), row, 9);
        modelTableDiem.setValueAt(txtDiemBV.getText().trim(), row, 10);
        list.replaceAll((UnaryOperator<MarkStudent>) ms);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        // TODO add your handling code here:
        int row = tblSinhVien.getSelectedRow();
        if(row<0){
            return;
        }
        txtMaSV.setText(tblSinhVien.getValueAt(row, 0).toString());
        txtTen.setText(tblSinhVien.getValueAt(row, 1).toString());
        txtLop.setText(tblSinhVien.getValueAt(row, 2).toString());
        txtMonHoc.setText(tblSinhVien.getValueAt(row, 3).toString());
        txtMaMon.setText(tblSinhVien.getValueAt(row, 4).toString());
        txtGVHD.setText(tblSinhVien.getValueAt(row, 5).toString());
        txtDiemLT.setText(tblSinhVien.getValueAt(row, 6).toString());
        txtDiemTH.setText(tblSinhVien.getValueAt(row, 7).toString());
        txtAss1.setText(tblSinhVien.getValueAt(row, 8).toString());
        txtAss2.setText(tblSinhVien.getValueAt(row, 9).toString());
        txtDiemBV.setText(tblSinhVien.getValueAt(row, 10).toString());
        txtSource.setText(tblSinhVien.getValueAt(row, 11).toString());
        lblAvatar.setIcon(new ImageIcon(txtSource.getText()));
        
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowserActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Ban khong co chuc nang cho user nay!");
    }//GEN-LAST:event_btnBrowserActionPerformed

    private void txtDiemBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemBVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemBVActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        CurrentIndex = list.size()-1;
        DisplayDiem();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        CurrentIndex++;
        if(CurrentIndex > list.size()){
            JOptionPane.showMessageDialog(this, "On the last page!!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        DisplayDiem();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        CurrentIndex--;
        if(CurrentIndex < 0){
            JOptionPane.showMessageDialog(this, "On the first page!!", "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        DisplayDiem();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        CurrentIndex = 0;
        DisplayDiem();
    }//GEN-LAST:event_btnFirstActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QL_DIEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_DIEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_DIEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_DIEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_DIEM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTiemKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtAss1;
    private javax.swing.JTextField txtAss2;
    private javax.swing.JTextField txtDiemBV;
    private javax.swing.JTextField txtDiemLT;
    private javax.swing.JTextField txtDiemTB;
    private javax.swing.JTextField txtDiemTH;
    private javax.swing.JTextField txtGVHD;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtMonHoc;
    private javax.swing.JTextField txtSource;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
