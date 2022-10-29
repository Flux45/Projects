package Projects.TicTacToe.Strategies.BotPlayingStrategy;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;
import Projects.TicTacToe.Models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
