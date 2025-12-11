package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;

@Getter
public class PackageManager {

    private final String name = "small-app";
    private final String version = "0.0.5";
    private final boolean isPrivate = true;

    private final Map<String, String> dependencies = Map.of(
            "zone.js", "~0.15.2"
    );

    private final Map<String, String> devDependencies = Map.of(
            "@angular/build", "^20.3.0"
    );
}

