class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {

        Flyweight flyweight = flyweights.get(key);

        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        
        return flyweight;
    }
}