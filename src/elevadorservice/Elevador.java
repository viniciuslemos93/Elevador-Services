/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elevadorservice;

import java.util.List;

/**
 * Suponha que a administração do prédio 99a da Tecnopuc, com 16 andares e cinco elevadores, denominados A, B, C, D e E, nos convidou a aperfeiçoar o sistema de controle dos elevadores.
 * Depois de realizado um levantamento no qual cada usuário respondia:
a. O elevador que utiliza com mais frequência (A, B, C, D ou E);
b. O andar ao qual se dirigia (0 a 15);
c. O período que utilizava o elevador – M: Matutino; V: Vespertino; N: Noturno.

Considerando que este possa evoluir para um sistema dinâmico, escreva o código que nos ajude a extrair as seguintes informações:
a. Qual é o andar menos utilizado pelos usuários;
b. Qual é o elevador mais frequentado e o período que se encontra maior fluxo;
c. Qual é o elevador menos frequentado e o período que se encontra menor fluxo;
d. Qual o período de maior utilização do conjunto de elevadores;
e. Qual o percentual de uso de cada elevador com relação a todos os serviços prestados;

Deve ser programado em Java ou C#.

Para a realização do exercício você deve implementar a interface IElevadorService.

Faça a leitura do arquivo input.json para ter acesso às entradas.
 *
 * @author Vinicius
 */
public class Elevador {
    public String andar;
    public String elevador;
    public String turno;

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public void setElevador(String elevador) {
        this.elevador = elevador;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public String getAndar() {
        return andar;
    }

    public String getElevador() {
        return elevador;
    }

    public String getTurno() {
        return turno;
    }
    /*
    @Override
    public String toString() {
        return "Elevador{" + "andar=" + andar + ", elevador=" + elevador + ", turno=" + turno + '}';
    }*/

void andarMenosUtilizado() {
    int andares[] = new int[15];
    //populando o array de andares.
    for (int i = 0; i <= 15; i++) {
        andares[i] = i;
    }
    for (int elemento : andares) {
        System.out.println(elemento);
    }
}

void elevadorMaisFrequentado() {
    String maisFrequentado;
    int A=0, B=0, C=0, D=0, E=0;
    
    if (elevador == "A") {
        A++;
    }else if (elevador == "B"){
        B++;
    }else if (elevador == "C") {
        C++;
    }else if (elevador == "D") {
        D++;
    }else if (elevador == "E") {
        E++;
    }else
        System.out.println("Elevador inexistente");
}

void elevadorMenosFrequentado() {
    System.out.println("Elevador menos frequentado: " + this.elevador);
}

}