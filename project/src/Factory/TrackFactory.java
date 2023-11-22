package Factory;
import Track.*;
public class TrackFactory {
    public Track createTrack(String trackType) {
        if (trackType.equals("Track.BlueMoonBaySpeedway")) {
            return new BlueMoonBaySpeedway();
        } else if (trackType.equals("Track.BBRaceway")) {
            return new BBRaceway();
        } else if (trackType.equals("Track.CircuitDeSpaFrancophones")) {
            return new CircuitDeSpaFrancophones();
        } else {
            throw new IllegalArgumentException("Invalid track type: " + trackType);
        }
    }
}
