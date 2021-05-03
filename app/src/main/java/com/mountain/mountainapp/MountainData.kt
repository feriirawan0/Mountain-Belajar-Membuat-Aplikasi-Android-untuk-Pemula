package com.mountain.mountainapp

import java.util.ArrayList

object MountainData {
    private val mountainName = arrayOf(
            "Gunung Bromo",
            "Gunung Semeru",
            "Gunung Sumbing",
            "Gunung Merbabu",
            "Gunung Merapi",
            "Gunung Arjuno",
            "Gunung Lamongan",
            "Gunung Anjasmoro",
            "Gunung Ijen",
            "Gunung Gede"
            )

    private val mountainDetail = arrayOf(
            "Gunung Bromo adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.",
            "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat[2]. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.",
            "Gunung Sumbing adalah gunung api yang terdapat di Jawa Tengah, Indonesia. (Ketinggian puncak 3.371 mdpl), gunung Sumbing merupakan gunung tertinggi ketiga di Pulau Jawa setelah Gunung Semeru dan Gunung Slamet. Gunung ini secara administratif terletak di tiga wilayah kabupaten, yaitu Kabupaten Magelang; Kabupaten Temanggung; dan Kabupaten Wonosobo. Bersama dengan Gunung Sindoro, Gunung Sumbing membentuk bentang alam gunung kembar, seperti Gunung Merapi dan Gunung Merbabu, apabila dilihat dari arah Temanggung. Celah antara gunung ini dan Gunung Sindoro dilalui oleh jalan provinsi yang menghubungkan kota Temanggung dan kota Wonosobo. Jalan ini biasa dijuluki sebagai \"Kledung Pass\".",
            "Gunung Merbabu adalah gunung api yang bertipe Strato (lihat Gunung Berapi) yang terletak secara geografis pada 7,5° LS dan 110,4° BT. Secara administratif gunung ini berada di wilayah Kabupaten Magelang di lereng sebelah barat dan Kabupaten Boyolali di lereng sebelah timur dan selatan, Kabupaten Semarang di lereng sebelah utara, Provinsi Jawa Tengah.",
            "Gunung Merapi adalah gunung berapi di bagian tengah Pulau Jawa dan merupakan salah satu gunung api teraktif di Indonesia. Lereng sisi selatan berada dalam administrasi Kabupaten Sleman, Daerah Istimewa Yogyakarta, dan sisanya berada dalam wilayah Provinsi Jawa Tengah, yaitu Kabupaten Magelang di sisi barat, Kabupaten Boyolali di sisi utara dan timur, serta Kabupaten Klaten di sisi tenggara. Kawasan hutan di sekitar puncaknya menjadi kawasan Taman Nasional Gunung Merapi sejak tahun 2004.",
            "Gunung Arjuno adalah sebuah gunung berapi kerucut (istirahat) di Jawa Timur, Indonesia dengan ketinggian 3.339 m dpl. Gunung Arjuno secara administratif terletak di perbatasan Kota Batu, Kabupaten Malang, dan Kabupaten Pasuruan dan berada di bawah pengelolaan Taman Hutan Raya Raden Soerjo. Gunung Arjuno merupakan gunung tertinggi kedua di Jawa Timur setelah Gunung Semeru, serta menjadi yang tertinggi keempat di Pulau Jawa. Biasanya gunung ini dicapai dari tiga titik pendakian yang cukup dikenal yaitu dari Lawang, Tretes dan Batu. Nama Arjuno berasal dari salah satu tokoh pewayangan Mahabharata, Arjuna.",
            "Gunung Lemongan adalah sebuah gunung berapi tipe maar, di Jawa Timur. Gunung ini merupakan bagian dari kelompok Pegunungan Iyang. Puncaknya adalah Tarub (1.651 m). Gunung Lemongan termasuk dalam wilayah dua kabupaten, yaitu Lumajang dan Probolinggo.",
            "Gunung Anjasmoro merupakan sebuah gunung yang terdapat di pulau Jawa, Indonesia. Ketinggian gunung ini ialah 2.282 meter. Gunung Anjasmoro termasuk ke dalam wilayah Kabupaten Jombang, Kabupaten Mojokerto, Kabupaten Kediri, Kabupaten Malang, dan Kota Batu, Jawa Timur. Gunung Anjasmoro terletak satu kluster dengan Gunung Argowayang dan terletak berdekatan dengan Gunung Arjuno-Welirang.",
            "Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan antara Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.386 mdpl dan terletak berdampingan dengan Gunung Merapi. Gunung Ijen terakhir meletus pada tahun 1999. Salah satu fenomena alam yang paling terkenal dari Gunung Ijen adalah blue fire (api biru) di dalam kawah yang terletak di puncaknya. Pendakian gunung ini bisa dimulai dari dua tempat. Pendaki bisa berangkat dari Banyuwangi ataupun dari Bondowoso.",
            "Gunung Gede merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980. Gunung ini berada di dua wilayah kabupaten yaitu Kabupaten Cianjur dan Sukabumi, dengan ketinggian 1.000 - 2.958 m. dpl, dan berada pada lintang 106°51' - 107°02' BT dan 64°1' - 65°1 LS. Suhu rata-rata di puncak gunung Gede 18 °C dan di malam hari suhu puncak berkisar 5 °C, dengan curah hujan rata-rata 3.600 mm/tahun. Gerbang utama menuju gunung ini adalah dari Cibodas dan Cipanas."
    )

    private  val mountainHigh = arrayOf(
            "2.329 m (7641 ft)",
            "3.676 m (12060 ft)",
            "3.371 m (11.060 kaki)",
            "3.145 m (10318 ft)",
            "2.968 m (9738 ft)",
            "3.339 m (10955 ft)",
            "1.651 m (5417 ft)",
            "2.282 m (7487 ft)",
            "2.779 m (9117 ft)",
            "2.958 m (9705 ft)"
    )

    private val mountainLocation = arrayOf(
            "Jawa Timur, Indonesia.",
            "Kabupaten Malang dan Kabupaten Lumajang, Jawa Timur, Indonesia.",
            "Jawa Tengah, Indonesia.",
            "Semarang, Boyolali, Magelang (Jawa Tengah), Indonesia.",
            "Kabupaten Sleman (Daerah Istimewa Yogyakarta).",
            "Kota Batu, Kabupaten Malang, Kabupaten Pasuruan, Jawa Timur, Indonesia.",
            "Lumajang Jawa Timur, Indonesia.",
            "Jawa Timur, Indonesia.",
            "Jawa Timur, Indonesia.",
            "Jawa Barat, Indonesia."
    )


    private val mountainImages = intArrayOf(
            R.drawable.g_bromo,
            R.drawable.g_semeru,
            R.drawable.g_sumbing,
            R.drawable.g_merbabu,
            R.drawable.g_merapi,
            R.drawable.g_arjuno,
            R.drawable.g_lamongan,
            R.drawable.g_anjasmoro,
            R.drawable.g_ijen,
            R.drawable.g_gede
    )

    val listData: ArrayList<Mountain>
        get() {
            val list = arrayListOf<Mountain>()
            for (position in mountainName.indices) {
                val mountain = Mountain()
                mountain.name = mountainName[position]
                mountain.detail = mountainDetail[position]
                mountain.photo = mountainImages[position]
                mountain.tinggi = mountainHigh[position]
                mountain.lokasi = mountainLocation[position]
                list.add(mountain)
            }
            return list
        }
}