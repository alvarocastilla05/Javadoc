package ejemplo;

/**
 * Esta es una clase en la que hay  dos métodos de ejemplo 
 * para poder explicar los distintos tipos de comentarios de Javadoc.
 * 
 * @author Alvaro
 * @version 1.0
 */


public class Metodos {

	 
	 /**
     * Este es un método de ejemplo que concatena dos cadenas.
     *
     * @param str1 La primera cadena a concatenar.
     * @param str2 La segunda cadena a concatenar.
     * @return La concatenación de las dos cadenas proporcionadas.
     */
    public String concatenar(String str1, String str2) {
        return str1 + str2;
    }
    
	/**
	 * Método que multiplica dos números decimales
	 * @see "Libro de matemáticas"
	 * @param x primer valor decimal
	 * @param y segundo valor decimal
	 * @return el producto de dos número decimales.
	 */
    
	public double multiplicar(double x, double y) {
	        return x * y;
	    }
	 
	 
}
