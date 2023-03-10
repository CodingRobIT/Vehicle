public abstract class Vehicle implements Accelerateable {

    @Override
    public int accelerateable(int kmh) {
        return 0;
    }

    int id;
    String name;
    int velocity;

    public Vehicle(int id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return getName() != null ? getName().equals(vehicle.getName()) : vehicle.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getVelocity();
        return result;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
