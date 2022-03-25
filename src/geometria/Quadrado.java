package geometria;

public class Quadrado {

	 private double lado ;
	
	
	public  void  setLado ( double  lado ) {
		if (lado >  0 ) {
			this.lado = lado;
		}
	}
	
	public  double  calcularArea () {
		double area  = lado * lado;
		
		return area;
	}
	
	public  void  desenhar () {
		for ( int i =  0 ; i < lado; i ++ ) {
			System.out.print( " . " );
			
			for ( int j =  0 ; j < lado; j ++ ) {
				if (i ==  0  || i +  1  >= lado) {
					System.out.print( " . " );
				} else {
					System.out.print( "   ");
					
				}
			}
			
			System.out.println( " . " );
		}
	}
}