package Code;

public enum SignalType {
    type("Wybierz typ sygnału lub szumu"),
    jedn("Szum o rozkłądzie jednostajnym"),
    gauss("Szum gaussowski"),
    sin("Sygnał sinusoidalny"),
    sin1("Sygnał sinusoidalny wyprostowany jednopołówkowo"),
    sin2("Sygnał sinusoidalny wyprostowany dwupołówkowo"),
    prost("Sygnał prostokątny"),
    prostsym("Sygnał prostokątny symetryczny"),
    troj("Sygnał trójkątny"),
    skok("Skok jednostkowy"),
    impulsjedn("Impuls jednostkowy"),
    szumimp("Szum impulsowy");

    private final String displayName;

    SignalType(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName() { return displayName;}
    @Override public String toString() { return displayName; }
}
