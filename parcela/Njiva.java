package parcela;

public class Njiva extends Parcela {

	private double godPrinosPoMKv;

	public Njiva(double povrsina, double godPrinosPoMKv) {
		super(povrsina);
		this.godPrinosPoMKv = godPrinosPoMKv;
	}

	public double getGodPrinosPoMKv() {
		return godPrinosPoMKv;
	}

	public void setGodPrinosPoMKv(double godPrinosPoMKv) {
		this.godPrinosPoMKv = godPrinosPoMKv;
	}

	public char vrsta() {
		return 'n';
	}

	public double prinos(int godine) {
		return this.getPovrsina() * this.godPrinosPoMKv * godine;
	}

	public String toString() {
		return vrsta() + "-" + this.getId() + "[" + this.getPovrsina() + "km2]" + ":" + this.godPrinosPoMKv;

	}

}
