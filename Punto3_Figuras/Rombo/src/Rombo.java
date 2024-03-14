public class Rombo {
    int diagonalMenor;
    int diagonalMayor;

    public Rombo(int diagonalMenor, int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularPerímetro() {
        return 4 * Math.sqrt(Math.pow(diagonalMayor / 2.0, 2) + Math.pow(diagonalMenor / 2.0, 2));
    }

    public double calcularÁrea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }
}
