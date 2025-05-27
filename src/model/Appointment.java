package model;

import enumes.ServiceType;

import java.time.LocalTime;
import java.util.Queue;

public class Appointment {
    private String customerName;
    private ServiceType serviceType;
    private LocalTime preferredTime;
    private int priority;

    public Appointment(String customerName, ServiceType serviceType, LocalTime preferredTime, int priority) {
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.preferredTime = preferredTime;
        this.priority = priority;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public LocalTime getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(LocalTime preferredTime) {
        this.preferredTime = preferredTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String toString(){
        return "{Customer name: " + customerName + ", service type: " + serviceType + ", preferred time: "
                + preferredTime + ", priority: " + priority + "}";
    }
}
