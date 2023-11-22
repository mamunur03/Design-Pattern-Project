package Template;

import Template.Race;
import Track.Track;

public class Circuit extends Race {

    @Override
    protected void startLine(Track track) {
        System.out.println("At the start line of " + track.getClass().getSimpleName() + " in circuit racing");
    }

    @Override
    protected void finishLine(Track track) {
        System.out.println("Crossing the start line of " + track.getClass().getSimpleName() + " in circuit racing");
    }
}

