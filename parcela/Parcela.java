package parcela;

public abstract class Parcela {
	public static int uid=0;
	
	private int id;
	private double povrsina;
	
	public Parcela(double povrsina) {
		this.povrsina = povrsina;
		this.id = ++uid;
	}
	public int getId() {
		return id;
	}
	public double getPovrsina() {
		return povrsina;
	}
	
	public abstract char vrsta();

	public abstract double prinos(int godine);

	public String toString() {
		return vrsta() + "-" + this.getId() + "[" + this.getPovrsina() + "km2]";

	}
	
	
	
	

}
