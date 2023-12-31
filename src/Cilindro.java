public class Cilindro {
    double raio;
    double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double volumeCilindro() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    double areaCilindro() {
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaDasBases = 2 * Math.PI * Math.pow(raio, 2);
        return areaLateral + areaDasBases;
    }
}

