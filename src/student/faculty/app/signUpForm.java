/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.faculty.app;


import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Gulab Rai
 */
public class signUpForm extends javax.swing.JFrame {

    /**
     * Creates new form signUpForm
     */
    String imagePth = null;
    
    public signUpForm() {
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

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        signUpStudClose = new javax.swing.JLabel();
        minimizeSignUp1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        collIdStud = new javax.swing.JTextField();
        studFullName = new javax.swing.JTextField();
        studCollRollNo = new javax.swing.JTextField();
        studBranch = new javax.swing.JTextField();
        studSemester = new javax.swing.JTextField();
        courseStud = new javax.swing.JComboBox<>();
        studUsername = new javax.swing.JTextField();
        studPassword1 = new javax.swing.JPasswordField();
        studRegister = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        loginPage = new javax.swing.JLabel();
        studPassword2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        studPicture = new javax.swing.JLabel();
        studPicBrowse = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(46, 190, 113));
        jPanel1.setMinimumSize(new java.awt.Dimension(964, 47));

        signUpStudClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signUpStudClose.setForeground(new java.awt.Color(255, 255, 255));
        signUpStudClose.setText("X");
        signUpStudClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpStudClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpStudCloseMouseClicked(evt);
            }
        });

        minimizeSignUp1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        minimizeSignUp1.setForeground(new java.awt.Color(255, 255, 255));
        minimizeSignUp1.setText("-");
        minimizeSignUp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeSignUp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeSignUp1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Registration - Student");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeSignUp1)
                .addGap(18, 18, 18)
                .addComponent(signUpStudClose)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(signUpStudClose)
                        .addComponent(minimizeSignUp1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("College ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Full Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("College Roll no.:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Course:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Branch:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Semester:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setText("Username:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setText("Re-Type Password:");

        collIdStud.setBackground(new java.awt.Color(0, 102, 102));
        collIdStud.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        collIdStud.setForeground(new java.awt.Color(255, 255, 255));

        studFullName.setBackground(new java.awt.Color(0, 102, 102));
        studFullName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        studFullName.setForeground(new java.awt.Color(255, 255, 255));

        studCollRollNo.setBackground(new java.awt.Color(0, 102, 102));
        studCollRollNo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        studCollRollNo.setForeground(new java.awt.Color(255, 255, 255));

        studBranch.setBackground(new java.awt.Color(0, 102, 102));
        studBranch.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        studBranch.setForeground(new java.awt.Color(255, 255, 255));

        studSemester.setBackground(new java.awt.Color(0, 102, 102));
        studSemester.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        studSemester.setForeground(new java.awt.Color(255, 255, 255));

        courseStud.setBackground(new java.awt.Color(204, 204, 255));
        courseStud.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        courseStud.setForeground(new java.awt.Color(51, 0, 51));
        courseStud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech.", "BCA", "BBA", "M.Tech.", "MCA", "MBA" }));
        courseStud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        courseStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseStudActionPerformed(evt);
            }
        });

        studUsername.setBackground(new java.awt.Color(0, 102, 102));
        studUsername.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        studUsername.setForeground(new java.awt.Color(255, 255, 255));

        studPassword1.setBackground(new java.awt.Color(0, 102, 102));
        studPassword1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        studPassword1.setForeground(new java.awt.Color(255, 255, 255));

        studRegister.setBackground(new java.awt.Color(0, 102, 102));
        studRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studRegister.setForeground(new java.awt.Color(255, 255, 255));
        studRegister.setText("Register");
        studRegister.setBorderPainted(false);
        studRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studRegisterMouseClicked(evt);
            }
        });
        studRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studRegisterActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Already have an account? Click here...");

        loginPage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginPage.setForeground(new java.awt.Color(255, 255, 102));
        loginPage.setText("Login");
        loginPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPageMouseClicked(evt);
            }
        });

        studPassword2.setBackground(new java.awt.Color(0, 102, 102));
        studPassword2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        studPassword2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Picture:");

        studPicture.setBackground(new java.awt.Color(153, 255, 204));
        studPicture.setForeground(new java.awt.Color(204, 255, 204));
        studPicture.setOpaque(true);

        studPicBrowse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studPicBrowse.setText("Browse");
        studPicBrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studPicBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studPicBrowseActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 204));
        jLabel14.setText("(Size should be less than 1MB)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(collIdStud, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(studFullName)
                                        .addComponent(studCollRollNo))
                                    .addComponent(studUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(studBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(courseStud, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(studSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(studPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(studPicBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(studRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginPage)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(collIdStud)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(studFullName)
                                .addComponent(jLabel6)
                                .addComponent(studBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studCollRollNo)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(studSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(studUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(studPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(studPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(studPicBrowse)))
                        .addGap(145, 145, 145)
                        .addComponent(studRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(studPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(loginPage))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpStudCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpStudCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_signUpStudCloseMouseClicked

    private void minimizeSignUp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeSignUp1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeSignUp1MouseClicked

    
    public boolean isUsernameExist(String un) {
        
        boolean uExist = false;
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = con.prepareStatement("SELECT * FROM `studsignup` WHERE `studUsername` = ? ");
            ps.setString(1, studUsername.getText());
            
            
            rs = ps.executeQuery();
            
            if(rs.next()) {
                uExist = true;
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(loginPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uExist;
    }
    
    
    
    
    
    public boolean verifyData1() {
        
        if(collIdStud.getText().equals("") || studFullName.getText().equals("")
                || studCollRollNo.getText().equals("") 
                || studBranch.getText().equals("") || studSemester.getText().equals("")
                || studUsername.getText().equals("")
                || String.valueOf(studPassword1.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(null, "One or More Field are empty");
            return false;
        } else if (!String.valueOf(studPassword1.getPassword()).equals(String.valueOf(studPassword2.getPassword()))) {
            
            JOptionPane.showMessageDialog(null, "Incorrect Password!!");
            return false;
        } else if(imagePth == null){
            JOptionPane.showMessageDialog(null, "No Image Selected");
            return false;
        } else {
            return true;
        }
        
        
    }
    
    private void studRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studRegisterActionPerformed
        
        if(verifyData1()) {
            Connection con = myConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
        
            try {
                ps = con.prepareStatement("INSERT INTO `studsignup`(`Id`, `studFname`, `collRollNo`, `studCourse`, "
                        + "`studBranch`, `studSem`, `studUsername`, `studPass`, `studPic`) VALUES (?,?,?,?,?,?,?,?,?)");
           //     rs = ps.executeQuery();
                
               
                ps.setString(1, collIdStud.getText());
                ps.setString(2, studFullName.getText());
                ps.setString(3, studCollRollNo.getText());                
                ps.setString(4, courseStud.getSelectedItem().toString());
                ps.setString(5, studBranch.getText());
                ps.setString(6, studSemester.getText());
                ps.setString(7, studUsername.getText());
                ps.setString(8, String.valueOf(studPassword1.getPassword()));
                
                InputStream img = new FileInputStream(new File(imagePth));
                ps.setBlob(9, img);
                
                
            
                if(isUsernameExist(studUsername.getText())) {
                    JOptionPane.showMessageDialog(null, "Username Already Exists");
                } else {
                    if(ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Account Created");
                        collIdStud.setText("");
                        studFullName.setText("");
                        studCollRollNo.setText("");
                        studBranch.setText("");
                        studSemester.setText("");
                        studUsername.setText("");
                        studPassword1.setText("");
                        studPassword2.setText("");
                        studPicture.setIcon(null);
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Something Wrong");
                    }
                }
                
                
            
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Picture size should be less than 1 mb");
            }
        }
        
        
        
    }//GEN-LAST:event_studRegisterActionPerformed

    private void studRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studRegisterMouseClicked
        
        
    }//GEN-LAST:event_studRegisterMouseClicked

     
    
    
    private void loginPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPageMouseClicked
        loginPortal login = new loginPortal();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_loginPageMouseClicked

    
//    public ImageIcon resizePic(String picPath) {
//        
//        ImageIcon myImg = new ImageIcon(picPath);
//        Image img = myImg.getImage().getScaledInstance(studPicture.getWidth(), studPicture.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon myPicture = new ImageIcon(img);
//        
//        return myPicture;
//    }
    
    private void studPicBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studPicBrowseActionPerformed
        
        myFunc mf = new myFunc();
        imagePth = mf.browseImage(studPicture);
        System.out.println(imagePth);
        
    }//GEN-LAST:event_studPicBrowseActionPerformed

    private void courseStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseStudActionPerformed
        
    }//GEN-LAST:event_courseStudActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField collIdStud;
    public javax.swing.JComboBox<String> courseStud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel loginPage;
    private javax.swing.JLabel minimizeSignUp1;
    private javax.swing.JLabel signUpStudClose;
    public javax.swing.JTextField studBranch;
    public javax.swing.JTextField studCollRollNo;
    public javax.swing.JTextField studFullName;
    public javax.swing.JPasswordField studPassword1;
    public javax.swing.JPasswordField studPassword2;
    private javax.swing.JButton studPicBrowse;
    public javax.swing.JLabel studPicture;
    public javax.swing.JButton studRegister;
    public javax.swing.JTextField studSemester;
    public javax.swing.JTextField studUsername;
    // End of variables declaration//GEN-END:variables
}
