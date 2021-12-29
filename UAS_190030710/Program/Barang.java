import java.util.ArrayList;
import java.util.Scanner;

public class Barang {
    public String id_barang;
    public String Kategori;
    public String nama_brg;
    public int Harga;
    public int Stok;
    public ArrayList <Barang> dataBarang = new ArrayList<>();

    public Barang (String id_barang,String Kategori, String nama_brg, int Harga, int Stok){
        this.id_barang = id_barang;
        this.nama_brg = nama_brg;
        this.Kategori = Kategori;
        this.Harga = Harga;
        this.Stok = Stok;
    }
    public Barang(){}

    public void setId(String id_barang){
        this.id_barang = id_barang;
    }
    public void setnamaBrg(String nama_brg){
        this.nama_brg = nama_brg;
    }
    public void setHarga(int Harga){
        this.Harga = Harga;
    }
    public void setStok(int Stok)
    {
        this.Stok = Stok;
    }
    public String getId(){
        return this.id_barang;
    }
    public String getnamaBrg(){
        return this.nama_brg;
    }
    public int getHarga(){
        return this.Harga;
    }
    public int getStok(){
        return this.Stok;
    }
    public void setKategori(String Kategori){
        this.Kategori = Kategori;
    }
    public String getKategori(){
        return this.Kategori;
    }
    public ArrayList<Barang> getBarang(){
        return this.dataBarang;
    }
    public boolean beli(int Jumlah){
        if((this.Stok-Jumlah)>=0){
            this.Stok -= Jumlah;
            return true;
        }
        else{
            System.out.println("Stok Barang Hanya  " + this.getStok());
            return false;
        }
    }
    public ArrayList<Barang> initBarang(){
        Barang tempBarang = new Barang();
        tempBarang.setId("A01");
        tempBarang.setnamaBrg("BMX");
        tempBarang.setKategori("Sepeda");
        tempBarang.setHarga(500000);
        tempBarang.setStok(5);
        dataBarang.add(tempBarang);

        tempBarang = new Barang();
        tempBarang.setId("A02");
        tempBarang.setnamaBrg("Onthel");
        tempBarang.setKategori("Sepeda");
        tempBarang.setHarga(150000);
        tempBarang.setStok(10);
        dataBarang.add(tempBarang);

        tempBarang = new Barang();
        tempBarang.setId("A03");
        tempBarang.setnamaBrg("LG 24MP88");
        tempBarang.setKategori("Elektronik");
        tempBarang.setHarga(1900000);
        tempBarang.setStok(30);
        dataBarang.add(tempBarang);

        tempBarang = new Barang();
        tempBarang.setId("A04");
        tempBarang.setnamaBrg("Steelseries Arctis 3");
        tempBarang.setKategori("Elektronik");
        tempBarang.setHarga(900000);
        tempBarang.setStok(50);
        dataBarang.add(tempBarang);

        return dataBarang;
    }
    public void TampilBarang(){
        System.out.println("****************************************************************************");
        System.out.println("                               DATA BARANG                                  ");
        System.out.println("****************************************************************************");
        for (int i = 0 ; i < dataBarang.size() ; i++){
        Barang tempBarang = dataBarang.get(i);
        System.out.println("                                 " + (i+1) + "                              ");
        System.out.println("****************************************************************************");
        System.out.println("Id Barang       = " + tempBarang.getId());
        System.out.println("Nama Barang     = " + tempBarang.getnamaBrg());
        System.out.println("Kategori        = " + tempBarang.getKategori());
        System.out.println("Harga Barang    = Rp " + tempBarang.getHarga());
        System.out.println("Stok            = " + tempBarang.getStok());
        System.out.println("****************************************************************************");
        }
    }
    public int PilihBarang(){
        String tempidBarang = "";
        int barangDipilih = -1;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("************************************************************************");
            System.out.println("                               DATA BARANG                              ");
            System.out.println("************************************************************************");
            for (int i = 0 ; i < dataBarang.size() ; i++){
            Barang tempBarang = dataBarang.get(i);
            System.out.println("                                 " + (i+1) + "                          ");
            System.out.println("************************************************************************");
            System.out.println("Id Barang       = " + tempBarang.getId());
            System.out.println("Nama Barang     = " + tempBarang.getnamaBrg());
            System.out.println("Kategori        = " + tempBarang.getKategori());
            System.out.println("Harga Barang    = Rp " + tempBarang.getHarga());
            System.out.println("Stok            = " + tempBarang.getStok());
            System.out.println("************************************************************************");
            }
        System.out.print("Silahkan Ketik Id Barang Pilihan : ");
            tempidBarang = input.nextLine();
            for(int i=0 ; i < dataBarang.size(); i++){
                if(dataBarang.get(i).getId().equals(tempidBarang)){
                    barangDipilih = i;
                    break;
                }
            }
    }  while(barangDipilih == -1);

        return barangDipilih;
    }
    public Barang getBarang(int index){
        Barang barang = null;
        if (index >= 0 && index < dataBarang.size()){
            barang = dataBarang.get(index);
        }
        return barang;
    }
}
