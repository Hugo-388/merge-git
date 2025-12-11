package fr.uga.miage.l3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Merge3Test {

    @Test
    void goodMerge() {
        Assertions.assertTrue((new PackageManager()).getDependencies().containsKey("zone.js"));
        Assertions.assertEquals("~0.15.2", (new PackageManager()).getDependencies().get("zone.js"));
        Assertions.assertTrue((new PackageManager()).getDevDependencies().containsKey("@angular/build"));
        Assertions.assertEquals("^20.3.0", (new PackageManager()).getDevDependencies().get("@angular/build"));
    }
}
