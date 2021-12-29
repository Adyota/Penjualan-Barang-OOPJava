import java.util.UUID;

public class Pengguna {
    public String id;
    public String Nama;
    public String Tlp;
    public String Alamat;
    public String email;

    public Pengguna(String Nama, String Tlp, String Alamat,String email){
        this.id = UUID.randomUUID().toString();
        this.Nama = Nama;
        this.Tlp = Tlp;
        this.Alamat = Alamat;
        this.email = email;
    }
    public Pengguna(){
        this.id = UUID.randomUUID().toString();
    }
    public void setId(String id){
        this.id = id;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setTlp(String Tlp){
        this.Tlp = Tlp;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public void setemail(String email){
        this.email = email;
    }
    public String getId(){
        return this.id;
    }
    public String getNama(){
        return this.Nama;
    }
    public String getTlp(){
        return this.Tlp;
    }
    public String getAlamat(){
        return this.Alamat;
    }
    public String getemail(){
        return this.email;
    }
}
