package ch.heigvd.amt.fishing;

import static org.junit.jupiter.api.Assertions.*;

class FishermanTest {

  @org.junit.jupiter.api.Test
  void goGetFish() {
    Fisherman fisherman = new Fisherman();
    Fish fish = fisherman.goGetFish();
    assertNotNull(fish);
  }
}