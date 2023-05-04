package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        
        ChessMatch chessmatch = new ChessMatch();
        UI.printBoard(chessmatch.getPieces());
    }
    
}
