
public class Daire extends Sekil{
	
	private int yarıcap;


	public Daire(String isim, int yarıcap) {
		super(isim);
		this.yarıcap = yarıcap;
	}




	@Override
	void alan_hesapla() {
		
		double alan =  (Math.PI * yarıcap * yarıcap);
		System.out.println(getIsim()  + "nin alanı: " + alan);
		
	}
	
	
	

}
