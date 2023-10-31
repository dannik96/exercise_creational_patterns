package cvut.fel.omo.patterns.factories;

public interface AbstractFactory<R>{
    R create();
    R createFromPrototype(R prototype);
}
