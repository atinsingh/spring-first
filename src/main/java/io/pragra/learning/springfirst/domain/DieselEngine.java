package io.pragra.learning.springfirst.domain;


public class DieselEngine implements IEngine {
    private String engineType;

    public DieselEngine(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public double getEnginePower() {
        return 400;
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
