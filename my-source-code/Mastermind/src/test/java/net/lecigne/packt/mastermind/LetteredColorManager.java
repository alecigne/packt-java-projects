package net.lecigne.packt.mastermind;

public class LetteredColorManager extends ColorManager {

    public LetteredColorManager(int nrColors) {
        super(nrColors);
    }

    @Override
    protected Color newColor() {
        return new LetteredColor();
    }

}
