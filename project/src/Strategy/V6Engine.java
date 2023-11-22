package Strategy;

import Strategy.IEngine;

public class V6Engine implements IEngine {
    @Override
    public void accelerate() {
        System.out.println("V6 engine is accelerating.");
    }
}
