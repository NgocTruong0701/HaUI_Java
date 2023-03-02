/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CounterModel;
import view.CounterView;

/**
 *
 * @author Lê Ngọc Trường
 */
public class CounterController {

    CounterModel model = new CounterModel();

    public CounterController() {
    }
    
    public int getValueModel(){
        return model.getValue();
    }

    public CounterController(CounterModel model) {
        this.model = model;
    }

    public void increment() {
        int valueNew = model.getValue()+1;
        model.setValue(valueNew);
    }

    public void decrement() {
        int valueNew = model.getValue()-1;
        model.setValue(valueNew);
    }

    public void reset() {
        model.setValue(0);
    }
}
