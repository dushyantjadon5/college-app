
package student.faculty.app;


public class studAssignments {
    
    private Integer studId;
    private byte[] docfile;
    private String studQuery;
    private int uid;

    public studAssignments() {
    }

    

      
    
    public studAssignments(Integer studId, byte[] docfile, String studQuery, int uid) {
        this.studId = studId;
        this.docfile = docfile;
        this.studQuery = studQuery;
        this.uid = uid;
    }

    


    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }
    
    public byte[] getDocfile() {
        return docfile;
    }

    public void setDocfile(byte[] docfile) {
        this.docfile = docfile;
    }

    public String getStudQuery() {
        return studQuery;
    }

    public void setStudQuery(String studQuery) {
        this.studQuery = studQuery;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
}
