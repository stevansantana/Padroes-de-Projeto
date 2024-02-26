public interface CasaBuilder {
    
    public CasaBuilder setQuartos(int quartos);
    public CasaBuilder setBanheiros(int banheiros);
    public CasaBuilder setPiscina(boolean piscina);
    public CasaBuilder setJardim(boolean jardim);
    public Casa build();
}