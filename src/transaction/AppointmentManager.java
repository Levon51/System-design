package transaction;

import enumes.ServiceType;
import model.Appointment;

import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> apps = new ArrayList<>();
    public void viewAllAppointments(){
     for(Appointment a : apps){
         System.out.println("Appointment" + a);
     }
    }
    public Appointment getNextAppointment(){
        if(apps.isEmpty()){
            return null;
        }
        Appointment n = apps.get(0);
        for(Appointment a : apps){
            if(a.getPreferredTime().isBefore(n.getPreferredTime()))
                n = a;
        }
        return n;
    }

    public void scheduleAppointment(Appointment appointment){
       apps.add(appointment);
    }
}
