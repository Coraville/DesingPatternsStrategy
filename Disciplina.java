public class Disciplina {
	 private ICalcMedia calcMedia;
	    private String nome;
	    private double p1;
	    private double p2;
	    private double media;
	    private String situacao;

	    public Disciplina(ICalcMedia calcMedia) {
	        this.calcMedia = calcMedia;
	    }

	    public void calcularMedia() {
	        this.media = calcMedia.calculaMedia(p1, p2);
	        this.situacao = calcMedia.situacao(media);
	    }

	    public Disciplina(ICalcMedia calcMedia, String nome, double p1, double p2) {
	        this.calcMedia = calcMedia;
	        this.nome = nome;
	        this.p1 = p1;
	        this.p2 = p2;
	        calcularMedia();
	    }

	    // Getters and setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getP1() {
	        return p1;
	    }

	    public void setP1(double p1) {
	        this.p1 = p1;
	    }

	    public double getP2() {
	        return p2;
	    }

	    public void setP2(double p2) {
	        this.p2 = p2;
	    }

	    public double getMedia() {
	        return media;
	    }

	    public String getSituacao() {
	        return situacao;
	    }

}
