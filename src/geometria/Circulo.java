package geometria;

public class Circulo {
	 private double raio ;
		
		
		public  void  setRaio ( double  raio ) {
			if (raio >  0 ) {
				this.raio = raio;
			}
		}
		
		public  double  calcularArea () {
			double area  = 3.14 * raio * raio;	
			return area;
		}
		
		public  void  desenhar () {
			
		}
}
