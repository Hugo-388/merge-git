package fr.uga.miage.l3;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;

class Merge6Test {

    @Test
    void goodMerge(){
        JavaClasses importedClasses = new ClassFileImporter()
                .importPackages("fr.uga.miage.l3");

        // Vérifier que tous les champs sont private et final
        fields().should().bePrivate().andShould().beFinal()
                .check(importedClasses);
    }
}
