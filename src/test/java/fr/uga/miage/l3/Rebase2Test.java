package fr.uga.miage.l3;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

class Rebase2Test {

    @Test
    void goodRebase2(){
        JavaClasses importedClasses = new ClassFileImporter()
                .importPackages("fr.uga.miage.l3");

        // Vérifier que tous les champs sont private et final
        classes().that().haveSimpleName("PackageManager")
                .should()
                .beRecords()
                .check(importedClasses);
    }
}
