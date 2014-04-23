package org.sample.remotelocal;

import javax.ejb.Stateless;

@Stateless
public class CoffeeFacadeBean implements CoffeeFacade.Local, CoffeeFacade.Remote {

    @Override
    public String drinkLocalCoffee() {
        return "drinking Wacker's Kaffee";
    }

    @Override
    public String drinkRemoteCoffee() {
        return "drinking Starbucks";
    }

}
