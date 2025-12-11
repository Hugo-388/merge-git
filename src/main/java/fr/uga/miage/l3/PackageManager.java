package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;
@Getter
public class PackageManager {
    private String name = "demo-app";
    private String version = "2.0.0";
    private boolean isPrivate = true;

    private Map<String, String> dependencies = Map.of(
            "lodash", "^4.17.21",
            "dayjs", "^1.11.10"
    );

    private Map<String, String> devDependencies = Map.of(
            "typescript", "~5.8.0"
            "eslint", "^9.0.0",
            "prettier", "^3.2.0"
    );

}

