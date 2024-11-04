package generics.classes;
//amacımız: farklı fieldlarda farklı data tiplerini bağımsız olarak kullanma
public class GenericClassTwoPram<S,U> {//S:String U:Integer

    private S anahtar;//S:tüm NON-PRIMITIVE data tipleri

    private U deger;//tüm NON-PRIMITIVE data tipleri


    //Constructor ile ikisini bir arada kullanabileceğimiz parametre constructor neden kullandık...
    public GenericClassTwoPram(String,Integer) object =new GenericClassTwoPram<>();


    public S getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(S anahtar) {
        this.anahtar = anahtar;
    }

    public U getDeger() {
        return deger;
    }

    public void setDeger(U deger) {
        this.deger = deger;
    }
}
