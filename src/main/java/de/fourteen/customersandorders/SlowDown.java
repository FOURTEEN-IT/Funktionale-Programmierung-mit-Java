package de.fourteen.customersandorders;

public final class SlowDown {
    public static void slowDown() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
