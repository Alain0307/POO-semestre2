import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    ArrayList<Videojuego> datos;

    public ModeloTablaJuego(ArrayList<Videojuego> datos) {
        this.datos = datos;
    }

    public static final int COLS = 6;

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex){
            case 0:
                columnName = "Id";
                break;
            case 1:
                columnName = "Nombre";
                break;
            case 2:
                columnName = "Genero";
                break;
            case 3:
                columnName = "Peso";
                break;
            case 4:
                columnName = "Plataforma";
                break;
            case 5:
                columnName = "Desarrollador";
                break;
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Videojuego tmp = datos.get(rowIndex);
       switch (columnIndex){
           case 0:
               return tmp.getId();
           case 1:
               return tmp.getNombre();
           case 2:
               return tmp.getGenero();
           case 3:
               return tmp.getPesoenGb();
           case 4:
               return tmp.getPlatafroma();
           case 5:
               return tmp.getDesarrollador();
       }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarJuego(Videojuego juego){
        this.datos.add(juego);
    }
}
