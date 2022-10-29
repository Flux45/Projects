package Projects.TicTacToe.Factory;

import Projects.TicTacToe.Models.GameWinningStrategyName;
import Projects.TicTacToe.Strategies.WinningStrategy.GameWinningStrategy;
import Projects.TicTacToe.Strategies.WinningStrategy.NotGonnaWinGameStrategy;

public class GameWinningStrategyFactory {

    public static GameWinningStrategy
    getGameWinningStrategyByName(GameWinningStrategyName gameWinningStrategyName){
        return new NotGonnaWinGameStrategy();
    }
}
