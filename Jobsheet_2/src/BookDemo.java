public class BookDemo {
    public static void main(String[] args) {
        Book buku1 = new Book();
        Book buku2 = new Book();

        buku1.judul = "No Longer Human";
        buku1.author = "Osamu Dazai";
        buku1.genre = "Tragic Fiction";
        buku1.stok = 10;
        buku1.tahunTerbit = "1948";
        buku1.hargaBuku = 40000;

        buku2.judul = "Crime and Punishment";
        buku2.author = "Fyodor Dostoyevsky";
        buku2.genre = "Fiction Psychology";
        buku2.stok = 5;
        buku2.tahunTerbit = "1866";
        buku2.hargaBuku = 35000;

        buku1.aboutBook();
        buku2.aboutBook();

        buku1.tambahStock(4);
        buku2.tambahStock(10);

        buku1.aboutBook();
        buku2.aboutBook();

        buku1.pinjamBuku(15);
        buku2.pinjamBuku(2);

        buku1.tampilkanDiskon(20);
        buku2.tampilkanDiskon(30);
    }
}
