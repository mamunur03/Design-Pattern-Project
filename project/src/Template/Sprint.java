package Template;

import Template.Race;
import Track.Track;

public class Sprint extends Race {

    @Override
    protected void startLine(Track track) {
        System.out.println("At the finish line of " + track.getClass().getSimpleName() + " in sprint racing");
    }

    @Override
    protected void finishLine(Track track) {
        System.out.println("Crossing the finish line of " + track.getClass().getSimpleName() + " in sprint racing");
    }
}

