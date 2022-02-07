package TwitchBot;

import io.github.cdimascio.dotenv.Dotenv;

public interface TwitchBotResources {
    Dotenv dotenv = Dotenv.configure()
            .directory("src\\java\\main\\resources")
            .filename(".env")
            .load();
}
