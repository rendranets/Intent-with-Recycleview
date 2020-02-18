package com.dicoding.medicinal_plants.model;

import com.dicoding.medicinal_plants.R;

import java.util.ArrayList;

public class PlantsData {
    private static String[] PlantsNames = {
            "Kangkung",
            "Daun Saga",
            "Jintan Hitam",
            "Pegagan",
            "Kemuning",
            "Kumis Kucing",
            "Daun Sirih",
            "Daun Salam",
            "Daun Jambu Biji",
            "Kemukus"
    };

    private static String[] PlantsLatinNames = {
            "Ipomoea aquatica",
            "Abrus precatorius",
            "Nigella sativa",
            "Centella asiatica",
            "Murraya paniculata",
            "Orthosiphon aristatus",
            "Piper betle",
            "Syzygium polyanthum",
            "Psidium guajava",
            "Piper cubeba"
    };

    private static String[] PlantsDetails = {
            "Kangkung adalah sayur yang ditanam sebagai makanan. Kangkung merupakan tumbuhan yang dapat ditemukan di banyak sekali daerah di kawasan Asia, termasuk Indonesia, terutama pada kawasan-kawasan berair. Kangkung biasa diolah menjadi tumisan atau ca kangkung, bumbu tauco, atau bahkan terasi.",
            "Daun saga merupakan tanaman perdu yang mempunyai rasa manis. Bagian biji daun saga merupakan bagian yang benar-benar tidak boleh dikonsumsi karena mengandung zat beracun yang apabila tertelan sangat berisiko terhadap kematian. Tumbuhan daun saga banyak tumbuh liar di hutan. Pertumbuhannya optimal pada daerah dataran rendah hingga ketinggian 1000 meter dari permukaan laut.",
            "Jintan atau jinten hitam adalah tumbuhan herbal yang dikenal dengan nama lain Habbatusauda. Tanaman obat keluarga yang satu ini telah lama digunakan oleh umat Muslim karena memang dianjurkan oleh Nabi Muhammad SAW. Maka tidak heran, bila habbatasauda sangat dicari di negara-negara timur tengah seebagai media pengobatan.",
            "Mungkin pegagan sudah dikenal oleh banyak penduduk Indonesia. Tetapi, apakah banyak yang tahu kalau daun pegagan ternyata mempunyai fungsi pengobatan tradisional? Tanaman yang banyak tumbuh di kawasan Afrika, Asia Tenggara, dan India ini telah digunakan sbeagai obat-obatan. Seperti di India, pegagan dipakai dalam tradisi Ayurvedic.",
            "Pada bagian daun kemuning terkandung 60 senyawa minyak atsiri yang hampir memenuhi 0,01% diisi oleh cadinene dan seskuiterpen. Selain minyak atsiri, ada juga senyawa alkaloid tanin, saponin, dan glikosida jantung. Pada kemuning juga terdapat flavonoid, alkaloid indol, dan kumarin.",
            "Kumis kucing telah diyakini sejak lama oleh penduduk Asia sebagai tanaman obat tradisional keluarga yang bisa mengobati penyakit yang berkaitan dengan ginjal. Tanaman kumis kucing yang bisa tumbuh pada daerah beriklim tropis dan subtropis ini mengandung beberapa zat aktif seperti rosmarinic acid, flavonoid, lipophilic, sinensetin, orthosiphol, dan orthosiphon.",
            "Orang-orang yang tinggal di pelosok desa, sebut saja suku Bayan yang ada di daerah Nusa Tenggara Barat, mempunyai kebiasaan mengunyah daun sirih bersama kapur dan pinang. Kegiatan tersebut ternyata bukan sebatas tradisi atau budaya, tetapi berdasarkan penelitian ternyata mengunyah sirih ada hubungannya dengan penyakit kanker mulut serta pembentukan squamous cell carcinoma yang bersifat maliginan.",
            "Daun salam termasuk tanaman rempah yang dipakai sebagai bumbu penyedap masakan. Selain umum dipakai di dapur sebagai bahan pencampur masakan, daun salam juga banyak dijadikan tanaman herbal untuk memberikan manfaat kesehatan atau sebagai tanaman obat untuk ragam penyakit.",
            "Pasti Anda sering melihat iklan produk obat atau minuman untuk melancarkan gangguan pencernaan seperti diare. Bila diperhatikan, kebanyakan produk tersebut menggunakan bahan dasar jambu biji. Ternyata memang benar, dari tinjuan medis diketahui bahwa jambu biji mempunyai ragam manfaat kesehatan, terlebih pada bagian daunnya yang banyak dipakai menjadi tanaman obat keluarga.",
            "Kemukus merupakan tanaman rambat yang masih asing di Indonesia. Tanaman rambat bernama kemukus ini mempunyai bentuk daun yang serupa dengan daun sirih, banyak digunakan sebagai bumbu masakan. Sifatnya yang hangat serta banyaknya kandungan minyak atsiri di dalamnya membuat kemukus banyak dimanfaatkan sebagai tanaman obat."
    };

    private static String[] PlantsDetails2 = {
            "Hampir seluruh bagian tanaman kangkung bisa dimakan, tapi yang paling umum adalah batang dan daunnya yang bisa dimakan matang ataupun mentah, sama seperti bayam. Kangkung sendiri tergolong ke dalam tanaman obat keluarga yang mampu menyembuhkan penyakit urat syaraf lemah, sakit kepala sebalah atau migrain, insomnia, sariawan, sakit gigi, wasir, sembelit, cacar air, dan frambusia (puru/patek).",
            "Pada bagian daunnya banyak terkandung senyawa saponin dan flavonoid. Daun saga berkhasiat untuk mengobati beberapa gangguan kesehatan seperti sariawan, batuk pada bayi, batuk kering, batuk berdahak, tenggorokan gatal, amandel, radang mata, radang tenggorokan, panas dalam, gangguan jantung, hipertensi, dan bronkitis. Daun saga juga diketahui mampu membantu membuat bayi tidur lebih nyenyak dan tidak",
            "Jinten hitam sendiri sudah diteliti dan dilaporkan memberi manfaat pada bidang farmasi untuk banyak jenis pengobatan seperti anti-bakteri, anti-jamur, analgesik, anti-radang, anti-maag, anti-hipertensi, antivirus, asma, alergi, gangguan imun, masalah pada saluran pencernaan, diabetes, kanker usur besar, dan epilepsi. Perlu juga ketahui bahwasanya jinten hitam memberikan beberapa efek samping sehingga pengonsumsiannya harus di bawah pantauan ahli pada dosis yang dianjurkan.",
            "Beberapa kondisi kesehatan yang terganggu bisa diatasi oleh daun pegagan, seperti sifilis, asma, dan psoriasis (masalah kulit). Selain itu, pegagan juga banyak dimanfaat sebagai tanaman obat keluarga utnuk mengobati penyakit ulkus lambung, epilepsi,diare, demam, hepatitis, dan kelelahan mental.",
            "Daun kemuning yang mempunyai bentuk cantik seperti tanaman hias ini dapat digunakan untuk mencegah terjadinya koagulasi atau bekuan darah. Selain itu, daun kemuning juga telah diuji lewat studi ekstrak etanol yang melibatkan tikus sebagai subjek penelitiannya dengan hasil terjadinya penurunan jumlah glukosa darah yang signifikan, sehingga ditarik kesimpulan bahwa daun kemuning juga baik untuk pengidap diabetes.",
            "Tanaman kumis kucing diambil bagian daunnya untuk dijadikan bahan peluruh batu ginjal. Hal tersebut dapat dilakoni oleh daun kumis kucing karena mempunyai sifat diuretik dengan meluruhkan atau membersihkan saluran kencing. Selain itu, kandungan zat aktif di dalam kumis kucing juga dapat menyembuhkan penyakit asam urat, hipertensi, diabetes, dan beberapa penyakit lain meski dikonsumsi mandiri atau dicampur dengan macam-macam tanaman obat keluarga lainnya.",
            "Daun sirih juga mempunyai kegunaan sebagai tanaman herbal untuk mengatasi berbagai macam penyakit seperti batuk berdahak, sariawan, bronkitis, kulit berjerawat, sakit gigi, keputihan, demam berdarah, haid tidak teratur, asma, radang tenggorokan, gusi bengkak, mata merah dan gatal, bau ketiak, menghilangkan bekas luka bakar, bisul, mimisan, pendarahan pada gusi, dan permukaan kulit yang terasa gatal.",
            "Senyawa yang tertanam di daun salam dibantu oleh vitamin dan mineral untuk menghadirkan fungsi pengobatan. Salah satu penyakit yang bisa ditangani oleh daun salam aalah diabetes tipe 2 dengan cara menurunkan glukosa darah, kolesterol, dan kadar trigliserida di dalam tubuh. Perubahannya akan terlihat setelah mengonsunsi daun salam bubuk minimal selama satu bulan.",
            "Daun jambu biji bisa menanggulangi masalah diare. Masalah kesehatan yang banyak menimpa orang ini tidak bisa dianggap enteng. Tercatat bahwa setiap tahun banyak orang yang meninggal akibat diare kronis. Untuk itu, segera gunakan daun jambu biji bila Anda sedang terkena diare. Diare harus ditangani dengan cepat dan sigap, jangan dipandang sebelah mata meski terkesan sebagai penyakit remeh.",
            "Bagian yang banyak menyimpan minyak arsiri beserta senyawa kimia yang mempunyai fungsi pengobatan terletak pada bijinya. Biji kemukus dipakai untuk mengobati beberapa macam penyakit seperti flu pada bayi, mengembalikan energi, mengobati asma dan sesak nafas, serta mengatasi keputihan dengan cepat. Penggunaan kemukus tida boleh berlebihan karena bisa menyebabkan keracunan, iritasi pada saluran kemih, iritasi pada ginjal, dan iritasi pada usus."
    };

    private static int[] PlantsImages = {
            R.drawable.kangkung,
            R.drawable.saga,
            R.drawable.jinten_hitam,
            R.drawable.pegagan,
            R.drawable.kemuning,
            R.drawable.kumis_kucing,
            R.drawable.sirih,
            R.drawable.salam,
            R.drawable.jambu_biji,
            R.drawable.kemukus
    };

    private static String[] PlantsLink = {
            "https://id.wikipedia.org/wiki/Kangkung",
            "https://id.wikipedia.org/wiki/Saga_rambat",
            "https://id.wikipedia.org/wiki/Jintan_hitam",
            "https://id.wikipedia.org/wiki/Pegagan",
            "https://id.wikipedia.org/wiki/Kemuning",
            "https://id.wikipedia.org/wiki/Kumis_kucing",
            "https://id.wikipedia.org/wiki/Sirih",
            "https://id.wikipedia.org/wiki/Salam_(tumbuhan)",
            "https://id.wikipedia.org/wiki/Jambu_biji",
            "https://id.wikipedia.org/wiki/Kemukus"
    };

    public static ArrayList<Plant> getListData() {
        ArrayList<Plant> list = new ArrayList<>();
        for (int position = 0; position < PlantsNames.length; position++) {
            Plant plant = new Plant();
            plant.setName(PlantsNames[position]);
            plant.setLatin_name(PlantsLatinNames[position]);
            plant.setDetail(PlantsDetails[position]);
            plant.setDetail2(PlantsDetails2[position]);
            plant.setPhoto(PlantsImages[position]);
            plant.setLink(PlantsLink[position]);
            list.add(plant);
        }
        return list;
    }
}