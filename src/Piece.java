public class Piece {
    private int nbSide;
    private String color;
    public Piece(int nbSide){
        this.nbSide = nbSide;
    }
    public Piece(int nbSide, String color) {
        this.nbSide = nbSide;
        this.color = color;
    }
    public int getNbSide() {
        return this.nbSide;
    }
    public String getColor() { return this.color;}
}
