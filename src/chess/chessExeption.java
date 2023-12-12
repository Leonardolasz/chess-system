package chess;

import java.io.Serial;

public class chessExeption extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public chessExeption(String msg) {
        super(msg);
    }
}
