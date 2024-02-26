class Game implements GameSubject {
    
    private List<GameObserver> observers = new ArrayList<>();
    private int score;

    public void setScore(int score) {
        this.score = score;
        notifyObservers();
    }

    public int getScore() {
        return score;
    }

    public void registerObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (GameObserver observer : observers) {
            observer.update(this);
        }
    }
}