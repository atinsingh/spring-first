package io.pragra.learning.springfirst.domain;

// Inversion
// Application Context

public class PetrolEngine implements IEngine {
    private String engineType;

    public PetrolEngine(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public double getEnginePower() {
        return 200;
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
