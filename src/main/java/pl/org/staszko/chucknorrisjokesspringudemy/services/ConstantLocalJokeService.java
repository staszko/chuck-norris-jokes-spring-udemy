package pl.org.staszko.chucknorrisjokesspringudemy.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ConstantLocalJokeService implements JokeService {

    @Override
    public String drawJoke() {
        return "Funny Jack Norris joke";
    }

}
