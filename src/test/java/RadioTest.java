import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {

    @Test
    public void testSetRadioStation_validStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        Assertions.assertEquals(7,radio.getCurrentStation());
    }
    @Test
    public void testSetRadioStation_validMinStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        Assertions.assertEquals(0,radio.getCurrentStation());
    }
    @Test
    public void testSetRadioStation_validStation1 () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        Assertions.assertEquals(1,radio.getCurrentStation());
    }
    @Test
    public void testSetRadioStation_validMaxStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        Assertions.assertEquals(9,radio.getCurrentStation());
    }
    @Test
    public void testSetRadioStation_validStation8 () {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        Assertions.assertEquals(8,radio.getCurrentStation());
    }
    @Test
    public void testSetRadioStation_invalidMinStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        Assertions.assertEquals(0,radio.getCurrentStation());
    }
    @Test
    public void testSetRadioStation_invalidMaxStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0,radio.getCurrentStation());
    }


    @Test
    public void testSetVolume_validVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(27);
        Assertions.assertEquals(27, radio.getCurrentVolume());
    }
    @Test
    public void testSetVolume_validMinVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void testSetVolume_invalidMinVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void testSetVolume_validVolume1 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void testSetVolume_validMaxVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void testSetVolume_invalidMaxVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void testSetVolume_validVolume99 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        Assertions.assertEquals(99, radio.getCurrentVolume());
    }


    @Test
    public void testNextStation_validStationNot9 () {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.nextStation();
        Assertions.assertEquals(8,radio.getCurrentStation());
    }
    @Test
    public void testNextStation_validMaxStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0,radio.getCurrentStation());
    }
    @Test
    public void testNextStation_validMinStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1,radio.getCurrentStation());
    }

    @Test
    public void testNextVolume_validVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(54);
        radio.nextVolume();
        Assertions.assertEquals(55,radio.getCurrentVolume());
    }
    @Test
    public void testNextVolume_maxVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();
        Assertions.assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    public void testNextVolume_volume99 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.nextVolume();
        Assertions.assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    public void testNextVolume_minVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        Assertions.assertEquals(1,radio.getCurrentVolume());
    }

    @Test
    public void testPrevVolume_validVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);
        radio.prevVolume();
        Assertions.assertEquals(24,radio.getCurrentVolume());
    }
    @Test
    public void testPrevVolume_minVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        Assertions.assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    public void testPrevVolume_validVolume1 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.prevVolume();
        Assertions.assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    public void testPrevVolume_maxVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.prevVolume();
        Assertions.assertEquals(99,radio.getCurrentVolume());
    }

    @Test
    public void testPrevStaton_validStationNot0 () {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        Assertions.assertEquals(4,radio.getCurrentStation());
    }
    @Test
    public void testPrevStaton_validMinStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void testPrevStaton_validMaxStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }
}
