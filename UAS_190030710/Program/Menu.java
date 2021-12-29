import java.util.Scanner;

public class Menu {
    public static Pelanggan pelanggan = new Pelanggan();
    public static Barang barang = new Barang();
    private Petugas petugas = new Petugas();
    private Penjualan penjualan = new Penjualan();
    private Petugas petugasAktif;
    Scanner input = new Scanner(System.in);
    
    public void mainMenu(){
        
        pelanggan.initPelanggan();
        barang.initBarang();
        int pilihan;
        if(petugasAktif == null){
           login();
        } 
            do{
                System.out.println("***********************************************");
                System.out.println("                      MENU                     ");
                System.out.println("***********************************************");
                System.out.println(" 1.  Tampil Data Barang                        ");
                System.out.println(" 2.  Tampil Data Pelanggan                     ");
                System.out.println(" 3.  Tampil Data Petugas                       ");
                System.out.println(" 4.  Penjualan                                 ");
                System.out.println(" 0.  Keluar                                    ");
                System.out.println("***********************************************");
                System.out.print("\nSilakan masukan pilihan anda (0...4) : ");
                pilihan = input.nextInt();
                input.nextLine();
                switch(pilihan){
                    case 1:
                        barang.TampilBarang();
                        break;
                    case 2:
                        pelanggan.TampilPelanggan();
                        break;
                    case 3:
                        petugas.TampilPetugas();
                        break;
                    case 4:
                        penjualan.menuPenjualan();
                        break;
                    case 0:
                        System.out.println("***********************************************");
                        System.out.println("              KELUAR DARI PROGRAM              ");
                        System.out.println("***********************************************");
                        break;
                    default:
                        System.out.println("Pilihan yang anda input tidak tersedia, silakan ulangi kembali.");
                        input.nextLine();
                }
            } while (pilihan != 0); 
              
        }
        private void login(){
            petugas.initPetugas();
            String username, password;
            boolean loginSukses = false;
            while (loginSukses != true){
                System.out.println("**************************************************************");
                System.out.println("          SELAMAT DATANG SISTEM INFORMASI PENJUALAN           ");
                System.out.println("**************************************************************"); 
                System.out.print("Username: ");
                username = input.nextLine();
                System.out.print("Password: ");
                password = input.nextLine();
                for(Petugas tempPetugas: petugas.getPetugas()){
                    if(tempPetugas.Login(username, password) == true){
                        petugasAktif = tempPetugas;
                        penjualan = new Penjualan (petugasAktif);
                        loginSukses = true;
                    }
                }
                if(loginSukses == false){
                    System.out.println("***********************************************");
                    System.out.println("      LOGIN GAGAL, SILAKAN ULANGI KEMBALI      ");
                    System.out.println("***********************************************");
                } else {
                    System.out.println("***********************************************");
                    System.out.println("Selamat datang : " + petugasAktif.getNama());
                    System.out.println("***********************************************");
                }
                input.nextLine();
            }       
        }
}
