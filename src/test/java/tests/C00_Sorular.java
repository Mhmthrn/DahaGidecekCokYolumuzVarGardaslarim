package tests;

public class C00_Sorular {
    /*
    Test01 :
1- amazon gidin
2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
3- dropdown menude 40 eleman olduğunu doğrulayın
Test02
1- dropdown menuden elektronik bölümü seçin
2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
4- ikinci ürüne relative locater kullanarak tıklayin
5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
Test03
1- yeni bir sekme açarak amazon anasayfaya gidin
2-dropdown’dan bebek bölümüne secin
3-bebek puset aratıp bulundan sonuç sayısını yazdırın
4-sonuç yazsının puset içerdiğini test edin
5-üçüncü ürüne relative locater kullanarak tıklayin
6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
Test 4
1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayı
     */

    /*
    ● Bir class oluşturun: DependsOnTest
● https://www.amazon.com/ adresine gidin.
1. Test : Amazon ana sayfaya gittiginizi test edin
2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
ve aramanizin gerceklestigini Test edin
3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83
oldugunu test edin

     */

    /*
    1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
2 ) Bir metod olusturun: iframeTest
- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve
konsolda yazdirin.
- Text Box’a “Merhaba Dunya!” yazin.
- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
gorunur oldugunu dogrulayin ve konsolda yazdirin.

     */

    /*
    1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
2) sayfadaki iframe sayısını bulunuz.
3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
4) ilk iframe'den çıkıp ana sayfaya dönünüz
5) ikinci iframe'deki (Jmeter Made Easy) linke
(https://www.guru99.com/live-selenium-project.html) tıklayınız

     */

    /*
    ● Tests package’inda yeni bir class olusturun: WindowHandle2
● https://the-internet.herokuapp.com/windows adresine gidin.
● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
● Click Here butonuna basın.
● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
dogrulayin.
● Sayfadaki textin “New Window” olduğunu doğrulayın.
● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
olduğunu doğrulayın.

     */

    /*
    1. "https://facebook.com" Adresine gidin
2. “create new account” butonuna basin
3. “firstName” giris kutusuna bir isim yazin
4. “surname” giris kutusuna bir soyisim yazin
5. “email” giris kutusuna bir email yazin
6. “email” onay kutusuna emaili tekrar yazin
7. Bir sifre girin
8. Tarih icin gun secin
9. Tarih icin ay secin
10. Tarih icin yil secin
11. Cinsiyeti secin
12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
13. Sayfayi kapatin
     */

    /*
    1- Bir Class olusturalim KeyboardActions2
2- https://html.com/tags/iframe/ sayfasina gidelim
3- video’yu gorecek kadar asagi inin
4- videoyu izlemek icin Play tusuna basin
5- videoyu calistirdiginizi test edin

     */

    /*
    1. Tests packagenin altina bir class oluşturalim : C04_FileDownload
2. https://the-internet.herokuapp.com/download adresine gidelim.
3. logo.png dosyasını indirelim
4. Dosyanın başarıyla indirilip indirilmediğini test edelim

     */

    /*
    1. Tests packagenin altina bir class oluşturun : C05_UploadFile
2. https://the-internet.herokuapp.com/upload adresine gidelim
3. chooseFile butonuna basalim
4. Yuklemek istediginiz dosyayi secelim.
5. Upload butonuna basalim.
6. “File Uploaded!” textinin goruntulendigini test edelim.
     */

    /*
    1. Bir class olusturun : EnableTest
2. Bir metod olusturun : isEnabled()
3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
4. Textbox’in etkin olmadigini(enabled) dogrulayın
5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
7. Textbox’in etkin oldugunu(enabled) dogrulayın.

     */

    /*
    1. "http://webdriveruniversity.com/Actions" sayfasina gidin
2. "Hover over Me First" kutusunun ustune gelin
3. "Link 1" e tiklayin
4. Popup mesajini yazdirin
5. Popup'i tamam diyerek kapatin
6. "Click and hold" kutusuna basili tutun
7. "Click and hold" kutusunda cikan yaziyi yazdirin
8. "Double click me" butonunu cift tiklayin

     */


    /*
    1. “https://demoqa.com/webtables” sayfasina gidin
2. Headers da bulunan basliklari yazdirin
3. 3.sutunun basligini yazdirin
4. Tablodaki tum datalari yazdirin
5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
6. Tablodaki satir sayisini yazdirin
7. Tablodaki sutun sayisini yazdirin
8. Tablodaki 3.kolonu yazdirin
9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
sayisini girdigimde bana datayi yazdirsin
     */

    /*
    1. apache poi dependency’i pom file’a ekleyelim
2. Java klasoru altinda resources klasoru olusturalim
3. Excel dosyamizi resources klasorune ekleyelim
4. excelAutomation isminde bir package olusturalim
5. ReadExcel isminde bir class olusturalim
6. readExcel( ) method olusturalim
7. Dosya yolunu bir String degiskene atayalim
8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
10. WorkbookFactory.create(fileInputStream)
11. Worksheet objesi olusturun workbook.getSheetAt(index)
12. Row objesi olusturun sheet.getRow(index)
13. Cell objesi olusturun row.getCell(index)

     */
}
