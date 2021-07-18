package student.faculty.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gulab Rai
 */
public class studentPage extends javax.swing.JFrame {

    /**
     * Creates new form studentPage
     */
    String docAss = null;
    public studentPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitStudPage = new javax.swing.JLabel();
        minStudPage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studProfilePic = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        studProfileName = new javax.swing.JLabel();
        studProfileCollId = new javax.swing.JLabel();
        studProfileRollNo = new javax.swing.JLabel();
        studProfileCourse = new javax.swing.JLabel();
        studProfileBranch = new javax.swing.JLabel();
        studPageSem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        studGetResult = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        noticeVal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noticeTextPane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(46, 190, 113));

        exitStudPage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitStudPage.setForeground(new java.awt.Color(255, 255, 255));
        exitStudPage.setText("X");
        exitStudPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitStudPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitStudPageMouseClicked(evt);
            }
        });

        minStudPage.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        minStudPage.setForeground(new java.awt.Color(255, 255, 255));
        minStudPage.setText("-");
        minStudPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minStudPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minStudPageMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Portal");

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LOG OUT");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(200, 200, 200)
                .addComponent(minStudPage)
                .addGap(18, 18, 18)
                .addComponent(exitStudPage)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minStudPage)
                        .addComponent(exitStudPage)
                        .addComponent(jLabel3)))
                .addGap(1, 1, 1))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(243, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("College ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Course:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Roll no.:");

        studProfilePic.setBackground(new java.awt.Color(255, 204, 255));
        studProfilePic.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Branch:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Semester:");

        studProfileName.setBackground(new java.awt.Color(153, 255, 204));
        studProfileName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        studProfileName.setForeground(new java.awt.Color(204, 0, 0));
        studProfileName.setText("nm");

        studProfileCollId.setBackground(new java.awt.Color(153, 255, 204));
        studProfileCollId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        studProfileCollId.setForeground(new java.awt.Color(204, 0, 0));
        studProfileCollId.setText("id");

        studProfileRollNo.setBackground(new java.awt.Color(153, 255, 204));
        studProfileRollNo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        studProfileRollNo.setForeground(new java.awt.Color(204, 0, 0));
        studProfileRollNo.setText("rn");

        studProfileCourse.setBackground(new java.awt.Color(153, 255, 204));
        studProfileCourse.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        studProfileCourse.setForeground(new java.awt.Color(204, 0, 0));
        studProfileCourse.setText("cr");

        studProfileBranch.setBackground(new java.awt.Color(153, 255, 204));
        studProfileBranch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        studProfileBranch.setForeground(new java.awt.Color(204, 0, 0));
        studProfileBranch.setText("br");

        studPageSem.setBackground(new java.awt.Color(153, 255, 204));
        studPageSem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        studPageSem.setForeground(new java.awt.Color(204, 0, 0));
        studPageSem.setText("sm");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("EDIT");
        jButton1.setActionCommand("Edit ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton1StateChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        studGetResult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studGetResult.setText("Result");
        studGetResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studGetResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studGetResultActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("(If you want to change");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("any details) Click here");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Show Notice");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        noticeVal.setForeground(new java.awt.Color(153, 255, 204));
        noticeVal.setText("1");

        noticeTextPane.setEditable(false);
        noticeTextPane.setBackground(new java.awt.Color(153, 153, 153));
        noticeTextPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noticeTextPane.setForeground(new java.awt.Color(204, 0, 0));
        noticeTextPane.setDoubleBuffered(true);
        noticeTextPane.setDragEnabled(true);
        noticeTextPane.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(noticeTextPane);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(68, 68, 68)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studProfileName, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(studProfileCollId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studProfileRollNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studProfileCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studProfileBranch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studPageSem, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studGetResult, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(noticeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(studProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studProfileName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(studProfileRollNo))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(studProfileCourse))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(studProfileBranch)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(studProfileCollId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGap(118, 118, 118)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studPageSem)
                            .addComponent(jLabel7)
                            .addComponent(studGetResult))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(noticeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitStudPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitStudPageMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitStudPageMouseClicked

    private void minStudPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minStudPageMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minStudPageMouseClicked

    private void jButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT `Id`, `studFname`, `collRollNo`, `studCourse`, `studBranch`, `studSem`, `studUsername`, `studPass`, `studPic` FROM `studsignup` WHERE `Id` = ? ");
            ps.setString(1, studProfileCollId.getText());
            rs = ps.executeQuery();
            if(rs.next()) {
                
                updateStud upsd = new updateStud();
                upsd.setVisible(true);
                upsd.pack();
                upsd.setLocationRelativeTo(null);
                upsd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                upsd.studCollId.setText(rs.getString(1));
                upsd.studName.setText(rs.getString(2));
                upsd.studRollno.setText(rs.getString(3));
                upsd.jComboBox1.setSelectedItem(4);
                upsd.studBranch.setText(rs.getString(5));
                upsd.studSem.setText(rs.getString(6));
                upsd.usernameUpdate.setText(rs.getString(7));
                upsd.passwordUpdate.setText(rs.getString(8));
               
                upsd.studPic.setIcon(new myFunc().resizePic(null, rs.getBytes(9), upsd.studPic.getWidth(), upsd.studPic.getHeight()));
                
                this.dispose();
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(studentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Connection con = myConnection.getConnection();
//        PreparedStatement ps;
//        ResultSet rs;
//        
//        try {
//            ps = con.prepareStatement("SELECT `Id`, `studFname`, `collRollNo`, `studCourse`, `studBranch`, `studSem`, `studUsername`, `studPass`, `studPic` FROM `studsignup` WHERE `Id` = ? ");
//            ps.setString(1, studProfileCollId.getText());
//            rs = ps.executeQuery();
//            
//            if(rs.next()) {
//                
//                signUpForm supStud = new signUpForm();
//                supStud.setVisible(true);
//                supStud.pack();
//                supStud.setLocationRelativeTo(null);
//                supStud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                supStud.collIdStud.setText(rs.getString(1));
//                supStud.studFullName.setText(rs.getString(2));
//                supStud.studCollRollNo.setText(rs.getString(3));
//                supStud.courseStud.setSelectedItem(4);
//                supStud.studBranch.setText(rs.getString(5));
//                supStud.studSemester.setText(rs.getString(6));
//                supStud.studUsername.setText(rs.getString(7));
//                supStud.studPassword1.setText(rs.getString(8));
//                supStud.studPassword2.setText(rs.getString(8));
//                supStud.studPicture.setIcon(new myFunc().resizePic(null, rs.getBytes(9), supStud.studPicture.getWidth(), supStud.studPicture.getHeight()));
//                
//                this.dispose();
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(studentPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//       
//        
////        signUpForm supStud = new signUpForm();
////        supStud.setVisible(true);
////        supStud.pack();
////        supStud.setLocationRelativeTo(null);
////        supStud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        supStud.collIdStud.setText(rs);
//
////        this.dispose();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    private void studGetResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studGetResultActionPerformed
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT `studSub1`, `studSub1Marks`, `studSub2`, `studSub2Marks`, "
                    + "`studSub3`, `studSub3Marks`, `studSub4`, `studSub4Marks`, `studSub5`, `studSub5Marks`, "
                    + "`studSub6`, `studSub6Marks`, `studCollId` FROM `studsubjects_&_marks` WHERE `studCollId` = ?");
            ps.setString(1, studProfileCollId.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()) {
                
                studResult stdRes = new studResult();
                stdRes.setVisible(true);
                stdRes.pack();
                stdRes.setLocationRelativeTo(null);
                stdRes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                stdRes.studSubR1.setText(rs.getString(1));
                stdRes.studMr1.setText(rs.getString(2));
                stdRes.studSubR2.setText(rs.getString(3));
                stdRes.studMr2.setText(rs.getString(4));
                stdRes.studSubR3.setText(rs.getString(5));
                stdRes.studMr3.setText(rs.getString(6));
                stdRes.studSubR4.setText(rs.getString(7));
                stdRes.studMr4.setText(rs.getString(8));
                stdRes.studSubR5.setText(rs.getString(9));
                stdRes.studMr5.setText(rs.getString(10));
                stdRes.studSubR6.setText(rs.getString(11));
                stdRes.studMr6.setText(rs.getString(12));
                stdRes.studResCollId.setText(rs.getString(13));
            } else {
                JOptionPane.showMessageDialog(null, "Result Awaited");
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(studentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_studGetResultActionPerformed

//    public void notice() {
//        
//        Connection con = myConnection.getConnection();
//        PreparedStatement ps;
//        Statement st;
//        ResultSet rs;
//        
//        try {
//            ps = con.prepareStatement("SELECT `noticeNum`, `noticeText` FROM `commonnotice` WHERE `noticeNum` = ?");
//            ps.setString(1, noticeVal.getText());
//            rs = ps.executeQuery();
//            
//            if(rs.next()) {
//                
//                
//                noticeTextPane.setText(rs.getString(2));
//            } else {
//                JOptionPane.showMessageDialog(null, "Not working");
//            }
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
//        
//    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT `noticeNum`, `noticeText` FROM `commonnotice` WHERE `noticeNum` = ?");
            ps.setString(1, noticeVal.getText());
            rs = ps.executeQuery();
            
            if(rs.next()) {
                
                
                noticeTextPane.setText(rs.getString(2));
            } else {
                JOptionPane.showMessageDialog(null, "Not working");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        loginPortal login = new loginPortal();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitStudPage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel minStudPage;
    private javax.swing.JTextPane noticeTextPane;
    private javax.swing.JLabel noticeVal;
    private javax.swing.JButton studGetResult;
    public javax.swing.JLabel studPageSem;
    public javax.swing.JLabel studProfileBranch;
    public javax.swing.JLabel studProfileCollId;
    public javax.swing.JLabel studProfileCourse;
    public javax.swing.JLabel studProfileName;
    public javax.swing.JLabel studProfilePic;
    public javax.swing.JLabel studProfileRollNo;
    // End of variables declaration//GEN-END:variables
}
