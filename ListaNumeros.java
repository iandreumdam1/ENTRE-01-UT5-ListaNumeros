
/**
 * La clase representa a una lista de 
 * n�meros enteros
 * 
 * @author - Ibai Andreu
 * 
 */
import java.util.Arrays;

public class ListaNumeros 
{
    private int[] lista;
    private int pos;

    /**
     * Constructor de la clase ListaNumeros 
     * Crea e inicializa adecuadamente los
     * atributos
     * 
     * @param n el tama�o m�ximo de la lista
     */
    public ListaNumeros(int n) {
        lista = new int[n];
        pos = 0;
    }

    /**
     * A�ade un valor siempre al principio de la lista
     * 
     * @param numero el valor que se a�ade. No se hace nada si la lista est�
     *               completa
     * @return true si se ha podido a�adir, false en otro caso
     */
    public boolean addElemento(int numero) {
        boolean f = false;
        if (estaCompleta() == false){
           for (int i = pos; i > 0; i--){
               lista[i] = lista[i -1];
            }
            lista[0] = numero;
            pos++;
            f = true;
        }
        
        return f;
    }

    /**
     * devuelve true si la lista est� completa, false en otro caso
     * Hacer sin if
     */
    public boolean estaCompleta() {

        return pos == lista.length;

    }

    /**
     * devuelve true si la lista est� vac�a, false en otro caso. 
     * Hacer sin if
     */
    public boolean estaVacia() {
        return pos == 0;
    }

    /**
     * devuelve el n� de elementos realmente guardados en la lista
     */
    public int getTotalNumeros() {
        return pos;

    }

    /**
     * Vac�a la lista
     */
    public void vaciarLista() {
        pos = 0;
    }

    /**
     * Representaci�n textual de la lista de la forma indicada 
     * (leer enunciado)
     * 
     * Si la lista est� vac�a devuelve ""
     */
    public String toString() {
        String strResul = "Lista de n�meros\n";
        if(estaVacia() == false){
            for(int i = 0; i < lista.length; i++){
                //for(int col = 0; col < notas[fila].length;col++){
                    strResul += String.format ("%4d", lista[i], "\n");
                //}
               // strResul += "\n";
            }
            int posicion = 0;
            for(int t = 0; t < pos; t++){
              strResul  += String.format("%4d", posicion);
              posicion++;  
            }
        
        }
        else{
            strResul = " ";
            
        }
        return strResul;
    }


    /**
     * Mostrar en pantalla la lista
     */
    public void escribirLista() {
        System.out.println(this.toString());
    }

    /**
     * B�squeda lineal de numero en la lista
     * @param numero el n� a buscar
     * @return un array con las posiciones en las que se ha encontrado
     *  
     */
    public int[] buscarPosicionesDe(int numero) {
       boolean encontrado = false;
       int i = 0;
       while (i < lista.length && ! encontrado) {
         if (lista[i] == numero) {
           encontrado = true;
         }
         else {
           i++;
         }
       }
        int[] posiciones = new int[i];
        return posiciones;

    }

    /**
     * Hace una b�squeda binaria del numero indicado devolviendo -1 si no se
     * encuentra o la posici�n en la que aparece
     * 
     * El array original lista no se modifica 
     * Para ello crea previamente una copia
     * de lista y trabaja con la copia
     * 
     * Usa exclusivamente m�todos de la clase Arrays
     * 
     */
    public int buscarBinario(int numero) {

        return 0;

    }


    /**
     * borra el primer elemento de la lista
     */
    public void borrarPrimero() {
        for (int i = 0 + 1; i < pos; i++) {
         lista[i - 1] = lista[i];
        }
        pos--;
    }
    
    /**
     *  Invierte cada uno de los grupos de n elementos que hay en lista
     *  
     *  Si el n� de elementos en lista no es divisible entre n los elementos restantes 
     *  quedan igual
     *  
     *  (leer enunciado)
     *  
     */
    public void invertir(int n) {
       int limiteDerecha = n - 1;
       for (int i = 0; i < (n / 2); i++) {
        int aux = lista[i];
        lista[i] = lista[limiteDerecha];
        lista[limiteDerecha] = aux;
        limiteDerecha--;
       }
    }
   
    /**
     * devuelve un ragged array de 2 dimensiones con tantas filas como valores
     * tenga el atributo lista y rellena el array de la forma indicada
     * (leer enunciado)
     * 
     */
    public int[][] toArray2D() {
        int[] longitudFilas = lista;
        int[][] ragged = new int[4][];
        for (int fila = 0; fila < ragged.length; fila++) {
            ragged[fila] = new int[longitudFilas[fila]];
            for (int col = 0; col < ragged[fila].length; col++)  {
                ragged[fila][col] = 'X';
            }
        }
      
        return ragged;
    }

    /**
     * Punto de entrada a la aplicaci�n 
     * Contiene c�digo para probar los m�todos de ListaNumeros
     */
    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros(20);

        System.out.println("--- addElemento() y toString() -------");
        int[] valores = {21, -5, 6, -7, 21, -17, 21, 15, 22, 21, 77};
        for (int i = 0; i < valores.length; i++) {
            lista.addElemento(valores[i]);
        }
        System.out.println(lista.toString());

        System.out.println("--- buscarPosiciones() -------");
        int numero = 21;
        System.out.println(lista.toString());
        System.out.println("\t" + numero + " aparece en posiciones ");
        // seguir completando

    }
}
