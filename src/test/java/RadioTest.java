import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {

    @Test
    public void testSetStation () {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetVolume () {
        Radio radio = new Radio();

        radio.setCurrentVolume(27);

        int expected = 27;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNextStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNextVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.nextVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testPrevVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testPrevStaton () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();
        int expected = 9;
        Assertions.assertEquals(expected,radio.getCurrentStation());
    }

    @Test
    public void testStationCount () {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

}
