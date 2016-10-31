/*
 visibilita' attributi e metodi
 classe         package  sottoclasse esterno       (altro package)
 private             s         n        n           n
 (package            s         s        n           n)
 protected           s         s        s           n  
 public              s         s        s           s
 se non metto niente s         n       n          n  come il private



 */
package a4incapsulamento;

/**
 *
 * @author roberto.masella
 */
class incapsulamento {

    int var1 = 10;
    int var2 = 15;
    int somma;

    public int publicvar1 = 10;
    public int publicvar2 = 15;
    public int publicsomma;
    protected int protectedvar =12;
    private int privatevar1 =12;

    // senza incapsulamento
    void somma() {
        //utilizzo public e anche le private e protected
        somma = var1 + var2;
        privatevar1=12;
        protectedvar=12;
    }

    //con incapsulamento
    public void publicsomma() {
        publicsomma = publicvar1 + publicvar2;
        privatevar1=13;
        protectedvar=12;
    }
}

// sottoclasse: puo' utilizzare metodi e attributi della classe padre
//senza incapsualmento
class eredita extends incapsulamento {

    void prova() {
        //non vedo private ma vedo public protected
        somma();
        System.out.println(" visibile: " + var1 + " " + var2 + " " + somma);
        //non vedo la private!!!
        //privatevar1=13;
        publicvar1=12;
        protectedvar=13;

    }

    public void publicprova() {
        publicsomma();
        System.out.println(" visibile public: " + publicvar1 + " " + publicvar2 + " " + publicsomma);
        //non vedo la private
        //privatevar1=12;
        protectedvar=12;
    }
}




