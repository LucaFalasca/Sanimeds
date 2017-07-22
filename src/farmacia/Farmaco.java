package farmacia;

public class Farmaco {

    private String denominazione;
    private String azione;
    private Produzione modalitaProduzione;
    private FormaFarmaceutica formaFarmaceutica;
    private regimeFornitura regimeForitura;
    private RegimeRimborsabilita regimeRismborsabilita;
    private boolean brevetto;

    public Farmaco(String denominazione) {
        this.denominazione = denominazione;
    }
    
    public Farmaco(String denominazione, String azione, Produzione modalitaProduzione, FormaFarmaceutica formaFarmaceutica, regimeFornitura regimeForitura, RegimeRimborsabilita regimeRismborsabilita, boolean brevetto) {
        this.denominazione = denominazione;
        this.azione = azione;
        this.modalitaProduzione = modalitaProduzione;
        this.formaFarmaceutica = formaFarmaceutica;
        this.regimeForitura = regimeForitura;
        this.regimeRismborsabilita = regimeRismborsabilita;
        this.brevetto = brevetto;
    }
    
    public String getDenominazione() {
        return denominazione;
    }
    
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getAzione() {
        return azione;
    }

    public void setAzione(String azione) {
        this.azione = azione;
    }

    public Produzione getModalitaProduzione() {
        return modalitaProduzione;
    }

    public void setModalitaProduzione(Produzione modalitaProduzione) {
        this.modalitaProduzione = modalitaProduzione;
    }

    public FormaFarmaceutica getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(FormaFarmaceutica formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public regimeFornitura getRegimeForitura() {
        return regimeForitura;
    }

    public void setRegimeForitura(regimeFornitura regimeForitura) {
        this.regimeForitura = regimeForitura;
    }

    public RegimeRimborsabilita getRegimeRismborsabilita() {
        return regimeRismborsabilita;
    }

    public void setRegimeRismborsabilita(RegimeRimborsabilita regimeRismborsabilita) {
        this.regimeRismborsabilita = regimeRismborsabilita;
    }

    public boolean isBrevetto() {
        return brevetto;
    }

    public void setBrevetto(boolean brevetto) {
        this.brevetto = brevetto;
    }

}
