/**
 * Objeto que representa um gato do mundo real
 * 
 * @author gustavo
 * @version 1.0
 * @
 */
public class Gato {
    private String personalidade;
    private String cor;
    private int patas;
    private int orelhas;
    private boolean comFome;

    public String getCor() {
        return cor;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public int getPatas() {
        return patas;
    }

    public int getOrelhas() {
        return orelhas;
    }

    public boolean isComFome() {
        return comFome;
    }

    public void setComFome(boolean comFome) {
        this.comFome = comFome;
    }
}
