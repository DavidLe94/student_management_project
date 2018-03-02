/**
 *
 * @author Administrator
 */
public class Student {
    private String MaSV, TenSV, NgSinh, ThSinh, NamSinh, Email, SDT, DiaChi, Khoa, ChuyenNganh, CMT, NgCap, NoiCap, NgNhapHoc, HocKi, HinhAnh;
    private String GioiTinh, TrangThai;

    public Student(String MaSV, String TenSV, String NgSinh, String ThSinh, String NamSinh, String Email, String SDT, String DiaChi, String Khoa, String ChuyenNganh, String CMT, String NgCap, String NoiCap, String NgNhapHoc, String HocKi, String HinhAnh, String GioiTinh, String TrangThai) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.NgSinh = NgSinh;
        this.ThSinh = ThSinh;
        this.NamSinh = NamSinh;
        this.Email = Email;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.Khoa = Khoa;
        this.ChuyenNganh = ChuyenNganh;
        this.CMT = CMT;
        this.NgCap = NgCap;
        this.NoiCap = NoiCap;
        this.NgNhapHoc = NgNhapHoc;
        this.HocKi = HocKi;
        this.GioiTinh = GioiTinh;
        this.TrangThai = TrangThai;
        this.HinhAnh = HinhAnh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

   
    
    public Student(){
        
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

    public String getNgSinh() {
        return NgSinh;
    }

    public void setNgSinh(String NgSinh) {
        this.NgSinh = NgSinh;
    }

    public String getThSinh() {
        return ThSinh;
    }

    public void setThSinh(String ThSinh) {
        this.ThSinh = ThSinh;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getNgCap() {
        return NgCap;
    }

    public void setNgCap(String NgCap) {
        this.NgCap = NgCap;
    }

    public String getNgNhapHoc() {
        return NgNhapHoc;
    }

    public void setNgNhapHoc(String NgNhapHoc) {
        this.NgNhapHoc = NgNhapHoc;
    }  

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getNoiCap() {
        return NoiCap;
    }

    public void setNoiCap(String NoiCap) {
        this.NoiCap = NoiCap;
    }

    public String getHocKi() {
        return HocKi;
    }

    public void setHocKi(String HocKi) {
        this.HocKi = HocKi;
    }
    
}
