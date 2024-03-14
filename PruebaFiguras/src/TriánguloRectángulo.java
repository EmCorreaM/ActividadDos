public class TriánguloRectángulo {
    private int base;
    private int altura;

    public TriánguloRectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    } // Aquí cerramos el constructor

    public double calcularArea() {
        return (base * altura / 2.0);
    }

    public double calcularPerímetro() {
        return (base + altura + calcularHipotenusa());
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public void determinarTipoTriángulo() {
        if (base == altura && base == calcularHipotenusa()) {
            System.out.println("Es un triángulo equilátero");
        } else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }
}
