package geometria;

public class Retangulo {

	private double base;
	private double altura;

	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}

	public double calcularArea() {
		double area = base * altura;

		return area;
	}

	public void desenhar() {
		for (int i = 0; i < altura; i++) {
			System.out.print(" . ");

			for (int j = 0; j < base; j++) {
				if (i == 0 || i + 1 == altura) {
					System.out.print(" . ");
				} else {
					System.out.print("   ");

				}
			}

			System.out.println(" . ");
		}
	}

}
