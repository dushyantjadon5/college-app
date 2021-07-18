
package student.faculty.app;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;




public class myFunc {
    public ImageIcon resizePic(String picPath, byte[] BLOBpic, int wdth, int hgt) {
        
        ImageIcon myImg;
        if(picPath != null) {
            myImg = new ImageIcon(picPath);
        } else {
            myImg = new ImageIcon(BLOBpic);
        }
        
        
        Image img = myImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(img);
        
        return myPicture;
    }
    
    public String browseImage(JLabel lbl) {
        
        String path = "";
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("*.Images", "jpg", "png", "jpeg");
        filec.addChoosableFileFilter(fileFilter);
        
        int fileState = filec.showSaveDialog(null);
        
        if(fileState == JFileChooser.APPROVE_OPTION) {
            
            File selectedFile = filec.getSelectedFile();
            path = selectedFile.getAbsolutePath();
         //   imagePth = path; 
            
            lbl.setIcon(resizePic(path, null, lbl.getWidth(), lbl.getHeight()));
            
        } else if(fileState == JFileChooser.CANCEL_OPTION) {
            
            System.out.println("No Image Selected");
        }
        return path;
    }
}


