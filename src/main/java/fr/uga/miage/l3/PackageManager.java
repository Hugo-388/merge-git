package fr.uga.miage.l3;

import java.util.Map;

public record PackageManager(
        String name,
        String version,
        boolean isPrivate,
        Map<String, String> dependencies,
        Map<String, String> devDependencies
) {
    public PackageManager() {
        this(
                "ng-app",
                "1.0.0",
                true,
                Map.of("@angular/core", "^21.0.0"),
                Map.of("@angular/cli", "^21.0.0")
        );
    }
}

