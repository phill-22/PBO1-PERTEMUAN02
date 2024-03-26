import koneksi.database;
import model.Dosen;
import model.Mahasiswa;
import model.MatakuliaH;

public class latihan {

    public static void main(String[] args) {
        System.out.println("ini main program");
        database.hubungkan();
        Dosen.tampilanInfo();
        Mahasiswa.tampilanInfo();
        MatakuliaH.tampilanInfo();

    }
}