public abstract class Vehicle implements Serviceable {
    protected String modelName;
    protected int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + getModelName());
    }
}
