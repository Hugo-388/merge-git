package fr.uga.miage.l3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Merge4Test {

    @Test
    void goodMerge(){
        Assertions.assertTrue((new PackageManager()).getDevDependencies().containsKey("typescript"));
        Assertions.assertEquals("~5.8.0",(new PackageManager()).getDevDependencies().get("typescript"));
    }
}
