public class Casa {

    private int quartos;
    private int banheiros;
    private boolean piscina;
    private boolean jardim;

    public Casa(int quartos, int banheiros, boolean piscina, boolean jardim) {
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.piscina = piscina;
        this.jardim = jardim;
    }

    public int getQuartos() {
        return quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public boolean hasPiscina() {
        return piscina;
    }

    public boolean hasJardim() {
        return jardim;
    }

    @Override
    public String toString() {
        return "Casa [quartos=" + quartos + ", banheiros=" + banheiros + ", piscina=" + piscina + ", jardim=" + jardim + "]";
    }
}
