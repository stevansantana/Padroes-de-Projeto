public class CasaBuilderImpl implements CasaBuilder {
    
    private int quartos;
    private int banheiros;
    private boolean piscina;
    private boolean jardim;

    public CasaBuilderImpl() {}

    @Override
    public CasaBuilder setQuartos(int quartos) {
        this.quartos = quartos;
        return this;
    }

    @Override
    public CasaBuilder setBanheiros(int banheiros) {
        this.banheiros = banheiros;
        return this;
    }

    @Override
    public CasaBuilder setPiscina(boolean piscina) {
        this.piscina = piscina;
        return this;
    }

    @Override
    public CasaBuilder setJardim(boolean jardim) {
        this.jardim = jardim;
        return this;
    }

    @Override
    public Casa build() {
        return new Casa(quartos, banheiros, piscina, jardim);
    }
}