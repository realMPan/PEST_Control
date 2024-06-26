package com.PESTControl.States.StateTypes;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;

import com.PESTControl.StateMachine;
import com.PESTControl.States.State;


/**An exposed extension of the abstract State class designed for implementation of Custom Movement methods. <p> 
 * Good for more advanced teams that want greater control over how their States attempt to reach their set goals. This State offer full control over how its progress is tracked and how it moves to its target*/
public class CustomState extends State {
    
    /**
     * Initializes a State Object
     * @param name
     * The name of the state, useful for Dashboard debugging
     * @param target
     * The target of the state. As a majority of encoders report values doubles, this value must be a double
     * @param currentValueGetter
     * A DoubleSupplier that tracks the current value of the subsystem relative to its target
     * @param controlFunction
     * A Runnable that will be called in the states move() method. Allows for high customization of how a State moves
     */
    public CustomState(String name, double target, DoubleSupplier currentValueGetter, Runnable controlFunction) {
        super(name, target, currentValueGetter,controlFunction);
    }
    
}
