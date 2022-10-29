package Projects.TicTacToe.Strategies.WinningStrategy;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;

public class NotGonnaWinGameStrategy implements GameWinningStrategy{

    @Override
    public boolean checkVictory(Board board, Move lastMove) {
        return false;
    }
}
