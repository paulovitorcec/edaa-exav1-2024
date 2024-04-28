import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fifa implements Comparable<Fifa> {

    private String pais;
    private String confederacao;
    private Float populacaoglobal;
    private Float audienciatv;
    private Float pibponderado;

    private List<Fifa> fifa = new ArrayList<>();
    public Fifa (){

    }
    
    public Fifa(String pais, String confederacao, Float populacaoglobal, Float audienciatv, Float pibponderado) {
        this.pais = pais;
        this.confederacao = confederacao;
        this.populacaoglobal = populacaoglobal;
        this.audienciatv = audienciatv;
        this.pibponderado = pibponderado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getConfederacao() {
        return confederacao;
    }

    public void setConfederacao(String confederacao) {
        this.confederacao = confederacao;
    }

    public Float getPopulacaoglobal() {
        return populacaoglobal;
    }

    public void setPopulacaoglobal(Float populacaoglobal) {
        this.populacaoglobal = populacaoglobal;
    }

    public Float getAudienciatv() {
        return audienciatv;
    }

    public void setAudienciatv(Float audienciatv) {
        this.audienciatv = audienciatv;
    }

    public Float getPibponderado() {
        return pibponderado;
    }

    public void setPibponderado(Float pibponderado) {
        this.pibponderado = pibponderado;
    }

    public List<Fifa> getFifa() {
        return fifa;
    }

        @Override
    public String toString() {
        return pais + ", " + confederacao + ", " + populacaoglobal + ", " + audienciatv + ", " + pibponderado;
    }

    @Override
    public int compareTo(Fifa other) {
        return this.pais.compareTo(other.getPais());
    }

    public static void sortPaises(List<Fifa> list) {
        Collections.sort(list);
        listPaises(list);
    }

    public static void sortAudiencia(List<Fifa> list) {
        Collections.sort(list, (fifa1, fifa2) -> fifa2.getAudienciatv().compareTo(fifa1.getAudienciatv()));
        listPaises(list);
    }

    public static void listPaises(List<Fifa> list) {
        for (Fifa f : list) {
            System.out.println(f);
        }
    }
    
    public static void imprimirLista(List<Fifa> lista) {
        for (Fifa fifa : lista) {
            System.out.println(fifa);
        }
    }
}