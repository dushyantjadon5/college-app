
package student.faculty.app;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class studAssignments2Query {
    
    
    public boolean insertDoc(studAssignments stdAss) {
        
        boolean fileSubmitted = true;
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
//        stdpg = new studentPage();
//        ResultSet rs;
        
        try {
            ps = con.prepareStatement("INSERT INTO `studassgmtquery`(`Id`, `assgmtFile`, `studQuery`, `userId`)");
            
            
            ps.setBytes(1, stdAss.getDocfile());
            ps.setString(2, stdAss.getStudQuery());
            ps.setInt(3, stdAss.getUid());
            
            if(ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Submit Successfully!!");
                    fileSubmitted = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                    fileSubmitted = false;
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(studAssignments2Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fileSubmitted;
    }
    
    public ArrayList<studAssignments> studList() {
        
        ArrayList<studAssignments> sList = new ArrayList<studAssignments>();
        
        Connection con = myConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `Id`, `assgmtFile`, `studQuery` FROM `studassgmtquery` ");
            
            studAssignments stdAss;
            
            
            while(rs.next()) {
                stdAss = new studAssignments(rs.getInt("Id"), rs.getBytes("assgmtFile"), rs.getString("studQuery"), 0);
                
                sList.add(stdAss);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(studAssignments2Query.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return sList;
    }
}
