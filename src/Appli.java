import java.util.Scanner;


public class Appli {
    private static String[] colors;
    private static String[] colorsAdj;
    private static Piece[] pieces;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        initializeColor();
        int nbSide = input.nextInt();
        Piece MissingPiece = new Piece(nbSide);
        initializeColorAdj(nbSide);
        int nbPiece = input.nextInt();
        initializePieces(nbPiece);
        System.out.println(matchingPiece(MissingPiece));

    }
    public static void initializeColor() {
        int nbColors = input.nextInt();
        colors = new String[nbColors+1];
        for (int i = 0; i < nbColors; i++) {
            String color = input.next();
            colors[i] = color;
        }
    }
    public static void initializeColorAdj(int number)   {
        colorsAdj = new String[number];
        for (int i = 0; i < number; i++) {
            String color = input.next();
            colorsAdj[i]=color;
        }
    }
    public static void initializePieces(int number) {
        pieces = new Piece[number];
        for(int i = 0; i < number; i++) {
            int nbSide = input.nextInt();
            String color = input.next();
            pieces[i] = new Piece(nbSide, color);
        }

    }
    public static String matchingPiece(Piece piece) {
        String pattern = "";
        int iterator = 0;
        for (int i = 0 ; i < pieces.length; i++) {
            if(pieces[i].getNbSide() == piece.getNbSide() && !pieces[i].getColor().contains(colorsAdj.toString())) {
                pattern += "O";
                iterator++;

            }
             else
                 pattern += "X";
        }

        return pattern + "\n" + iterator;
    }


}