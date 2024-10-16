public class Pelicula {
    // El titulo de la pelicula
    private String titulo;
    // La duración de la pelicula
    private int duracionMinutos;
    // El titulo de la pelicula
    private boolean idiomaOriginal;
    
    /**
     * Añade una pelicula nueva
     */
    public Pelicula(String nombrePelicula, int minutos) {
        titulo = nombrePelicula;
        duracionMinutos = minutos;
        idiomaOriginal = false;
    }
    
    /**
     * Devuelve el nombre de la pelicula
     */
    public String getNombre() {
        return titulo;
    }
    
    /**
     * Devuelve el nombre de la pelicula
     */
    public int getDuracion() {
        return duracionMinutos;
    }
    
    /**
     * Devuelve el nombre de la pelicula
     */
    public String getIdioma() {
        String idioma;
        if (idiomaOriginal){
            idioma = "La pelicula está en su idioma original";
        } else {
            idioma = "La película no está en su idioma original";
        }
        return idioma;
    }
    
    public void setTitulo(String nuevoTitulo){
        titulo = nuevoTitulo;
    }
    
    public void modificarDuracion(int cantidadAnuncios){
        duracionMinutos = duracionMinutos + cantidadAnuncios * 2;
    }
    
    public void cambiarIdioma(){
        idiomaOriginal = !idiomaOriginal;
    }
}