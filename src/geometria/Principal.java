package geometria;

public class Principal {

	public static void main(String[] args) {
		
				Quadrado primeiroQuadrado =  new  Quadrado();
				primeiroQuadrado.setLado(12);
				
				double areaPrimeiroQuadrado = primeiroQuadrado.calcularArea();
				System.out.println( "Área quadrada: "  + areaPrimeiroQuadrado);
				
				System.out.println( "Desenho quadrado: " );
				primeiroQuadrado.desenhar();
				
				//--------------------------------------------------------
				
				Retangulo primeiroRetangulo = new Retangulo();
				primeiroRetangulo.setAltura(6);
				primeiroRetangulo.setBase(12);

				double areaPimeiroRetangulo = primeiroRetangulo.calcularArea();
				System.out.println("Área do rentângulo: " + areaPimeiroRetangulo);
				
				System.out.println("Desenho Retangulo: ");
				primeiroRetangulo.desenhar();
				
				//--------------------------------------------------------
				
				Triangulo primeiroTriangulo = new Triangulo();
				primeiroTriangulo.setAltura(10);
				primeiroTriangulo.setBase(8);

				double areaPimeiroTriangulo = primeiroTriangulo.calcularArea();
				System.out.println("Área do Triangulo: " + areaPimeiroTriangulo);
				
				System.out.println("Desenho Triangulo: ");
				primeiroTriangulo.desenhar();
				
				//--------------------------------------------------------

				Circulo primeiroCirculo = new Circulo();
				primeiroCirculo.setRaio(2);

				double areaPimeiroCirculo = primeiroCirculo.calcularArea();
				System.out.println("Área do Circulo: " + areaPimeiroCirculo);
				
			}
		}