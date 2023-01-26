public class Main {// ana sınıf

    public static int Arama(int arr[], int x) {// Arama adında meteot olüştürdük
        int n = arr.length;// dizinin uzunluğunu n değişkenine atadık, karşılaştırmada sonlandırma adımı olacak
        for(int i = 0; i < n; i++) {// aranan sayıyı karşılaştırmak için for döngüsü olüştürdük
            if(arr[i] == x)//Aranan sayıyla dizi yi teker teker karşılaştırma yapıldı
                return i;// aranan sayıyla dizide ki sayı aynı ise indi döndürüyoruz
        }
        return -1;// aranan sayı dizide yok ise -1 döndürüyoruz
    }


    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9 };
        int x = 34;// aranan sayı

        int result = Main.Arama(arr, x);// result adında  Main'den türtiğimiz değişkeni Arama metotdu ile çağırdık
        if(result == -1)// Arama metodunda gelen indis değere göre karşılaştırma yapıyor
            System.out.print("Dizide aranan sayı yok..");
        else
            System.out.print("Dizide aranan sayının indis değeri: " + result);
    }


}
