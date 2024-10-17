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
    public boolean getIdioma() {
        return idiomaOriginal;
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
    
    public void imprimirEstado(){
        String idioma;
        if (idiomaOriginal){
            idioma = "Idioma original";
        } else {
            idioma = "Está doblada";
        }
        System.out.println("Titulo: " + titulo + " | Duración: " + duracionMinutos + " minutos | Idioma: " + idioma);
    }
    
    public String estadoPelicula(){
        String idioma;
        if (idiomaOriginal){
            idioma = "Idioma original";
        } else {
            idioma = "Está doblada";
        }
        String estadoPelicula = "Titulo: " + titulo + " | Duración: " + duracionMinutos + " minutos | Idioma: " + idiomaOriginal;
        return estadoPelicula;
    }
}