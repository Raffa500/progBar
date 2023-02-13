/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progbar;

/**
 *
 * @author raffaele.lubrano
 */
public class ProgBar {
  public static void main(String argv[])
  {
    Coda codaOrdinazioni = new Coda();
    Ordine ord;

    ord = new Ordine("05", "4 caffe'");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = new Ordine("03", "2 bibite");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = new Ordine("11", "1 caffe', 2 bibite");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();

    ord = new Ordine("15", "1 cappuccino");
    codaOrdinazioni.aggiungi(ord);
    System.out.println("--Aggiunto ordine");

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();

    ord = (Ordine) codaOrdinazioni.togli();
    System.out.println("Soddisfatto ordine:");
    ord.stampa();
  }
}
