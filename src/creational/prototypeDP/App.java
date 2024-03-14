package creational.prototypeDP;

public class App {
// Prototype DP, nesnelerin kopyalanması için kullanılır.
    // Daha ziyade maliyetli oluşturulan nesnelerin kopyalanması için kullanılır.

    /***
     * Ancak önemli bir detay var ki o da nesnelerin kopyalanması için clone() metodunun kullanılması gerekiyor.
     * Buda Cloneable interface’ini implemente etmek gerektiği anlamına geliyor.
     * Ancak Bir nesnenin clone alındığında alt nesne olarak referansladığı nesnelerin de clone alınması gerekiyor.
     * Aksi takdirde referansladığı nesnelerin referansları aynı olacağı için bir nesnenin değişmesi diğer nesneyi de etkileyecektir.
     * Bu durumda da deep copy yapmamız gerekiyor.
     *
     *
     * Ancak tek nesne üzerinden alt nesneleri kopyalamayacaksak bu durumda da shallow copy yapmamız gerekiyor.
     * @param args
     */



    /***
     * Shallow copy yapıyoruz burda bir nesne üzerinde alt nesneleri yani relationları kopyalamıyoruz. Böyle bir durumda
     * şu sorun olabilir belge nesnesinin oluşmuş bir instance'ı var ve bu instance'ın belgeTuru ve kategori nesneleri
     * var. Bu nesnelerin de instance'ları var. Böylece clone edildiğinde yeni bir belge nesnesi oluşacak ancak bu nesnede
     * alt sınıflarda yani relationlarda bir değişiklik yapıldığında ilk prototype nesnesi de değişecektir. Çünkü
     * bu nesnelerin referansları aynı olacaktır. Bu durumda da deep copy yapmamız gerekiyor.
     * @return
     * @throws CloneNotSupportedException
     *
     *   @Override
     *     protected Object clone() throws CloneNotSupportedException {
     *         return super.clone();
     *     }
     */


    /***
     * Deep copy yapıyoruz burda bir nesne üzerinde alt nesneleri yani relationları kopyalıyoruz. Böyle bir durumda
     * şu sorun olabilir belge nesnesinin oluşmuş bir instance'ı var ve bu instance'ın belgeTuru ve kategori nesneleri
     * var. Bu nesnelerin de instance'ları var. Böylece clone edildiğinde yeni bir belge nesnesi oluşacak ve bu nesnede
     * alt sınıflarda yani relationlarda bir değişiklik yapıldığında ilk prototype nesnesi de değişmeyecektir. Çünkü
     * bu nesnelerin referansları farklı olacaktır. Bu durumda da deep copy yapmamız gerekiyor.
     *
     *     protected Object clone() throws CloneNotSupportedException {
     *         Belge belge = (Belge) super.clone();
     *         belge.setBelgeTuru((BelgeTuru) belgeTuru.clone());
     *         belge.setKategori((Kategori) kategori.clone());
     *         return belge;
     *     }
     */

    // TODO :: Shallow Copy , Deep Copy , Cloneable interface , clone() methodu
    public static void main(String[] args) throws CloneNotSupportedException {

        GenelEntityService genelEntityService = new GenelEntityService();

        Belge belgeProtoType = genelEntityService.belgeGetir(2L);

        Belge belgeClone = (Belge) belgeProtoType.clone();
        belgeClone.getBelgeTuru().setBelgeAdi("Deneme");
        belgeClone.setBelgeAdi("Deneme Belgesi");

        Belge belgeClone2 = (Belge) belgeProtoType.clone();
        belgeClone2.getBelgeTuru().setBelgeAdi("Deneme2");


        System.out.println(belgeProtoType.toString());
        System.out.println(belgeClone.toString());



    }
}
