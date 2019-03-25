public class DataStnk {
	private String nopol, nama, alamat, merk;
	private String jenis, warna, bahanBakar;
	private int tahunBuat, tahunRakit, silinder;
	private int noRangka, noMesin, noBpkb, kodeLok;
	
	//nomor polisi
	public void setNopol (String nopol) {
		this.nopol = nopol;
	}
	public String getNopol () {
		return nopol;
	}
	//nama pemilik
	public void setNama ( String nama) {
		this.nama = nama;
	}
	public String getNama () { 
		return nama;
	}
	//alamat pemilik
	public void setAlamat (String alamat) { 
		this.alamat = alamat;
	}
	public String getAlamat () { 
		return alamat;
	}
	//merek kendaraan
	public void setMerk (String merk) {
		this.merk= merk; 
	}
	public String getMerk () {
		return merk;
	}
	//jenis kendaraan
	public void setJenis (String jenis) {
		this.jenis = jenis;
	}
	public String getJenis () {
		return jenis;
	}
	//warna kendaraan
	public void setWarna ( String warna) {
		this.warna = warna;
	}
	public String getWarna () {
		return merk;
	}
	//bahan Bakar
	public void setBahanBakar ( String bahanBakar) {
		this.bahanBakar = bahanBakar;
	}
	public String getBahanBakar () {
		return bahanBakar;
	}
	//tahun pembuatan
	public void setTahunBuat (int tahunBuat) {
		this.tahunBuat = tahunBuat;
	}
	public int getTahunBuat () {
		return tahunBuat;
	}
	//tahun perakitan
	public void setTahunRakit (int tahunRakit) {
		this.tahunRakit = tahunRakit;
	}
	public int getTahunRakit () {
		return tahunRakit;
	}
	//isi silinder
	public void setSilinder (int silinder) {
		this.silinder = silinder;
	}
	public int getSilinder () {
		return silinder;
	}
	//nomor rangka
	public void setNoRangka (int noRangka) {
		this.noRangka = noRangka;
	}
	public int getNoRangka () {
		return noRangka;
	}
	//nomor mesin
	public void setNoMesin (int noMesin) {
		this.noMesin = noMesin;
	}
	public int getNoMesin () {
		return noMesin;
	}
	//nomor BPKB
	public void setNoBpkb (int noBpkb) {
		this.noBpkb = noBpkb;
	}
	public int getNoBpkb () {
		return noBpkb;
	}
	//kode lokasi
	public void setKodeLok (int kodeLok) {
		this.kodeLok = kodeLok;
	}
	public int getKodeLok () {
		return kodeLok;
	}
}