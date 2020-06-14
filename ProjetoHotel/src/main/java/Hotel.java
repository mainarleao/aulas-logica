/**
 * @author Mainar Leão
 * @since 06/06/2020 - 18:00
 * @version 1.0
 */
public class Hotel {

    private String hospede;
    private String telefone;
    private int periodo;
    private int tipoQuarto;
    private long CPF;

    /**
     * construtor vazio
     */
    public Hotel() {
    }

    /**
     * construtor cheio
     * @param hospede
     * @param telefone
     * @param periodo
     * @param CPF
     * @param tipoQuarto
     */
    public Hotel(String hospede, String telefone, int periodo, long CPF, int tipoQuarto) {
        this.hospede = hospede;
        this.telefone = telefone;
        this.periodo = periodo;
        this.CPF = CPF;
        this.tipoQuarto = tipoQuarto;
    }

    /**
     *
     * @return metodos getter e setter
     */
    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo > 0 ? periodo : 0;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public int getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(int tipoQuarto) {
        this.tipoQuarto = tipoQuarto > 0 && tipoQuarto < 4 ? tipoQuarto : 0;
    }

    /**
     *
     * @return retorna o valor da estadia a ser paga pelo cliente
     */
    public String calcularvalorEstadia() {
        if (tipoQuarto == 1) {
            return "O valor a Pagar é de: R$" + periodo * 350;
        } else if (tipoQuarto == 2) {
            return "O valor a Pagar é de: R$" + periodo * 250;
        } else if (tipoQuarto == 3) {
            return "O valor a Pagar é de: R$" + periodo * 150;
        }
        return "Dados Inválidos";
    }

    /**
     *
     * @return mostrar os dados ao cliente
     */
    @Override
    public String toString() {
        return "\nNome do Hospede: " + this.hospede
             + "\nCPF: " + this.CPF
             + "\nTelefone: " + this.telefone;
    }
}
