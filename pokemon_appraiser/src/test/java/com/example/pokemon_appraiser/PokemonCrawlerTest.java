package com.example.pokemon_appraiser;

import org.junit.jupiter.api.Test;

public class PokemonCrawlerTest {
    @Test
    void crawlTest() {
        for (String string : new String[] {"1500", "2500", "10000"}) {

            PokemonCrawler crawler = new PokemonCrawler();

            for (Pokemon pokemon : crawler.crawl(string)) {
                System.out.println(pokemon);
            }
        }
    }
}
