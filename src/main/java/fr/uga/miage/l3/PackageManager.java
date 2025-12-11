package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;

@Getter
public class PackageManager {

    private String name = "experimental-app";
    private String version = "alpha-0.2";
    private boolean isPrivate = false;

    private Map<String, String> dependencies = Map.of(
            "@angular/forms", "^20.5.0",
            "rxjs", "~8.0.0-alpha"
    );
    private Map<String, String> devDependencies = Map.of(
            "typescript", "~6.0.0-beta"
    );

}

