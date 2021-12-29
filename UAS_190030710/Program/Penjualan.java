import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class Penjualan{
     private String id_Penjualan;
     private Pelanggan pembeli;
     private Petugas petugasAktif;
     private Barang barang;
     private LocalDateTime tanggalPenjualan;
     private int qty = 0;
     private int total = 0;

    
     public Penjualan(){
        this.id_Penjualan = UUID.randomUUID().toString();
     }
     public Penjualan(Petugas petugas){
        this.petugasAktif = petugas;
     }
     public Penjualan(Pelanggan pembeli, Petugas petugasAktif, Barang barang,int qty, int total){
        this.id_Penjualan = UUID.randomUUID().toString();
        this.tanggalPenjualan = LocalDateTime.now();
        this.pembeli = pembeli;
        this.petugasAktif = petugasAktif;
        this.barang = barang;
        this.qty = qty;
        this.total = total;
     }
     public void setqty(int qty){
        this.qty = qty;
    }
    public int getqty(){
        return this.qty;
    }
    public void settotal(int total){
        this.total = total;
    }
    public int gettotal(){
        return this.total;
    }

     public String getIdPenjualan(){
         return this.id_Penjualan;
     }
     public Pelanggan getPembeli(){
         return pembeli;
     }
     public void setPembeli(Pelanggan pembeli){
         this.pembeli = pembeli;
     }
     public Petugas getPetugasAktif(){
         return petugasAktif;
     }
     public void setPetugasAktif(Petugas petugasAktif){
         this.petugasAktif = petugasAktif;
     }
     public void settanggalpenjualan(){
         this.tanggalPenjualan = LocalDateTime.now();
     }
     public LocalDateTime gettanggalpenjualan(){
         return tanggalPenjualan;
     }
     public Barang getBarang(){
        return barang;
    }
    public void setBarang(Barang barang){
        this.barang = barang;
    }
     
     public ArrayList <Penjualan> dataPenjualan = new ArrayList<>();
     public ArrayList<Penjualan> getPenjualan(){
         return this.dataPenjualan;
     }
     Scanner input = new Scanner(System.in);
     public void InputPenjualan(){
        int indexPembeli = Menu.pelanggan.PilihPelanggan();
        Pelanggan pembeli = Menu.pelanggan.getPelanggan(indexPembeli);
        int indexBarang = Menu.barang.PilihBarang();
        Barang barangPilih = Menu.barang.getBarang(indexBarang);
        System.out.print("Ingin Membeli Berapa Barang : ");
        int jumlah = input.nextInt();
        if (barangPilih.beli(jumlah) == true){
            
            total = barangPilih.Harga*jumlah;
            Penjualan penjualanBaru = new Penjualan(pembeli, petugasAktif, barangPilih, jumlah, total);
            dataPenjualan.add(penjualanBaru); 
        }
        
        
        }
        public void displayPenjualan(){
            DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
            System.out.println("***********************************************");
            System.out.println("                DATA PENJUALAN                 ");
            System.out.println("***********************************************");
        for(Penjualan tempPenjualan : dataPenjualan){
            System.out.println("Id Penjualan          = " + tempPenjualan.getIdPenjualan());
            System.out.println("Tanggal Penjualan     = " + tempPenjualan.gettanggalpenjualan().format(format));
            System.out.println("Kategori              = " + tempPenjualan.getBarang().getKategori());
            System.out.println("Nama Barang           = " + tempPenjualan.getBarang().getnamaBrg());
            System.out.println("Pembeli               = " + tempPenjualan.getPembeli().getNama());
            System.out.println("Petugas               = " + tempPenjualan.getPetugasAktif().getNama());
            System.out.println("Jumlah Beli           = " + tempPenjualan.getqty());
            System.out.println("Total                 = Rp " + tempPenjualan.gettotal());
            System.out.println("***********************************************");
        }
     }
     public void menuPenjualan(){
        int pilihan;
        do{
            System.out.println("***********************************************");
            System.out.println("                   PENJUALAN                   ");
            System.out.println("***********************************************");
            System.out.println(" 1.     Input Penjualan                        ");
            System.out.println(" 2.     Tampil Penjualan                       ");
            System.out.println(" 0.     Kembali ke Sebelumnya                  ");
            System.out.println("***********************************************");
            System.out.print("\nSilakan masukan pilihan anda (0...2) : ");
            pilihan = input.nextInt();
            input.nextLine();
            switch(pilihan){
                case 1:
                    this.InputPenjualan();
                    break;
                case 2:
                    this.displayPenjualan();
                    break;
                case 0:
                    System.out.println("***********************************************");
                    System.out.println("             KEMBALI KE MENU UTAMA             ");
                    System.out.println("***********************************************");
                    break;
                default:
                    System.out.println("Pilihan yang anda input tidak tersedia, silakan ulangi kembali.");
                    input.nextLine();
            }
        } while (pilihan != 0);       
    }
}


