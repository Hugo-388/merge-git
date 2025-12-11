package fr.uga.miage.l3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Merge5Test {

    @Test
    void goodMerge(){
        Assertions.assertTrue((new PackageManager()).getDependencies().containsKey("lodash"));
        Assertions.assertEquals("^4.17.21",(new PackageManager()).getDependencies().get("lodash"));

        Assertions.assertTrue((new PackageManager()).getDevDependencies().containsKey("eslint"));
        Assertions.assertEquals("^9.0.0",(new PackageManager()).getDevDependencies().get("eslint"));
    }
}
