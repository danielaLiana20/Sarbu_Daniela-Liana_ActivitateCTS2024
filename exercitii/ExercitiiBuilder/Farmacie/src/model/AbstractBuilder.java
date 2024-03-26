package model;

public interface  AbstractBuilder {

        public abstract AbstractBuilder adaugaNumarPungi(int numarPungi);

        public abstract AbstractBuilder adaugaPlataCuCardul(boolean plataCuCardul);

        public abstract AbstractBuilder adaugaCardFidelitate(boolean cardFidelitate);
        public abstract AbstractBuilder adaugaCotaTVA(int cotaTVA );

        public abstract Factura build();
}
