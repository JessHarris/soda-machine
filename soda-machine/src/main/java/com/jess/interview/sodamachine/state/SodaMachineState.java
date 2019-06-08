package com.jess.interview.sodamachine.state;

import com.jess.interview.sodamachine.entity.Message;

public interface SodaMachineState {

    Message insertCoin();

    Message ejectsQuarter();

    Message pressButton(int count);

    Message dispenseSoda(int id);
}
