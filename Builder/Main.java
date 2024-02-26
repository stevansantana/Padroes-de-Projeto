public class Main {
    
    public static void main(String[] args) {
        CasaBuilder builder = new CasaBuilderImpl();

        Casa casa1 = builder.setQuartos(3)
                             .setBanheiros(2)
                             .setPiscina(false)
                             .setJardim(true)
                             .build();

        Casa casa2 = builder.setQuartos(4)
                             .setBanheiros(3)
                             .setPiscina(true)
                             .setJardim(false)
                             .build();

        System.out.println(casa1);
        System.out.println(casa2);
    }
}