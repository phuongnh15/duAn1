package Model;

public class Model_SanPham {
    private String maSP;
    private String tenSP;
    private int soLuongTonKho;
    private double gia;
    private String cpu;
    private String gpu;
    private String ram;
    private String mauSac;
    private String dungLuong;
    private String hinhAnh; 
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

   
    public Model_SanPham() {}

  
    public Model_SanPham(String maSP, String tenSP, int soLuongTonKho, double gia, 
                         String cpu, String gpu, String ram, String mauSac, 
                         String dungLuong, String hinhAnh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuongTonKho = soLuongTonKho;
        this.gia = gia;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.mauSac = mauSac;
        this.dungLuong = dungLuong;
        this.hinhAnh = hinhAnh;
    }

  
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Model_SanPham(String maSP, String tenSP, int id) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.id = id;
    }
    

    // Phương thức toString để hiển thị thông tin sản phẩm
    @Override
    public String toString() {
        return "Model_SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", soLuongTonKho=" + soLuongTonKho +
                ", gia=" + gia +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram='" + ram + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", dungLuong='" + dungLuong + '\'' +
                ", hinhAnh='" + hinhAnh + '\'' +
                '}';
    }
    public Object toDataSP(){
        return new Object[]{id,maSP,tenSP};
    }
    public Object toData_CTSP(){
        return new Object[]{maSP,soLuongTonKho,gia,cpu,gpu,ram,mauSac,dungLuong};
    }
}
