class Player {
    private String name;
    
    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void playSport(Sport sport) {
        System.out.println(name + " is playing " + sport.getName());
        sport.play();
    }
}