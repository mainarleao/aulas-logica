import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Mainar Leão
 * @since 06/06/2020 - 18:30
 * @version 1.0
 */
class HotelTest {

    Hotel hotel = new Hotel();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        hotel.setTipoQuarto(1);
        hotel.setPeriodo(10);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * metodo de teste para os metodo calcularvalorEstadia()
     */
    @org.junit.jupiter.api.Test
    void calcularvalorEstadia() {
        assertEquals("O valor a Pagar é de: R$3500", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(2);
        assertEquals("O valor a Pagar é de: R$2500", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(3);
        assertEquals("O valor a Pagar é de: R$1500", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(2);
        hotel.setPeriodo(7);
        assertEquals("O valor a Pagar é de: R$1750", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(0);
        hotel.setPeriodo(7);
        assertEquals("Dados Inválidos", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(-10);
        hotel.setPeriodo(5);
        assertEquals("Dados Inválidos", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(3);
        hotel.setPeriodo(0);
        assertEquals("O valor a Pagar é de: R$0", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(3);
        hotel.setPeriodo(-50);
        assertEquals("O valor a Pagar é de: R$0", hotel.calcularvalorEstadia());

        hotel.setTipoQuarto(0);
        hotel.setPeriodo(0);
        assertEquals("Dados Inválidos", hotel.calcularvalorEstadia());
    }
}