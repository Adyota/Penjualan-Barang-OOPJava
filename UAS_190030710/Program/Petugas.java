import java.util.ArrayList;
import java.util.Scanner;

public class Petugas extends Pengguna{
    private String Uname, Pass;
    private boolean isLogin;
    public ArrayList <Petugas> dataPetugas =  new ArrayList<>();
    
    
    public Petugas( String Nama, String Tlp, String Alamat,String email, String Uname, String Pass){
        super(Nama, Tlp, Alamat, email);
        this.Uname = Uname;
        this.Pass = Pass;
        this.isLogin = false;
    }
    public Petugas(){}
    public ArrayList<Petugas> getPetugas(){
        return this.dataPetugas;
    }

    public void setUname(String Uname){
        this.Uname = Uname;
    }
    public void setPass(String Pass){
        this.Pass = Pass;
    }
    public String getUname (){
        return this.Uname;
    }
    
    public boolean Login(String Uname, String Pass){
        if(this.Uname.equals(Uname) && this.Pass.equals(Pass)){
            this.isLogin = true;
        }
        else{
            this.isLogin = false;
        }
        return this.isLogin;
    }
    public ArrayList<Petugas> initPetugas(){
        Petugas tempPetugas = new Petugas();
        tempPetugas.setNama("Ida Ayu Gde Widyasti Indah Pramayoni");
        tempPetugas.setTlp("085739565550");
        tempPetugas.setAlamat("Jalan Tunggul Ametung V No.11");
        tempPetugas.setemail("indahpramayoni23@gmail.com");
        tempPetugas.setUname("Admin");
        tempPetugas.setPass("Admin");
        dataPetugas.add(tempPetugas);
        

        return dataPetugas;
    }
    public void TampilPetugas(){
        System.out.println("*****************************************************************************");
        System.out.println("                              DATA PETUGAS                                   ");
        System.out.println("*****************************************************************************");
    for(int i = 0 ; i < dataPetugas.size() ; i++){
        Petugas tempPetugas = dataPetugas.get(i);
        System.out.println("Id Petugas      = " + tempPetugas.getId());
        System.out.println("Nama Petugas    = " + tempPetugas.getNama());
        System.out.println("No. Hp          = " + tempPetugas.getTlp());
        System.out.println("Alamat          = " + tempPetugas.getAlamat());
        System.out.println("Email           = " + tempPetugas.getemail());
        System.out.println("*****************************************************************************");
    }
}

}
