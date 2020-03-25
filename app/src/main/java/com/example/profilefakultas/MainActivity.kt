package com.example.profilefakultas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createFakData()
        rv_part.layoutManager = LinearLayoutManager(this)
        rv_part.setHasFixedSize(true)
        rv_part.adapter = FakAdapter(testData, { fakItem: FakData -> fakItemClicked(fakItem)})
    }

    private fun fakItemClicked(fakItem: FakData) {
        val showDetailActivityIntent = Intent(this, FakDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakItem.namaFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, fakItem.descFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_REFERRER, fakItem.fotoFak.toString())
        startActivity(showDetailActivityIntent)
    }

    private fun createFakData() : List<FakData> {
        val partList = ArrayList<FakData>()
        partList.add(
            FakData(
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" + "\t1. Prodi S1 Teknik Informatika\n" + "\t2. Prodi S1 Sistem Informasi",
                R.drawable.upn,
                "http://fik.upnjatim.ac.id/",
                ""
            )
        )
        partList.add(
            FakData(
                "Fakultas Teknik",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" + "\t1. Prodi S1 Teknik Kimia\n" + "\t2. Prodi S1 Teknik Industri\n" + "\t3. Prodi S1 Teknik Sipil\n" + "\t4. Prodi S1 Teknik Lingkungan\n" + "\t5. Prodi S1 Teknologi Pangan",
                R.drawable.upn,
                "http://ft.upnjatim.ac.id/",
                ""
            )
        )
        partList.add(
            FakData(
                "Fakultas Ekonomi Dan Bisnis",
                "Fakultas Ekonomi Dan Bisnis merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" + " \t1. Prodi S1 Ekonomi Pembangunan\n" + "\t2. Prodi S1 Akuntansi\n" + "\t3. Prodi S1 Manajemen",
                R.drawable.upn,
                "http://febis.upnjatim.ac.id/",
                "feb@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Pertanian",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" + "\t1. Prodi S1 Agroteknologi\n" + "\t2. Prodi S1 Agribisnis",
                R.drawable.upn,
                "http://fik.upnjatim.ac.id/",
                ""
            )
        )
        partList.add(
            FakData(
                "Fakultas Arsitektur Dan Desain",
                "Fakultas Arsitektur Dan Desain merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" + "\t1. Prodi S1 Arsitektur\n" + "\t2. Prodi S1 Desain Komunikasi Visual",
                R.drawable.upn,
                "http://fad.upnjatim.ac.id/",
                "fad@upnjatim.ac.id"
            )
        )
        partList.add(
            FakData(
                "Fakultas Ilmu Sosial Dan Ilmu Politik",
                "Fakultas Ilmu Sosial Dan Ilmu Politik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" + "\t1. Prodi S1 Ilmu Komunikasi\n" + "\t2. Prodi S1 Ilmu Administrasi Negara\n" + "\t3. Prodi S1 Ilmu Administrasi Bisnis\n" + "\t4. Prodi S1 Hubungan Internasional",
                R.drawable.upn,
                "http://fisip.upnjatim.ac.id/",
                ""
            )
        )
        partList.add(
            FakData(
                "Fakultas Hukum",
                "Fakultas Hukum merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang teridiri dari program studi:\n\n" + "\t1. Prodi S1 Ilmu Hukum",
                R.drawable.upn,
                "http://fhukum.upnjatim.ac.id/",
                ""
            )
        )
        partList.add(
            FakData(
                "Fachrurrozy N",
                "Surabaya, 18 Oktober 1999" +
                        "\n" + "Jl. Prapen Indah Blok F/20" +
                        "\n" + "+62 857-4595-8007" +
                        "\n" + "SDI Al-Azhar Kelapa Gading Surabaya" +
                        "\n" + "SMPN 35 Surabaya" +
                        "\n" + "SMAN 14 Surabaya\n",
                R.drawable.profil,
                "https://github.com/ozzyfnq/",
                "fachrurrozyn@gmail.com"
            )
        )
        return partList
    }
}