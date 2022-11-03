public class RaportSedinta implements Raport{
    String motiv;
    String data;
    String subiecte;
    String minuta;
    String persoane;

    public void generareTitlu() {
        String[] motive = {"implementare","premiere","what's new","participant nou","proiect"};
        motiv = motive[(int)(Math.random()*4)];
        String[] date = {"13.12.2020", "16.12.2020", "18.12.2020", "01.12.2020", "11.12.2020", "15.12.2020"};
        data = date[(int)(Math.random()*5)];
    }

    public void generareContinut() {
        String[] sub = {"daily?","pareri?","cine vrea sa fie ghid?","entuziasmati?","important","timp liber"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<2;i++) {
            int r = (int)(Math.random()*5);
            if(sb.indexOf(sub[r])!=-1)
                continue;
            else
                sb.append(sub[r] + ", ");
        }
        subiecte = String.valueOf(sb);

        String[] rez = {"100% procentaj de feedback. ", "pareri proaste", "extraordinar", "se putea si mai bine:(", "s-a decis: liber"};
        StringBuilder s = new StringBuilder();
        for(int i=0;i<3;i++) {
            int r = (int)(Math.random()*4);
            if(s.indexOf(rez[r])!=-1)
                continue;
            else
                s.append(rez[r] + ", ");
        }
        minuta = String.valueOf(s);
    }

    public void generareIncheiere() {
        String[] pers= {"Ioana Roman","Geo Bogza","Marin Preda","Alexandru Lapusneanu","Dragos Popa","Marius Pop","Mihai Miu"};
        StringBuilder p = new StringBuilder();
        for(int i=0;i<3;i++) {
            int r = (int)(Math.random()*6);
            if(p.indexOf(pers[r])!=-1)
                continue;
            else
                p.append(pers[r] + ", ");
        }
        persoane = String.valueOf(p);
    }

    RaportSedinta() {
        generareTitlu();
        generareContinut();
        generareIncheiere();
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Raport sedinta: { \n Motiv: " + motiv + "\n Data: " + data + "\n Subiect: " + subiecte + "\n Minuta: " + minuta + "\n Persoane responsabile: " + persoane + "\n }" ;
    }


}
