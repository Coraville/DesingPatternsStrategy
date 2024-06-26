public class Geometrica implements ICalcMedia {
    @Override
    public double calculaMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String situacao(double media) {
        return media >= 7 ? "aprovado" : "reprovado";
    }
}
