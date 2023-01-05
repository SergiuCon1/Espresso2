package ru.kkuzmichev.simpleappforespresso;

import androidx.test.espresso.idling.CountingIdlingResource;

public class EspressoIdlingResources {
    private static final String RESOURCE = "GLOBAL";
    public static CountingIdlingResource idlingResources = new CountingIdlingResource(RESOURCE);

    public static void increment() { idlingResources.increment(); }

    public static void decrement() {
        if (!idlingResources.isIdleNow()) {
            idlingResources.decrement();
        }
    }
}
