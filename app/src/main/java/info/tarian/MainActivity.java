package info.tarian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoTarian = new ArrayList<>();
    private ArrayList<String> namaTarian = new ArrayList<>();
    private ArrayList<String> infoTarian = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoTarian, namaTarian,infoTarian, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
    }

    private void getDataFromInternet(){

        namaTarian.add("Tari Kecak (Bali)");
        fotoTarian.add("https://blog.elevenia.co.id/wp-content/uploads/2019/05/245-kecak-750x500.jpg");
        infoTarian.add("Tarian daerah ikonik dan sangat  dikenal baik oleh masyarakat luas, lokal maupun manca, adalah tari Kecak dari Pulau Bali. Bali memang dikenal sebagai surganya Dunia yang ada di Indonesia. Selain karena kekayaan alamnya, Bali kaya akan budaya dan nilai agamis nya. Tari kecak merupakan salah satu ragam budaya nya yang paling populer.\n" +
                "\n" +
                "Rasanya belum menikmati Bali jika Anda melewatkan tari Kecak untuk ditonton. Awal mulanya tari Kecak merupakan tari Sang Hyang yang dilakukan pada saat upacara keagamaan. Namun saat ini tarai Kecak dapat Anda nikmati kapanpun karena ditampilkan hampir di berbagai kesempatan.");

        namaTarian.add("Tari Pendet (Bali)");
        fotoTarian.add("https://blog.elevenia.co.id/wp-content/uploads/2019/05/245-pendet-750x500.jpg");
        infoTarian.add("Tari pendet merupakan tarian menyambut tamu sebagai salam selamat datang. Tari daerah ini ditampilkan oleh sejumlah penari perempuan yang membawa mangkuk kecil berisi beragam bunga khas.\n" +
                "\n" +
                "Selain menyambut tamu, tari Pendet umumnya merupakan bagian dari upacara keagamaan di Pura sebagai ungkapan rasa syukur dan penghormatan kepada para Dewata yang turun dari Kayangan.");


        namaTarian.add("Tari Jaipong (Jawa Barat)");
        fotoTarian.add("https://blog.elevenia.co.id/wp-content/uploads/2019/05/245-jaipong-750x467.jpg");
        infoTarian.add("Tari Jaipong merupakan salah satu tarian khas daerah Jawa Barat. Tarian ini pun lebih dikenal di kalangan masyarakat suku Betawi. Yang  membedakan tari Jaipong dengan jenis tari daerah lainnya adalah gerakannya yang sangat dinamis serta atraktif. Menjadi sangat khas karena dipadu dengan gerakan pencak silat, goyang tari ronggeng beserta tari ketuk tilu.\n" +
                "\n" +
                "Tari Jaipong umumnya ditampilkan pada acara-acara tertentu seperti penyambutan tamu, sunatan maupun festival kesenian. Umumnya tari Jaipong akan ditampilkan baik secara individu maupun kelompok oleh mereka perempuan Betawi.");


        namaTarian.add("Tari Remong (Jawa Timur)");
        fotoTarian.add("https://blog.elevenia.co.id/wp-content/uploads/2019/05/245-remong-750x422.jpg");
        infoTarian.add("Remong dari Jawa Timur yang juga biasa disebut sebagai tari Remo. Tari Remong ini merupakan tarian yang menggambarkan perjuangan seorang Pangeran di medan perang. Tari Remong umumnya ditampilkan saat pembukaan pagelaran Ludruk sebagai tari penyambutan tamu. Dahulu tari Remong biasa ditampilkan oleh penari laki-laki, namun di era modern penari perempuan sudah diperbolehkan menarikannya.");

        namaTarian.add("Tari Gambyong (Jawa Tengah)");
        fotoTarian.add("https://blog.elevenia.co.id/wp-content/uploads/2019/05/245-gambyong-750x500.jpg");
        infoTarian.add("Tari Gambyong menghadirkan kelembutan dan keluwesan khas orang Jawa. Tarian ini ditampilkan oleh sekelompok penari wanita dengan begitu anggun dan indah. Tari Gambyong hanya akan banyak ditemui di acara-acara khusus seperti festival kesenian serta kegiatan di Keraton Surakarta.");

        namaTarian.add("Tari Serimpi (Yogyakarta)");
        fotoTarian.add("https://blog.elevenia.co.id/wp-content/uploads/2019/05/245-serimpi-750x498.jpg");
        infoTarian.add("Tari Serimpi dinilai sebagai salah satu tari tradisional yang masih sakral. Dalam pertunjukannya tari Serimpi menggambarkan kesopanan dan kelemahlembutan khas orang Jawa.\n" +
                "\n" +
                "Berbeda dengan tarian daerah lainnya tari Serimpi hanya diperbolehkan ditarikan oleh sejumlah penari yang dipilih oleh keluarga Keraton. Hal ini karena nilai sakralitas yang tertanam pada tari Serimpi.");

        namaTarian.add("Tari Piring (Sumatera Barat)");
        fotoTarian.add("https://blog.elevenia.co.id/wp-content/uploads/2019/05/245-piring-1-750x503.jpeg");
        infoTarian.add("Yang menjadi khas dalam pertunjukan tarian daerah ini adalah piring kecil yang dibawa oleh sejumlah penarinya. Penari akan mengayunkan piring di tangan dengan gerakan cepat namun tetap teratur.");

        prosesRecyclerViewAdapter();




    }
}
