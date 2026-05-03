/*Interfaz para Catálogo de Películas*/
package peliculas.modelo;

public interface ICatalogoPeliculas {
    //Métodos de la interfaz
    void insertarPelicula (Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
    
}
