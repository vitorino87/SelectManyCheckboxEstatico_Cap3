/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class ExemploMB {

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }
    private List<String> escolhidos = new ArrayList<>();
    @PostConstruct
    public void init(){
        escolhidos.add("PR");
        escolhidos.add("SC");
    }

    public List<String> getEscolhidos() {
        return escolhidos;
    }

    public void setEscolhidos(List<String> escolhidos) {
        this.escolhidos = escolhidos;
    }
    
}
