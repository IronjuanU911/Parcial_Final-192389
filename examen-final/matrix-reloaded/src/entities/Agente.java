package entities;
import java.util.ArrayList;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private ArrayList<String> Lista_misiones = new ArrayList<String>();

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
        Lista_misiones.add(mision);

    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }

    public String generarReporte() {
        String output_text = "["; //Variable de retorno
        int total_misiones = Lista_misiones.size();//Tamaño del array que contiene las misiones
        for (int i = 0; total_misiones >= i;i++){
            output_text = output_text + Lista_misiones.get(i);//Se añade en el texto a retornar la mision en cada ciclo
            if (total_misiones > i){
                output_text = output_text + ", ";//Se añade una coma y un espacio hasta que llege al penultimo ciclo (Porque es cuando es >, no >=) 
            }
        }
        output_text = output_text + "]"; //Cerramos el texto del output todo bonito :D
        return output_text;
    }
}
