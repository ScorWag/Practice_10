import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

public class MovieManagerFindLastTest {
    MovieManager manager = new MovieManager();
    MovieManager managerFiveLimit = new MovieManager(5);

    MovieManager managerFifteenLimit = new MovieManager(15);

    @Test

    void shouldFindLastDefaultWithElevenElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
        MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");
        MovieItem movieSeven = new MovieItem(7, "Terminator", "Action");
        MovieItem movieEight = new MovieItem(8, "Forrest Gump", "Drama");
        MovieItem movieNine = new MovieItem(9, "The Mask", "Comedy");
        MovieItem movieTen = new MovieItem(10, "Terminator", "Action");
        MovieItem movieEleven = new MovieItem(11, "Forrest Gump", "Drama");

        manager.add(movieFirst);
        manager.add(movieSecond);
        manager.add(movieThird);
        manager.add(movieFour);
        manager.add(movieFive);
        manager.add(movieSix);
        manager.add(movieSeven);
        manager.add(movieEight);
        manager.add(movieNine);
        manager.add(movieTen);
        manager.add(movieEleven);

        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = {movieEleven, movieTen, movieNine, movieEight, movieSeven, movieSix, movieFive, movieFour, movieThird, movieSecond};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastDefaultWithNineElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
        MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");
        MovieItem movieSeven = new MovieItem(7, "Terminator", "Action");
        MovieItem movieEight = new MovieItem(8, "Forrest Gump", "Drama");
        MovieItem movieNine = new MovieItem(9, "The Mask", "Comedy");

        manager.add(movieFirst);
        manager.add(movieSecond);
        manager.add(movieThird);
        manager.add(movieFour);
        manager.add(movieFive);
        manager.add(movieSix);
        manager.add(movieSeven);
        manager.add(movieEight);
        manager.add(movieNine);

        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = {movieNine, movieEight, movieSeven, movieSix, movieFive, movieFour, movieThird, movieSecond, movieFirst};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastDefaultWithTenElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
        MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");
        MovieItem movieSeven = new MovieItem(7, "Terminator", "Action");
        MovieItem movieEight = new MovieItem(8, "Forrest Gump", "Drama");
        MovieItem movieNine = new MovieItem(9, "The Mask", "Comedy");
        MovieItem movieTen = new MovieItem(10, "Terminator", "Action");


        manager.add(movieFirst);
        manager.add(movieSecond);
        manager.add(movieThird);
        manager.add(movieFour);
        manager.add(movieFive);
        manager.add(movieSix);
        manager.add(movieSeven);
        manager.add(movieEight);
        manager.add(movieNine);
        manager.add(movieTen);

        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = {movieTen, movieNine, movieEight, movieSeven, movieSix, movieFive, movieFour, movieThird, movieSecond, movieFirst};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastFiveLimitWithFiveElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");

        managerFiveLimit.add(movieFirst);
        managerFiveLimit.add(movieSecond);
        managerFiveLimit.add(movieThird);
        managerFiveLimit.add(movieFour);
        managerFiveLimit.add(movieFive);

        MovieItem[] actual = managerFiveLimit.findLast();
        MovieItem[] expected = {movieFive, movieFour, movieThird, movieSecond, movieFirst};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastFiveLimitWithSixElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
        MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");

        managerFiveLimit.add(movieFirst);
        managerFiveLimit.add(movieSecond);
        managerFiveLimit.add(movieThird);
        managerFiveLimit.add(movieFour);
        managerFiveLimit.add(movieFive);
        managerFiveLimit.add(movieSix);

        MovieItem[] actual = managerFiveLimit.findLast();
        MovieItem[] expected = {movieSix, movieFive, movieFour, movieThird, movieSecond};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastFiveLimitWithFourElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");

        managerFiveLimit.add(movieFirst);
        managerFiveLimit.add(movieSecond);
        managerFiveLimit.add(movieThird);
        managerFiveLimit.add(movieFour);

        MovieItem[] actual = managerFiveLimit.findLast();
        MovieItem[] expected = {movieFour, movieThird, movieSecond, movieFirst};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastFifteenLimitWithSixteenElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
        MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");
        MovieItem movieSeven = new MovieItem(7, "Terminator", "Action");
        MovieItem movieEight = new MovieItem(8, "Forrest Gump", "Drama");
        MovieItem movieNine = new MovieItem(9, "The Mask", "Comedy");
        MovieItem movieTen = new MovieItem(10, "Terminator", "Action");
        MovieItem movieEleven = new MovieItem(11, "Forrest Gump", "Drama");
        MovieItem movieTwelve = new MovieItem(12, "Terminator", "Action");
        MovieItem movieThirteen = new MovieItem(13, "Forrest Gump", "Drama");
        MovieItem movieFourteen = new MovieItem(14, "The Mask", "Comedy");
        MovieItem movieFifteen = new MovieItem(15, "Terminator", "Action");
        MovieItem movieSixteen = new MovieItem(16, "Forrest Gump", "Drama");

        managerFifteenLimit.add(movieFirst);
        managerFifteenLimit.add(movieSecond);
        managerFifteenLimit.add(movieThird);
        managerFifteenLimit.add(movieFour);
        managerFifteenLimit.add(movieFive);
        managerFifteenLimit.add(movieSix);
        managerFifteenLimit.add(movieSeven);
        managerFifteenLimit.add(movieEight);
        managerFifteenLimit.add(movieNine);
        managerFifteenLimit.add(movieTen);
        managerFifteenLimit.add(movieEleven);
        managerFifteenLimit.add(movieTwelve);
        managerFifteenLimit.add(movieThirteen);
        managerFifteenLimit.add(movieFourteen);
        managerFifteenLimit.add(movieFifteen);
        managerFifteenLimit.add(movieSixteen);

        MovieItem[] actual = managerFifteenLimit.findLast();
        MovieItem[] expected = {movieSixteen, movieFifteen, movieFourteen, movieThirteen, movieTwelve, movieEleven, movieTen, movieNine, movieEight, movieSeven, movieSix, movieFive, movieFour, movieThird, movieSecond};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastFifteenLimitWithFifteenElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
        MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");
        MovieItem movieSeven = new MovieItem(7, "Terminator", "Action");
        MovieItem movieEight = new MovieItem(8, "Forrest Gump", "Drama");
        MovieItem movieNine = new MovieItem(9, "The Mask", "Comedy");
        MovieItem movieTen = new MovieItem(10, "Terminator", "Action");
        MovieItem movieEleven = new MovieItem(11, "Forrest Gump", "Drama");
        MovieItem movieTwelve = new MovieItem(12, "Terminator", "Action");
        MovieItem movieThirteen = new MovieItem(13, "Forrest Gump", "Drama");
        MovieItem movieFourteen = new MovieItem(14, "The Mask", "Comedy");
        MovieItem movieFifteen = new MovieItem(15, "Terminator", "Action");

        managerFifteenLimit.add(movieFirst);
        managerFifteenLimit.add(movieSecond);
        managerFifteenLimit.add(movieThird);
        managerFifteenLimit.add(movieFour);
        managerFifteenLimit.add(movieFive);
        managerFifteenLimit.add(movieSix);
        managerFifteenLimit.add(movieSeven);
        managerFifteenLimit.add(movieEight);
        managerFifteenLimit.add(movieNine);
        managerFifteenLimit.add(movieTen);
        managerFifteenLimit.add(movieEleven);
        managerFifteenLimit.add(movieTwelve);
        managerFifteenLimit.add(movieThirteen);
        managerFifteenLimit.add(movieFourteen);
        managerFifteenLimit.add(movieFifteen);

        MovieItem[] actual = managerFifteenLimit.findLast();
        MovieItem[] expected = {movieFifteen, movieFourteen, movieThirteen, movieTwelve, movieEleven, movieTen, movieNine, movieEight, movieSeven, movieSix, movieFive, movieFour, movieThird, movieSecond, movieFirst};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastFifteenLimitWithFourteenElements() {

        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
        MovieItem movieFour = new MovieItem(4, "Terminator", "Action");
        MovieItem movieFive = new MovieItem(5, "Forrest Gump", "Drama");
        MovieItem movieSix = new MovieItem(6, "The Mask", "Comedy");
        MovieItem movieSeven = new MovieItem(7, "Terminator", "Action");
        MovieItem movieEight = new MovieItem(8, "Forrest Gump", "Drama");
        MovieItem movieNine = new MovieItem(9, "The Mask", "Comedy");
        MovieItem movieTen = new MovieItem(10, "Terminator", "Action");
        MovieItem movieEleven = new MovieItem(11, "Forrest Gump", "Drama");
        MovieItem movieTwelve = new MovieItem(12, "Terminator", "Action");
        MovieItem movieThirteen = new MovieItem(13, "Forrest Gump", "Drama");
        MovieItem movieFourteen = new MovieItem(14, "The Mask", "Comedy");

        managerFifteenLimit.add(movieFirst);
        managerFifteenLimit.add(movieSecond);
        managerFifteenLimit.add(movieThird);
        managerFifteenLimit.add(movieFour);
        managerFifteenLimit.add(movieFive);
        managerFifteenLimit.add(movieSix);
        managerFifteenLimit.add(movieSeven);
        managerFifteenLimit.add(movieEight);
        managerFifteenLimit.add(movieNine);
        managerFifteenLimit.add(movieTen);
        managerFifteenLimit.add(movieEleven);
        managerFifteenLimit.add(movieTwelve);
        managerFifteenLimit.add(movieThirteen);
        managerFifteenLimit.add(movieFourteen);

        MovieItem[] actual = managerFifteenLimit.findLast();
        MovieItem[] expected = {movieFourteen, movieThirteen, movieTwelve, movieEleven, movieTen, movieNine, movieEight, movieSeven, movieSix, movieFive, movieFour, movieThird, movieSecond, movieFirst};

        Assertions.assertArrayEquals (expected, actual);
    }

    @Test

    void shouldFindLastDefaultWithoutElements() {

        MovieItem[] items = manager.findLast();
        int actual = items.length;
        int expected = 0;

        Assertions.assertEquals (expected, actual);
    }

    @Test

    void shouldFindLastFiveLimitWithoutElements() {

        MovieItem[] items = managerFiveLimit.findLast();
        int actual = items.length;
        int expected = 0;

        Assertions.assertEquals (expected, actual);
    }

    @Test

    void shouldFindLastFifteenLimitWithoutElements() {

        MovieItem[] items = managerFifteenLimit.findLast();
        int actual = items.length;
        int expected = 0;

        Assertions.assertEquals (expected, actual);
    }
}
