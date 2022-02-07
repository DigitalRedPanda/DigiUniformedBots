package TwitchBot;

import io.github.cdimascio.dotenv.Dotenv;

public interface TwitchBotResources {
    Dotenv dotenv = Dotenv.configure()
            .directory("src\\java\\main\\resources")
            .filename(".env")
            .load();
    String DefaultChannel = dotenv.get("DEFAULT_CHANNEL");
    String Token = dotenv.get("TOKEN");
    String ClientSecret = dotenv.get("CLIENT_SECRET");
    String ClientID = dotenv.get("CLIENT_ID");
    String RedirectURL = dotenv.get("REDIRECT_URL");
    String SpecialGuest = dotenv.get("SPECIAL_GUEST");


}
