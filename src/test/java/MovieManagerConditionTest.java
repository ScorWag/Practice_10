//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import ru.netology.domain.MovieItem;
//import ru.netology.manager.MovieManager;
//
//public class MovieManagerConditionTest {
//
//    @Test
//    void withoutElements() {
//        MovieManager manager = new MovieManager();
//
//        MovieItem[] items = manager.findAll();
//        int actual = items.length;
//        int expected = 0;
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    void withOneElement() {
//        MovieManager manager = new MovieManager();
//
//        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
//
//        manager.add(movieFirst);
//        MovieItem[] actual = manager.findAll();
//        MovieItem[] expected = {movieFirst};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    void withThreeElement() {
//        MovieManager manager = new MovieManager();
//
//        MovieItem movieFirst = new MovieItem(1, "Terminator", "Action");
//        MovieItem movieSecond = new MovieItem(2, "Forrest Gump", "Drama");
//        MovieItem movieThird = new MovieItem(3, "The Mask", "Comedy");
//
//        manager.add(movieFirst);
//        manager.add(movieSecond);
//        manager.add(movieThird);
//        MovieItem[] actual = manager.findAll();
//        MovieItem[] expected = {movieFirst, movieSecond, movieThird};
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//}
