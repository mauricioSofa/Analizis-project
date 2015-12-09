/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Soporte
 */
import java.util.ArrayList;

public class Punto1 {

    private ArrayList<Zona> Terrenos = new ArrayList<>();
    public ArrayList<Zona> firstOption;
    /* Acomuladores de beneficios*/
    private int verificar;
    private int TerreniSize;

    public Punto1(ArrayList<Zona> zonas) {
        firstOption = new ArrayList<>();
        this.Terrenos = zonas;

        TerreniSize = Terrenos.size();
    }

    public void calculo(int salto, int ValorI) {
        int ganancia = 0;
        int Valor = ValorI;
        ArrayList<Zona> temporal = new ArrayList<>();
        for (int i = Valor; i < TerreniSize; i += salto) {
            System.out.println("Paso: " + i);
            temporal.add(Terrenos.get(i));
            ganancia += Terrenos.get(i).getBeneficio();
            System.out.println("-+-+-+-");

        }

        if (ganancia > verificar) {
            firstOption = (ArrayList<Zona>) temporal.clone();
            verificar = ganancia;

            temporal.clear();
            ganancia = 0;
            if (salto < TerreniSize) {
                calculo(salto + 1, Valor);
            }
        } else {
            // Si no se cumple la condicion reinica la longitud del arreglo
            temporal.clear();
            ganancia = 0;
            if (salto < TerreniSize) {
                calculo(salto + 1, Valor);
            }
        }

    }

    /*Creacion de funcion recursivas esta funcion se encaar de llamar recusivamente la los saltos iteretivos
    que declare en la funcion */
    public void Recursiva(int inicia) {
        int variable = inicia;
        calculo(2, variable);
        if (variable < TerreniSize) {
            variable++;
            Recursiva(variable);
            

        }

    }

    public void print() {
        ArrayList<Zona> lista = (ArrayList<Zona>) firstOption.clone();
        /*Imprime en consola*/
        System.out.println("Imprimir: ");
        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Numero de zona: " + lista.get(i).getNumberZone());
            System.out.println("Beneficio: " + lista.get(i).getBeneficio());
            System.out.println("-+-+-+-+-+-+-");
        }
    }

    private void printFile(ArrayList<Zona> Wlista) {
        /*Imprime en Archivo de texto*/
        EscribeFichero escribir = new EscribeFichero();
        escribir.setAddelement(Wlista.size());
        escribir.setAddelement(Wlista);
        escribir.setArchivoWrite();

    }
}
