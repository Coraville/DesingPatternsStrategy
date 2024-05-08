public class Main {

	public static void main(String[] args) {
		//Aritmetica calculo = new Aritmetica();
        Geometrica calculo = new Geometrica();
		Disciplina d = new Disciplina(calculo);
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(5);
        d.setP2(7);
        d.calcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situação: %s",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }

}
