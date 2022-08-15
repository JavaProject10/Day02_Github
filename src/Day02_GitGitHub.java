public class Day02_GitGitHub {
    /*
    1)- git init --> local repo oluşturmak için yani .git ile klasörümüzün iiçndeki
    dosyalarımızı ilişkilendirmek için kullanılır.

    2)- git add . --> working space den (yani yerel) dosyalarımı stageing arwea ya (yani commit lelek
    için beklenen yer) gönderir

     3)- git status --> working space ve staging area daki durumu gösterir


    4)- git commit -m"mesaj"  --> staging area dan commit store a dosylarımı göndermek için kullanılır
    (commit yani versiyon yada sürüm oluşturmuş olurum)

    5)- git push --> uzak repo ya (yani remote-Github) göndermek için kullandığımız kod
    yanlız git push komutunu direk kullanmak istersek bir kez

        git remote add origin (adres) komutu yazılacak
        git push -u origin master

   NOT:yukarıdaki iki komutu tek seferde kullandıktan sonra diger ikinci commitlerim için sadece
   git push kullanırız

NOT : git log --oneline --> commitlerimdeki yeni versiyonun durumunu gösterir
     */
    public static void main(String[] args) {
        System.out.println("github da öğrendim");
    }
}
