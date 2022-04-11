package DAConcepts.MM;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class TwilioCaller {
    public static void sendText() {
        HttpResponse<JsonNode> response = Unirest.post("https://api.twilio.com/2010-04-01/Accounts/AC413dc62945d508fb714a99dfb9c0487f/Messages.json")
                .basicAuth("AC413dc62945d508fb714a99dfb9c0487f","57039f418c0c7b96c68a889589ac5a93")
                .field("To","+15616678490")
                .field("MessagingServiceSid","MGac32daa96adb732c67be7756cd14f441")
                .field("Body","shouldve teched it L+ratio bozo")
                .asJson();
        System.out.println(response.getStatus());
        System.out.println(response.getBody());
    }
}
