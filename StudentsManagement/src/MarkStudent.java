

/**
 *
 * @author HauLC
 */
public class MarkStudent {
    private String MaSV, TenSV, Lop, Subject, SubID, GV, HinhAnh;
    private double DiemLT, DiemTH, Assignment1, Assignment2, DiemBV;
    
    public MarkStudent() {
        
    }

    public MarkStudent(String MaSV, String TenSV, String Lop, String Subject, String SubID, String GV, double DiemLT, double DiemTH, double Assignment1, double Assignment2, double DiemBV, String HinhAnh) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.Lop = Lop;
        this.Subject = Subject;
        this.SubID = SubID;
        this.GV = GV;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
        this.Assignment1 = Assignment1;
        this.Assignment2 = Assignment2;
        this.DiemBV = DiemBV;
        this.HinhAnh = HinhAnh;
    }
   
    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public double getDiemBV() {
        return DiemBV;
    }

    public void setDiemBV(double DiemBV) {
        this.DiemBV = DiemBV;
    }
    
    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getSubID() {
        return SubID;
    }

    public void setSubID(String SubID) {
        this.SubID = SubID;
    }

    public String getGV() {
        return GV;
    }

    public void setGV(String GV) {
        this.GV = GV;
    }

    public double getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(double DiemLT) {
        this.DiemLT = DiemLT;
    }

    public double getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(double DiemTH) {
        this.DiemTH = DiemTH;
    }

    public double getAssignment1() {
        return Assignment1;
    }

    public void setAssignment1(double Assignment1) {
        this.Assignment1 = Assignment1;
    }

    public double getAssignment2() {
        return Assignment2;
    }

    public void setAssignment2(double Assignment2) {
        this.Assignment2 = Assignment2;
    }

}
