class Tennis extends Sport {
    private int numOfPlayers;
    
    public Tennis(String name, int numOfPlayers) {
        super(name);
        this.numOfPlayers = numOfPlayers;
    }
    
    public int getNumOfPlayers() {
        return numOfPlayers;
    }
    
    @Override
    public void play() {
        System.out.println("Playing tennis...");
    }
}