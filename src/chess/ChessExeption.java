package chess;

import boardgame.BoardException;

import java.io.Serial;


public class ChessExeption extends BoardException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ChessExeption(String msg) {
        super(msg);
    }
}
