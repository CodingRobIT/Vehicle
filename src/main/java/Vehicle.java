public abstract class Vehicle implements Accelerateable {

    @Override
    public int accelerateable(int kmh) {
        return 0;
    }

    int id;
    String vehicleName;
    int velocity;

    public Vehicle(int id, String vehicleName, int velocity) {
        this.id = id;
        this.vehicleName = vehicleName;
        this.velocity = velocity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;

        if (getId() != vehicle.getId()) return false;
        if (getVelocity() != vehicle.getVelocity()) return false;
        return getVehicleName() != null ? getVehicleName().equals(vehicle.getVehicleName()) : vehicle.getVehicleName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getVehicleName() != null ? getVehicleName().hashCode() : 0);
        result = 31 * result + getVelocity();
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + vehicleName + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
