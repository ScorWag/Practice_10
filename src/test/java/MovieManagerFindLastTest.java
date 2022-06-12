import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;
import ru.netology.repository.MovieRepository;

import static org.mockito.Mockito.doReturn;

public class MovieManagerFindLastTest {

    private MovieRepository repository = Mockito.mock(MovieRepository.class);
    private MovieManager manager = new MovieManager(repository);
    private MovieManager managerFiveLimit = new MovieManager(repository, 5);

    private MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
    private MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
    private MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
    private MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
    private MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
    private MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");
    private MovieItem movieSeven = new MovieItem(7, "Terminator", "Action");
    private MovieItem movieEight = new MovieItem(8, "Forrest Gump", "Drama");
    private MovieItem movieNine = new MovieItem(9, "The Mask", "Comedy");
    private MovieItem movieTen = new MovieItem(10, "Terminator", "Action");
    private MovieItem movieEleven = new MovieItem(11, "Forrest Gump", "Drama");

    @Test
    void shouldFindLastDefault() {
        MovieItem[] returned = {movieFirst, movieSecond, movieThird, movieFour, movieFive, movieSix, movieSeven, movieEight, movieNine, movieTen, movieEleven};
        doReturn(returned).when(repository).findAll();

        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = {movieEleven, movieTen, movieNine, movieEight, movieSeven, movieSix, movieFive, movieFour, movieThird, movieSecond};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindLastFiveLimit() {
        MovieItem[] returned = {movieFirst, movieSecond, movieThird, movieFour, movieFive, movieSix, movieSeven, movieEight, movieNine, movieTen, movieEleven};
        doReturn(returned).when(repository).findAll();

        MovieItem[] actual = managerFiveLimit.findLast();
        MovieItem[] expected = {movieEleven, movieTen, movieNine, movieEight, movieSeven};

        Assertions.assertArrayEquals(expected, actual);
    }
}
