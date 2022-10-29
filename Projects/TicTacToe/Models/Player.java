package Projects.TicTacToe.Models;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private PlayerType playerType;
    private String name;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Move makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What row (starting from 0)");
        Integer row = scanner.nextInt();

        System.out.println("What col (starting from 0)");
        Integer col = scanner.nextInt();

        Move move = new Move(row,col,this);

        return move;
    }
}
