package geometria;

public class Triangulo {
	private int base;
	private int altura;

	public void setBase(int base) {
		if (base > 0) {
			this.base = base;
		}
	}

	public void setAltura(int altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}

	public double calcularArea() {
		double area = base * altura / 2;

		return area;
	}

	public void desenhar() {
		for (int i = 1; i <= altura; i++) {
			for (int j = altura - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(".");
			}

			System.out.print("\n");

		}

	}

}
