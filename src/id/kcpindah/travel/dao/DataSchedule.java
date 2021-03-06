package id.kcpindah.travel.dao;

/**
 * Created by SpookyBastard on 6/10/2017.
 */
public class DataSchedule {
    private String dataSchedule = " INSERT IGNORE INTO jadwal VALUES "
            + " ('ELECTRA DUTA WISATA', '01:30:00', 'Jakarta' ), "
            + " ('ELECTRA DUTA WISATA', '08:00:00', 'Jakarta' ), "
            + " ('ELECTRA DUTA WISATA', '13:30:00', 'Jakarta' ), "
            + " ('ELECTRA DUTA WISATA', '09:00:00', 'Cirebon' ), "
            + " ('ELECTRA DUTA WISATA', '10:00:00', 'Tegal' ), "
            + " ('NUSANTARA TOUR & TRAVEL', '08:00:00', 'Jogja' ), "
            + " ('NUSANTARA TOUR & TRAVEL', '15:00:00', 'Jogja' ), "
            + " ('NUSANTARA TOUR & TRAVEL', '13:00:00', 'Magelang' ), "
            + " ('NUSANTARA TOUR & TRAVEL', '08:00:00', 'Surabaya' ), "
            + " ('NUSANTARA TOUR & TRAVEL', '19:00:00', 'Surabaya' ), "
            + " ('NUSA KARIMUN', '21:00:00', 'Bogor' ), "
            + " ('NUSA KARIMUN', '22:30:00', 'Jakarta' ), "
            + " ('NUSA KARIMUN', '16:00:00', 'Cirebon' ), "
            + " ('ROYAL JAYA TOUR & TRAVEL', '07:00:00', 'Bandung' ), "
            + " ('ROYAL JAYA TOUR & TRAVEL', '06:30:00', 'Bogor' ), "
            + " ('TINIGA BALI TOUR', '13:30:00', 'Surabaya' ), "
            + " ('TINIGA BALI TOUR', '02:30:00', 'Madura' ), "
            + " ('TINIGA BALI TOUR', '22:00:00', 'Bali' ), "
            + " ('RIKOLA TOUR', '08:00:00', 'Jepara' ), "
            + " ('RIKOLA TOUR', '09:00:00', 'Kudus' ), "
            + " ('BINTANG SELATAN', '12:30:00', 'Purwokerto' ), "
            + " ('BINTANG SELATAN', '11:00:00', 'Cilacap' ), "
            + " ('BINTANG SELATAN', '09:30:00', 'Kebumen' ), "
            + " ('KARTIKA TOUR & TRAVEL', '07:00:00', 'Pemalang' ), "
            + " ('KARTIKA TOUR & TRAVEL', '07:15:00', 'Batang' ), "
            + " ('KARTIKA TOUR & TRAVEL', '07:30:00', 'Pekalongan' ), "
            + " ('KARTIKA TOUR & TRAVEL', '06:00:00', 'Tegal' ), "
            + " ('SEROJA INDAH TOUR & TRAVEL', '13:00:00', 'Bandung' ), "
            + " ('SEROJA INDAH TOUR & TRAVEL', '15:30:00', 'Bandung' ), "
            + " ('SEROJA INDAH TOUR & TRAVEL', '12:30:00', 'Bogor' ), "
            + " ('CHIARA TOUR & TRAVEL', '18:30:00', 'Jogja' ), "
            + " ('CHIARA TOUR & TRAVEL', '17:00:00', 'Magelang' ), "
            + " ('IKHA JAYA TOUR & TRAVEL', '09:00:00', 'Jakarta' ), "
            + " ('IKHA JAYA TOUR & TRAVEL', '15:00:00', 'Jakarta' ), "
            + " ('STARA SEJAHTERA ARMADA', '04:00:00', 'Jakarta' ), "
            + " ('STARA SEJAHTERA ARMADA', '04:00:00', 'Cirebon' ), "
            + " ('GEMA MAHARDHIKA', '15:30:00', 'Purwokerto' ), "
            + " ('GEMA MAHARDHIKA', '14:30:00', 'Cilacap' ), "
            + " ('GEMA MAHARDHIKA', '15:30:00', 'Purbalingga' ), "
            + " ('AMANDA TOUR & TRAVEL', '14:00:00', 'Kuningan' ), "
            + " ('AMANDA TOUR & TRAVEL', '15:00:00', 'Bandung' ), "
            + " ('AMANDA TOUR & TRAVEL', '17:00:00', 'Bogor' ), "
            + " ('GIANTRA WISATA TOUR', '02:30:00', 'Surabaya' ), "
            + " ('GIANTRA WISATA TOUR', '03:30:00', 'Malang' ), "
            + " ('GIANTRA WISATA TOUR', '17:30:00', 'Malang' ), "
            + " ('KARUNA WIDHI', '16:00:00', 'Jepara' ), "
            + " ('KARUNA WIDHI', '16:30:00', 'Kudus' ), "
            + " ('JATI TOUR & TRAVEL', '13:00:00', 'Tegal' ), "
            + " ('JATI TOUR & TRAVEL', '14:00:00', 'Pekalongan' ), "
            + " ('DANAPUTRI WISATA', '05:00:00', 'Jakarta' ), "
            + " ('DANAPUTRI WISATA', '05:00:00', 'Indramayu' ), "
            + " ('DANAPUTRI WISATA', '09:00:00', 'Indramayu' ), "
            + " ('PURI BARUNA TOUR & TRAVEL', '05:30:00', 'Banyuwangi' ), "
            + " ('PURI BARUNA TOUR & TRAVEL', '20:00:00', 'Banyuwangi' ), "
            + " ('PURI BARUNA TOUR & TRAVEL', '05:00:00', 'Surabaya' ), "
            + " ('SATRIO WIBOWO', '22:00:00', 'Cilegon' ), "
            + " ('SATRIO WIBOWO', '01:30:00', 'Cilegon' ), "
            + " ('SATRIO WIBOWO', '06:30:00', 'Cilegon' ), "
            + " ('SATRIO WIBOWO', '10:30:00', 'Cilegon' ), "
            + " ('LATANSA MIRATAMA', '07:00:00', 'Tasikmalaya' ), "
            + " ('LATANSA MIRATAMA', '11:00:00', 'Tasikmalaya' ), "
            + " ('LATANSA MIRATAMA', '16:00:00', 'Tasikmalaya' ), "
            + " ('FORTUNA TOURS', '13:30:00', 'Jepara' ), "
            + " ('FORTUNA TOURS', '13:30:00', 'Kudus' ), "
            + " ('FORTUNA TOURS', '13:30:00', 'Rembang' ), "
            + " ('FORTUNA TOURS', '16:30:00', 'Rembang' ), "
            + " ('CEMPAKA SAKTI', '04:30:00', 'Solo' ), "
            + " ('CEMPAKA SAKTI', '13:00:00', 'Solo' ), "
            + " ('CEMPAKA SAKTI', '15:30:00', 'Solo' ), "
            + " ('CEMPAKA SAKTI', '19:00:00', 'Solo' ), "
            + " ('CEMPAKA SAKTI', '08:00:00', 'Sragen' ), "
            + " ('CEMPAKA SAKTI', '15:00:00', 'Sragen' ), "
            + " ('HARYONO TOUR & TRAVEL', '13:30:00', 'Indramayu' ), "
            + " ('HARYONO TOUR & TRAVEL', '20:00:00', 'Indramayu' ), "
            + " ('HARYONO TOUR & TRAVEL', '12:00:00', 'Tegal' ), "
            + " ('ANTARANDA TOUR & TRAVEL', '16:00:00', 'Kuningan' ), "
            + " ('ANTARANDA TOUR & TRAVEL', '09:30:00', 'Bandung' ), "
            + " ('BAYU BUANA TOUR', '09:00:00', 'Purbalingga' ), "
            + " ('BAYU BUANA TOUR', '13:00:00', 'Purbalingga' ), "
            + " ('BAYU BUANA TOUR', '14:00:00', 'Banjarnegara' ), "
            + " ('BAYU BUANA TOUR', '17:00:00', 'Banjarnegara' ), "
            + " ('NUSANTARA TOUR', '01:00:00', 'Banyuwangi' ), "
            + " ('NUSANTARA TOUR', '01:00:00', 'Jember' ), "
            + " ('NUSANTARA TOUR', '13:30:00', 'Jember' ), "
            + " ('ARMINTA WISATA', '03:00:00', 'Madura' ), "
            + " ('ARMINTA WISATA', '03:00:00', 'Bali' ), "
            + " ('NAVEGA PRIMANTARA INTERNASIONAL', '10:30:00', 'Cilacap' ), "
            + " ('NAVEGA PRIMANTARA INTERNASIONAL', '13:30:00', 'Pemalang' ), "
            + " ('NAVEGA PRIMANTARA INTERNASIONAL', '10:30:00', 'Purwokerto' ), "
            + " ('ALIA INDAH WISATA', '11:00:00', 'Pacitan' ), "
            + " ('ALIA INDAH WISATA', '08:00:00', 'Ponorogo' ), "
            + " ('ALIA INDAH WISATA', '11:00:00', 'Kebumen' ); ";

    public String getDataTravel() {
        return dataSchedule;
    }
}
