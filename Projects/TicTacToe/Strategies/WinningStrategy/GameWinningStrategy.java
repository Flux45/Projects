package Projects.TicTacToe.Strategies.WinningStrategy;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;

public interface GameWinningStrategy {

    boolean checkVictory(Board board, Move lastMove);
}
