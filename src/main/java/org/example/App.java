package org.example;

/**
 * La fattura è un documento fiscale che contiene la data, il mittente, il destinatario,
 * prodotti o servizi che sono stati venduti.
 * Si vuole simulare un sistema di fatturazione (data, mittente, destinatario(classe azienda), array di riga fattura(un prodotto e quantità))
 * il sistema deve calcolare il totale della fattura
 */
public class App 
{
    public static void main( String[] args )
    {
        Prodact prodact = new Prodact(new String[]{"prodotto1", "prodotto2", "prodotto3", "prodotto4"});
        Company company = new Company("company1", "address1");
        Company company2 = new Company("company2", "address2");
        Invoice invoice = new Invoice("12/12/2020", company.getName(), company2.getName(), prodact.getProduct(), prodact.getQuantity());
        System.out.println(invoice);
    }
}
