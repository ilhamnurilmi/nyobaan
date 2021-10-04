package com.company;

public class Main {

    public static void main(String[] args) {
        Barang barang01= new Barang("BRG-001", "Tas Gucci");
        Barang barang02= new Barang( "BRG-002", "Printer Epson L355");

        barang01.setHargaBarang(1200);
        barang02.setHargaBarang(200);

        Barang barang03 = new Barang( "BRG-003", "Koper", 150);
        Barang barang04 = new Barang( "BRG-004", "Helm", 20);

        barang01.printData();
        System.out.println();
        barang02.printData();
        System.out.println();
        barang03.printData();
        System.out.println();
        barang04.printData();
        System.out.println();

        System.out.print("\nTotal Harga dari BRG-001, BRG-003, dan BRG-004: ");
        System.out.print(barang01.getHargaBarang() + barang03.getHargaBarang() + barang04.getHargaBarang() );
    }
}
