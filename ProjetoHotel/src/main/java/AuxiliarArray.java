import java.util.ArrayList;
import java.util.List;

/**
 * @author Mainar Leão
 * @since 06/06/2020 - 19:00
 * @version 1.0
 */
public class AuxiliarArray {

    List<Hotel> hotel;

    public AuxiliarArray() {
        hotel = new ArrayList<>();
    }

    /**
     * metodo para cadastrar itens no array
     * @param hotel
     */
    public  void  cadastrar(Hotel hotel) {
        this.hotel.add(hotel);
    }

    /**
     *
     * @return metodo para buscar itens no array
     */
    public List<Hotel> buscar() {
        return  this.hotel;
    }

    /**
     * metodo para filtrar itens no array
     * @param hotel
     * @param filtro
     * @return
     */
    public Hotel filtrar(Hotel hotel, int filtro) {
        switch (filtro) {
            case 1:
                for (Hotel hotel1 : this.hotel) {
                    if (hotel1.getHospede().contains(hotel.getHospede())) {
                        return hotel1;
                    }
                }
                break;
            case 2:
                for (Hotel hotel1 : this.hotel) {
                    if (hotel1.getCPF() == hotel.getCPF()) {
                        return hotel1;
                    }
                }
                break;
            case 3:
                for (Hotel hotel1 : this.hotel) {
                    if (hotel1.getTelefone().contains(hotel.getTelefone())) {
                        return hotel1;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    /**
     *
     * @return metodo para verificar a quantidade de itens no array
     */
    public  int verificarQuantidade() {
        return  this.hotel.size();
    }

    /**
     * metodo para apagar todos os itens no array
     */
    public void apagarLista() {
        this.hotel.clear();
    }

    /**
     * metodo para apagar um itens selecionado no array
     * @param index
     */
    public void apagarItem(int index) {
        this.hotel.remove(index);
    }

    /**
     * metodo para alterar itens no array
     * @param index
     * @param hotel
     */
    public  void alterar(int index, Hotel hotel) {
        this.hotel.add(index, hotel);
    }
}
