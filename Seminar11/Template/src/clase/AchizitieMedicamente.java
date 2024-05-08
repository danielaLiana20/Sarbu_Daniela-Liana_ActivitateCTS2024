package clase;

import java.util.HashMap;
import java.util.Map;

public abstract class AchizitieMedicamente {
    Map<String,Integer> stocuri;

    public AchizitieMedicamente() {
        this.stocuri = new HashMap<>();
        this.stocuri.put("Paracetamol",20);
        this.stocuri.put("Nurofen",26);
        this.stocuri.put("Aspirina",12);
    }

    public abstract void primesteReteta();
    public abstract boolean verificaStoc();
    public abstract void aducereMedicamente();
    public abstract void incaseaza();
    public abstract void emiteBon();
    public abstract void respingeAchizitie();

    public final void achizitioneazaMedicamente() {
        primesteReteta();
        if(verificaStoc()) {
            aducereMedicamente();
            incaseaza();
            emiteBon();
        } else {
            respingeAchizitie();
        }
    }

}
