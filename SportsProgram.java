public class SportsProgram {
    public static void main(String[] args) {
        Football football = new Football("Football", 11);
        Tennis tennis = new Tennis("Tennis", 2);
        
        Player player1 = new Player("John");
        Player player2 = new Player("Emily");
        
        player1.playSport(football);
        player2.playSport(tennis);
    }
}