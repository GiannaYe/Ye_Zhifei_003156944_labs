/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Olive
 */

public class VitalSignHistory {
    ArrayList<VitalSign> history;

    public VitalSignHistory() {
        this.history = new ArrayList<>();
    }

    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }

    public VitalSign addNewVital() {
        VitalSign vs = new VitalSign();
        history.add(vs);
        return vs;
    }

    public void deleteVital(VitalSign vs) {
        history.remove(vs);
    }
}
