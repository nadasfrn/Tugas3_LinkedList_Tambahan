import java.util.LinkedList;
import java.util.Scanner;

public class linked_list2 {
    public static void main(String[] args) throws Exception {
        
        LinkedList <String> nama = new LinkedList<>();
        LinkedList <String> nim = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String data;
        boolean lanjut = true;
        int pil;
        String y; 

        while(lanjut) {
            System.out.println("\n=============================");
            System.out.println("        Data Mahasiswa      ");
            System.out.println("=============================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. List Data Mahasiswa");
            System.out.println("3. Cek Size Data");
            System.out.println("4. Cek isEmpty() Data Mahasiswa");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Remove Data Array Nama");
            System.out.println("7. Cek isEmpty() Data");
            System.out.println("============================\n");
                
            System.out.print("Inputkan pilihan menu (1-7) -> ");
            pil = input.nextInt();

            switch(pil) {
                case 1:
                System.out.println("\n== TAMBAH DATA MAHASISWA==");               
                System.out.print("\nInputkan Nama Mahasiswa: ");
                data=input.next();
                nama.add(data);
                System.out.print("Inputkan No. BP Mahasiswa: ");
                data=input.next();
                nim.add(data);
                System.out.print("Inputkan Alamat Mahasiswa: ");
                data=input.next();
                alamat.add(data);
                break;

                case 2:
                System.out.println("\n==LIST DATA MAHASISWA==");
                System.out.println("Nama Mahasiswa\t : "+nama);
                System.out.println("No. BP\t\t : "+nim);
                System.out.println("Alamat\t\t : "+alamat);
                break;

                case 3:
                System.out.println("\n==SIZE DATA MAHASISWA==");
                System.out.println("Ukuran data nama mahasiswa : "+nama.size());
                System.out.println("Nama Mahasiswa : "+nama);
                System.out.println("-----------------------------------------");
                System.out.println("Ukuran data no. bp mahasiswa : "+nim.size());
                System.out.println("No. BP : "+nim);
                System.out.println("-----------------------------------------");
                System.out.println("Ukuran data alamat mahasiswa : "+alamat.size());
                System.out.println("Alamat\t\t : "+alamat);
                break;

                case 4:
                System.out.println("\n==CEK IsEMPTY DATA MAHASISWA==");
                System.out.println("Apakah data nama mahasiswa mempunyai isi? = "+nama.isEmpty());
                System.out.println("Apakah data no. bp mahasiswa mempunyai isi? = "+nim.isEmpty());
                System.out.println("Apakah data alamat mahasiswa mempunyai isi? = "+alamat.isEmpty());
                break;

                case 5:
                System.out.println("\n==HAPUS DATA MAHASISWA==");
                System.out.print("Input indeks data mahasiswa yang dihapus (angka) : ");
                data = input.next();
                nama.remove(data);
                nim.remove(data);
                alamat.remove(data);
                System.out.println("\n::List Data Mahasiswa::");
                System.out.println("Nama Mahasiswa\t : "+nama);
                System.out.println("No. BP\t\t : "+nim);
                System.out.println("Alamat\t\t : "+alamat);
                break;

                // case 6:
                // //REMOVE ARRAY
                // System.out.println("\n==REMOVE DATA ARRAY NAMA==");
                // nama.remove(0);
                // System.out.println("Data array pada indeks ke-0 terhapus! \nData array sekarang:" +nama);
                // nama.remove(3);
                // System.out.println("Data array pada indeks ke-3 terhapus! \nData array sekarang:" +nama);
                // nama.remove(2);
                // System.out.println("Data array pada indeks ke-2 terhapus! \nData array sekarang:" +nama);
                // break;

                // case 7:
                // //ADD DATA
                // boolean cek_array = nama.isEmpty();
                // System.out.println("\n==CEK IsEMPTY() ARRAY NAMA==");
                // if(cek_array) {
                //     System.out.println("-> Data pada array nama masih kosong");
                // }
                // else {
                //     System.out.println("-> Data pada array nama sudah terisi");
                //     System.out.println("   Data array nama yang ada: " +nama);
                // }
                // break;

                default:
                System.out.println(">>Maaf, inputan tidak tersedia! Silahkan input angka yang benar (1-7)<<");
            }
            System.out.print("\nApakah Anda ingin melanjutkan [y/n]? -> ");
            y = input.next();
            lanjut = y.equalsIgnoreCase("y");

        }
        System.out.println("\n==<Terima kasih>==\n");
        System.exit(0);
    }
}
