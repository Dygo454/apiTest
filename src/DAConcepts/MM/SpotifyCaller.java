package DAConcepts.MM;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.util.HashMap;

public class SpotifyCaller {
    private static String token = "BQB8VPpvR1oaBftqS-2pWVT5-1JlEruAxdXt9cVBflBA0FVJQfDj-MdD3v-bBaKrgfnzkZJh-Kh76rWAQFi7wMmCDuQSCZPgNBlDt9CdFD1XSvKsnrYbjqd_2bJeCHP-9mnfKxlvWjOA91JH2Nj9Sw0GQ5jdcGi_wBs";

    public static void searchArtist() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + token);
        headers.put("q","Weezer");
        headers.put("type","artist");

        HttpResponse<JsonNode> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer " + token)
                .queryString("q","Weezer")
                .queryString("type","artist")
                .asJson();
        System.out.println(result.getStatus());
        System.out.println(result.getBody());
    }
}
