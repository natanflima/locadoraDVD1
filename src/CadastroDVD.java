package src;

import locadoradvd.Amigo;

public class CadastroDVD {
    
    private int altera;
    private int exclui;
    private Amigo inclui; 

    public CadastroDVD(int altera, int exclui, Amigo inclui) {
        this.altera = altera;
        this.exclui = exclui;
        this.inclui = inclui;
    }

    public int getAltera() {
        return altera;
    }

    public void setAltera(int altera) {
        this.altera = altera;
    }

    public int getExclui() {
        return exclui;
    }

    public void setExclui(int exclui) {
        this.exclui = exclui;
    }

    public Amigo getInclui() {
        return inclui;
    }

    public void setInclui(Amigo inclui) {
        this.inclui = inclui;
    }

    

}
