package DAConcepts.MM;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import java.util.HashMap;

public class SpotiFIVEassignment {
    private static String token = "BQB8VPpvR1oaBftqS-2pWVT5-1JlEruAxdXt9cVBflBA0FVJQfDj-MdD3v-bBaKrgfnzkZJh-Kh76rWAQFi7wMmCDuQSCZPgNBlDt9CdFD1XSvKsnrYbjqd_2bJeCHP-9mnfKxlvWjOA91JH2Nj9Sw0GQ5jdcGi_wBs";

    public static void searchSong(String name) {
        HttpResponse<JsonNode> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer " + token)
                .queryString("q",name)
                .queryString("type","song")
                .asJson();
        System.out.println(result.getStatus());
        System.out.println(result.getBody());
    }
    public static void searchAlbum(String name) {
        HttpResponse<JsonNode> result = Unirest.get("https://api.spotify.com/v1/search")
                .header("Authorization", "Bearer " + token)
                .queryString("q", name)
                .queryString("type", "album")
                .asJson();
        System.out.println(result.getStatus());
        System.out.println(result.getBody());
    }
    public static void getNewReleases() {
        HttpResponse<JsonNode> result = Unirest.get("https://api.spotify.com/v1/browse/new-releases")
                .header("Authorization", "Bearer " + token)
                .asJson();
        System.out.println(result.getStatus());
        System.out.println(result.getBody());
    }
    public static void yaLikeJazz() {
        HttpResponse<JsonNode> result = Unirest.get("https://api.spotify.com/v1/recommendations")
                .queryString("seed_artists","0AmBT7fJDVHS4BshgbY8Aw")
                .queryString("seed_genres","jazz")
                .queryString("seed_tracks","2FQbTK8lcvEPtGbjiOjfuz")
                .header("Authorization", "Bearer " + token)
                .asJson();
        System.out.println(result.getStatus());
        System.out.println(result.getBody());
    }
    public static void yaLikeJazzTheExtendedCut() {//playlists :o
        HttpResponse<JsonNode> result = Unirest.get("https://api.spotify.com/v1/browse/categories/jazz/playlists")
                .header("Authorization", "Bearer " + token)
                .asJson();
        System.out.println(result.getStatus());
        System.out.println(result.getBody());
    }
}