import java.util.ArrayList;
import java.util.Scanner;

public class Pelanggan extends Pengguna{
    public ArrayList <Pelanggan> dataPelanggan = new ArrayList<>();
    
    public Pelanggan(String Nama, String Tlp, String Alamat,String email){
        super( Nama, Tlp, Alamat, email);
    }
    public Pelanggan(){}
    public ArrayList<Pelanggan> initPelanggan(){
        Pelanggan tempPelanggan = new Pelanggan();
        tempPelanggan.setNama("Putu Hitapriya Adyota");
        tempPelanggan.setTlp("081237837512");
        tempPelanggan.setAlamat("Jalan Subak Dalem Gang XVII No.6B");
        tempPelanggan.setemail("putuhitapriyaadyota@gmail.com");
        dataPelanggan.add(tempPelanggan);

        tempPelanggan = new Pelanggan();
        tempPelanggan.setNama("I Nyoman Partadi");
        tempPelanggan.setTlp("08123980177");
        tempPelanggan.setAlamat("Jalan Subak Dalem Gang XVII No.6B");
        tempPelanggan.setemail("buncitpartadi@yahoo.co.id");
        dataPelanggan.add(tempPelanggan);

        tempPelanggan = new Pelanggan();
        tempPelanggan.setNama("Ni Ketut Dewi Suarmini");
        tempPelanggan.setTlp("08123695264");
        tempPelanggan.setAlamat("Jalan Subak Dalem Gang XVII No.6B");
        tempPelanggan.setemail("dewisuarmini68@gmail.com");
        dataPelanggan.add(tempPelanggan);

        return dataPelanggan;
    }
    
    public void TampilPelanggan(){
            System.out.println("*****************************************************************************");
            System.out.println("                              DATA PELANGGAN                                 ");
            System.out.println("*****************************************************************************");
        for (int i = 0 ; i < dataPelanggan.size() ; i++){
            Pelanggan tempPelanggan = dataPelanggan.get(i);
            System.out.println("                                   " + (i+1) + "                             ");
            System.out.println("*****************************************************************************");
            System.out.println("Id Pelanggan    = " + tempPelanggan.getId());
            System.out.println("Nama Pelanggan  = " + tempPelanggan.getNama());
            System.out.println("No. Hp          = " + tempPelanggan.getTlp());
            System.out.println("Alamat          = " + tempPelanggan.getAlamat());
            System.out.println("Email           = " + tempPelanggan.getemail());
            System.out.println("*****************************************************************************");
            }
}
public int PilihPelanggan(){
    boolean pelangganDipilih = false;
    int indexDipilih = -1;
    int NoUrut;
    Scanner input = new Scanner(System.in);
    do{
        System.out.println("*****************************************************************************");
        System.out.println("                              DATA PELANGGAN                                 ");
        System.out.println("*****************************************************************************");

        for (int i = 0 ; i < dataPelanggan.size() ; i++){
        Pelanggan tempPelanggan = dataPelanggan.get(i);
        System.out.println("                                    " + (i+1) + "                            ");
        System.out.println("*****************************************************************************");
        System.out.println("Id Pelanggan    = " + tempPelanggan.getId());
        System.out.println("Nama Pelanggan  = " + tempPelanggan.getNama());
        System.out.println("No. Hp          = " + tempPelanggan.getTlp());
        System.out.println("Alamat          = " + tempPelanggan.getAlamat());
        System.out.println("Email           = " + tempPelanggan.getemail());
        System.out.println("*****************************************************************************");
        }
        
        System.out.print("Silahkan Pilih No. Pelanggan : ");
        NoUrut = input.nextInt();
        indexDipilih = NoUrut-1;
        if(indexDipilih>=0 && indexDipilih<dataPelanggan.size()){
            pelangganDipilih = true;
        }
    }while(pelangganDipilih != true);
    return indexDipilih;
    }
public Pelanggan getPelanggan(int index){
    Pelanggan pelanggan = null;
    if (index >= 0 && index < dataPelanggan.size()){
        pelanggan = dataPelanggan.get(index);
    }
    return pelanggan;
}
}

