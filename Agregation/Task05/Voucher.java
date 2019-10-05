package by.htp.Aggregation.Task05;

public class Voucher {
    private Food food;
    private Transport transport;
    private TravelType type;
    private String destination;
    private int days;

    public Voucher(Food food, Transport transport, TravelType type, String destination, int days) {
	this.food = food;
	this.transport = transport;
	this.type = type;
	this.destination = destination;
	this.days = days;
    }

    public Food getFood() {
	return food;
    }

    public void setFood(Food food) {
	this.food = food;
    }

    public Transport getTransport() {
	return transport;
    }

    public void setTransport(Transport transport) {
	this.transport = transport;
    }

    public TravelType getType() {
	return type;
    }

    public void setType(TravelType type) {
	this.type = type;
    }

    public String getDestination() {
	return destination;
    }

    public void setDestination(String destination) {
	this.destination = destination;
    }

    public int getDays() {
	return days;
    }

    public void setDays(int days) {
	this.days = days;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + days;
	result = prime * result + ((destination == null) ? 0 : destination.hashCode());
	result = prime * result + ((food == null) ? 0 : food.hashCode());
	result = prime * result + ((transport == null) ? 0 : transport.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Voucher other = (Voucher) obj;
	if (days != other.days)
	    return false;
	if (destination == null) {
	    if (other.destination != null)
		return false;
	} else if (!destination.equals(other.destination))
	    return false;
	if (food != other.food)
	    return false;
	if (transport != other.transport)
	    return false;
	if (type != other.type)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Voucher [food=" + food + ", transport=" + transport + ", type=" + type + ", destination=" + destination
		+ ", days=" + days + "]";
    }
}
