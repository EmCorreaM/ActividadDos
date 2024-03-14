public class Trapecio {
    int baseMenor;
    int baseMayor;
    int altura;

    public Trapecio(int baseMenor, int baseMayor, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double calcularPerímetro() {
        return baseMayor + baseMenor + 2 * Math.sqrt(Math.pow((baseMayor - baseMenor) / 2.0, 2) + Math.pow(altura, 2));
    }

    public double calcularÁrea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }
}
