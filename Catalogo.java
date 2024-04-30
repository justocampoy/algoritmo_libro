import java.util.ArrayList;

/**
 * Write a description of class Catalogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catalogo
{
    // instance variables - replace the example below with your own
    private ArrayList<String> biblioteca;
    public Catalogo()
    {
        biblioteca = new ArrayList<>();
    }
    
    public void addLibros(String libros)
    {
        biblioteca.add(libros);
    }
    
    public void removeLibros(int index){
        if(index >= 0 && index <  biblioteca.size()){
        biblioteca.remove(index);
    }
    }
    
    public int cantLibros(){
        return biblioteca.size();
    }
    
    public void listLibros(int index){
        if(index >= 0 && index <  biblioteca.size()){
            String libroName = biblioteca.get(index);
            System.out.println(libroName);
        }
    }
    
    public void mostrarCatalogo(){
        String catalogoLibros = "";
        for(String libros  : biblioteca){
            catalogoLibros += libros;
            System.out.println(libros);
        }
    }
}
