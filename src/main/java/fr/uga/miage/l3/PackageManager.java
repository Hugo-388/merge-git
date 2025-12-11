package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;
@Getter
public class PackageManager {
    private final String name = "ng-app";
    private final String version = "1.0.0";
    private final boolean isPrivate = false;

    private final Map<String, String> dependencies = Map.of(
            "@angular/core", "^21.0.0",
            "zone.js", "~0.16.0"
    );

    private final Map<String, String> devDependencies = Map.of(
            "@angular/cli", "^21.0.0",
            "typescript", "~5.8.0",
            "eslint", "^9.0.0",
            "prettier", "^3.2.0"
    );

}

