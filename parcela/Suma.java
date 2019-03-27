package parcela;

public class Suma extends Parcela{
	
	private double povrsinaStabala;
	private double prinosPoStablu;
	private int periodSazrevanja;
	
	public Suma(double povrsina, double povrsinaStabala, double prinosPoStablu, int periodSazrevanja) {
		super(povrsina);
		this.povrsinaStabala = povrsinaStabala;
		this.prinosPoStablu = prinosPoStablu;
		this.periodSazrevanja = periodSazrevanja;
	}
	
	public char vrsta() {
		return 's';
	}
	
	public double prinos(int godina) {
		return this.getPovrsina() / this.povrsinaStabala * this.prinosPoStablu * (godina / this.periodSazrevanja);
	}

	@Override
	public String toString() {

		return vrsta() + "-" + this.getId() + "[" + this.getPovrsina() + "km2]" + ":(" + this.povrsinaStabala + ", " + this.prinosPoStablu + ", " + this.periodSazrevanja
				+ ")";
	}
	
	
}
