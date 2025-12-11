package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;
@Getter
public class PackageManager {
    private String name = "minimal";
    private String version = "0.1.0";
    private boolean isPrivate = false;

    private Map<String, String> dependencies = Map.of();

    private Map<String, String> devDependencies = Map.of(
            "typescript", "~5.8.0"
    );

}

