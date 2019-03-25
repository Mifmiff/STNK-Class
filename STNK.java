public class STNK
{
	public static void main (String[] miftah)
	{
	/* no polisi
	nama pemilik
	alamat pemilik
	merk kendaraan
	jenis kendaraan
	tahunpembuatan
	thunperakitan
	isi silinder
	warna
	nomor rangka
	nomor mesin
	nomor bpkb
	bahan bakar
	kode lokasi */
	
	//inisialisasi objek
	DataStnk ds = new DataStnk();
	
	//inisialisasi nilai
	ds.setNopol("b13ber");	
	ds.setNama("Miftah");
	ds.setAlamat("Bekasi");
	ds.setMerk("Honda");
	ds.setJenis("Vario");
	ds.setWarna("Merah");
	ds.setBahanBakar("Bensin");
	ds.setTahunBuat(2014);
	ds.setTahunRakit(2012);
	ds.setSilinder(3);
	ds.setNoRangka(40);
	ds.setNoMesin(001034);
	ds.setNoBpkb(12345);
	ds.setKodeLok(32);
	
	String nopol = ds.getNopol();
	String nama = ds.getNama();
	String alamat = ds.getAlamat();
	String merk =  ds.getMerk();
	String jenis = ds.getJenis();
	String warna = ds.getWarna();
	String bahanBakar = ds.getBahanBakar();
	int tahunBuat = ds.getTahunBuat();
	int tahunRakit = ds.getTahunRakit();
	int silinder = ds.getSilinder();
	int noRangka = ds.getNoRangka();
	int noMesin = ds.getNoMesin();
	int noBpkb = ds.getNoBpkb();
	int kodeLok = ds.getKodeLok();
	
	System.out.println("\tDATA DALAM STNK");

	//cetak nilai
	System.out.println("Nomor polisi : " +nopol);
	System.out.println("Nama pemilik : " + nama);
	System.out.println("Alamat pemilik : "+alamat);
	System.out.println("Merk kendaraan : "+merk);
	System.out.println("Jenis kendaraan : "+jenis);
	System.out.println("Warna kendaran : "+warna);
	System.out.println("Bahan Bakar yang digunakan : "+bahanBakar);
	System.out.println("Tahun pembuatan : "+tahunBuat);
	System.out.println("Tahun perakitan : "+tahunRakit);
	System.out.println("Isi silinder : "+silinder);
	System.out.println("Nomor rangka : "+noRangka);
	System.out.println("Nomor mesin : "+noMesin);
	System.out.println("Nomor BPKB : "+noBpkb);
	System.out.println("Kode lokasi : "+kodeLok);	
	
	}
}