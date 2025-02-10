package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int len = arregloEnteros.length;
    	int[] copia = new int[len];
    	for (int i = 0; i < len; i++) {
    		copia[i] = arregloEnteros[i];
    	}
        return copia;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	int len = arregloCadenas.length;
    	String[] copia = new String[len];
    	for (int i = 0; i < len; i++) {
    		copia[i] = arregloCadenas[i];
    	}
        return copia;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int[] newArreglo = new int[arregloEnteros.length+1];
    	for (int i= 0; i <= arregloEnteros.length; i++) {
    		if (i == arregloEnteros.length){
    			newArreglo[i] = entero;
    		} else {
    			newArreglo[i] = arregloEnteros[i];
    		}
    	}
    	arregloEnteros = newArreglo; 	
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	String[] newArreglo = new String[arregloCadenas.length+1];
    	for (int i= 0; i <= arregloCadenas.length; i++) {
    		if (i == arregloCadenas.length){
    			newArreglo[i] = cadena;
    		} else {
    			newArreglo[i] = arregloCadenas[i];
    		}
    	}
    	arregloCadenas = newArreglo; 	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int c = 0;
    	for (int i: arregloEnteros){
    		if (i != valor) {
    			c++;
    		}
    	}
    	int[] newArreglo = new int[c];
    	int x = 0;
    	for (int j: newArreglo) {
    		if (j != valor) {
    			newArreglo[x++] = j;
    		}
    	}
    	arregloEnteros = newArreglo;
    }
    

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int c = 0;
    	for (String i: arregloCadenas){
    		if (i != cadena) {
    			c++;
    		}
    	}
    	String[] newArreglo = new String[c];
    	int x = 0;
    	for (String j: newArreglo) {
    		if (j != cadena) {
    			newArreglo[x++] = j;
    		}
    	}
    	arregloCadenas = newArreglo;	
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	if (posicion < 0) {
    		posicion = 0;
    	}
    	
    	if (posicion > arregloEnteros.length) {
    		posicion = arregloEnteros.length;
    	}
    	
    	int[] newArreglo = new int[arregloEnteros.length+1];
    	int posViejo = 0;
    	for (int i= 0; i <= arregloEnteros.length; i++) {
    		if (i == posicion) {
    			newArreglo[i] = entero;	
    		} else {
    			newArreglo[i] = arregloEnteros[posViejo];
    			posViejo++;
    		}
    	}
    	arregloEnteros = newArreglo;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (0 <= posicion && posicion < arregloEnteros.length) {
    		int[] newArreglo = new int[arregloEnteros.length-1];
        	int posViejo = 0;
        	boolean eliminado = false;
        	for (int i= 0; i < arregloEnteros.length-1; i++) {
        		if (i == posicion && eliminado == false) {
        			i--;
        			eliminado = true;
        		} else {
        			newArreglo[i] = arregloEnteros[posViejo];
        		}
        		posViejo++;
        	}
        	arregloEnteros = newArreglo;
    	}
    	
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[] newArreglo = new int[arregloEnteros.length];
    	for (int i= 0; i < arregloEnteros.length; i++) {
    		newArreglo[i] = (int) valores[i];
    	}
    	arregloEnteros = newArreglo;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[] newArreglo = new String[arregloEnteros.length];
    	for (int i= 0; i < arregloEnteros.length; i++) {
    		newArreglo[i] = objetos.toString();
    	}
    	arregloCadenas = newArreglo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int[] newArreglo = new int[arregloEnteros.length];
    	for (int i= 0; i < arregloEnteros.length; i++) {
    		if (arregloEnteros[i] < 0) {
    			newArreglo[i] = arregloEnteros[i] * -1;
    		} else {
    			newArreglo[i] = arregloEnteros[i];
    		}
    		
    	}
    	arregloEnteros = newArreglo;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	for (int pos = 0; pos < arregloEnteros.length; pos++) {
    		int minPos = pos;
    		
    		for (int i = minPos + 1; i < arregloEnteros.length; i++) {
    			if (arregloEnteros[i] < arregloEnteros[minPos]) {
    				minPos = i;
    			}    			
    		}
    		int min = arregloEnteros[minPos];
    		arregloEnteros[minPos] = arregloEnteros[pos];
    		arregloEnteros[pos] = min;
    	}

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	for (int pos = 0; pos < arregloCadenas.length; pos++) {
    		int minPos = pos;
    		
    		for (int i = minPos + 1; i < arregloCadenas.length; i++) {
    			if (arregloCadenas[i].compareTo(arregloCadenas[minPos])<0) {
    				minPos = i;
    			}    			
    		}
    		String min = arregloCadenas[minPos];
    		arregloCadenas[minPos] = arregloCadenas[pos];
    		arregloCadenas[pos] = min;
    	}

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int aparaciones = 0;
    	for (int i: arregloEnteros) {
    		if (i == valor) {
    			aparaciones++;
    		}
    	}    	
        return aparaciones;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int aparaciones = 0;
    	for (String i: arregloCadenas) {
    		if (i.toLowerCase().equals(cadena.toLowerCase())) {
    			aparaciones = aparaciones+1;
    		}
    	}    	
        return aparaciones;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int cont = 0;
    	for (int x: arregloEnteros) {
    		if (x == valor) {
    			cont++;
    		}
    	}
    		
    	int[] newArray = new int[cont];
    	int i = 0;
    	for (int pos = 0; pos < arregloEnteros.length; pos++) {
    		if (arregloEnteros[pos] == valor) {
    			newArray[i] = pos;
    			i++;
    		}
    	}
    	return newArray;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	if (arregloEnteros.length == 0) {
    		int[] x = new int[0]; 
    		return x;
    	}
    	
    	int min = arregloEnteros[0];
    	int max = arregloEnteros[0];
    	
    	for (int i = 0; i < arregloEnteros.length; i++) {
			if (arregloEnteros[i] > max) {
				max = arregloEnteros[i];
				
			} else if (arregloEnteros[i] < min){
				min = arregloEnteros[i];				
			}
			
		}   
    	
    	int[] rta = {min, max};
    	return rta;
	}
        
   

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un Aa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	HashMap<Integer, Integer> histograma = new HashMap<>();
    	for (int i = 0; i< arregloEnteros.length; i++) {
    		if(histograma.get(arregloEnteros[i]) == null) {
    			histograma.put(arregloEnteros[i], 1);
    		} else {
    			int x = histograma.get(arregloEnteros[i]);
    			histograma.put(arregloEnteros[i], x+1);
    		}
    	}
        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int x = 0;
    	HashMap<Integer, Integer> histograma = calcularHistograma();
    	for (HashMap.Entry<Integer, Integer> i : histograma.entrySet()) {
    		if (i.getValue() != 1){
    			x++;
    		}
    	}
    	
        return x;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length == 0) {
    		return false;
    	}
    	
    	for (int pos = 0; pos < arregloEnteros.length; pos++) {
    		if (arregloEnteros[pos] != otroArreglo[pos]) {
    			return false;
    		}
    	}
        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length == 0 && otroArreglo.length == 0) {
    		return true;
    	} else if (arregloEnteros.length == 0 || otroArreglo.length == 0){
    		return false;
    	}
    	
    	for (int i = 0; i < arregloEnteros.length; i++) {
    		boolean x = false;
    		for (int j = 0;j < otroArreglo.length; j++) {
    			if (arregloEnteros[i] == otroArreglo[j]) {
    				x = true;
    			}
    		}
    		if (x == false) {
    			return false;
    		}
    	}
        return true;
        
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] newArreglo = new int[cantidad];
    	for (int pos = 0; pos < cantidad; pos++) {
    		newArreglo[pos] = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
    	}
    	
    	arregloEnteros = newArreglo;
    }

}
