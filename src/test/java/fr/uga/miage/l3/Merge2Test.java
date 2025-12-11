package fr.uga.miage.l3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Merge2Test {
    @Test
    void goodMerge(){
        Assertions.assertTrue((new PackageManager()).getDependencies().containsKey("@angular/forms"));
        Assertions.assertEquals("^20.5.0",(new PackageManager()).getDependencies().get("@angular/forms"));
    }
}
