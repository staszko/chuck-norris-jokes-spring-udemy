package pl.org.staszko.chucknorrisjokesspringudemy.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ChuckNorrisJokeService implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String drawJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
