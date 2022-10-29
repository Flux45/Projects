package Projects.TicTacToe.Factory;

import Projects.TicTacToe.Models.BotDifficultyLevel;
import Projects.TicTacToe.Strategies.BotPlayingStrategy.BotPlayingStrategy;
import Projects.TicTacToe.Strategies.BotPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(
            BotDifficultyLevel botDifficultyLevel
    ) {
        return new RandomBotPlayingStrategy();
    }
}
