public class Book {
    String judul, author, tahunTerbit, genre;
    double hargaBuku;
    int stok;

    public boolean pinjamBuku(int jumlah) {
        if (jumlah > 0 && stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Book " + judul + " successfully borrowed");
            return true;
        }
        System.out.println("Failed to borrow the book " + judul);
        return false;
    }

    public void tambahStock(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Book stock " + judul + " successfully added");
        }
    }

    public double setDiskon(double persen) {
        if (persen > 0 && persen <= 100) {
            return hargaBuku - (hargaBuku * (persen / 100));
        }
        return hargaBuku;
    }

    public void tampilkanDiskon(double persen) {
        double hargaAkhir = setDiskon(persen);
        System.out
                .println("Book " + judul + " price after " + (int) persen + "% discount is: " + Math.round(hargaAkhir));
    }

    public void aboutBook() {
        System.out.println("Judul: " + judul);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Year Published: " + tahunTerbit);
        System.out.println("Stock: " + stok);
        System.out.println("Book Price: " + hargaBuku);
        System.out.println();
    }
}
