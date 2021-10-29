# toDo


Öncelikle selamlar,
Sizinle çalışmayı isterim. Backend konusunda kendimi biraz da olsa geliştirdim. Frontend de ise react native kullnarak mobil uygulamalar yapmışlığım var. 
Daha önce yaptığım uygulamalarda firebase ve amazon aws kullanmıştım. Fakat ben kendi backendimi kullanmak istiyorum. Bu yüzden java spring öğrenmeye başladım.

Hali hazırda mobil uygulamalarımda ve backend arasında bağlantı kurmakta zorlanıyorum. Zaten bunu yapabilirsem çok kısa sürede bir sürü mobil uygulama çıkartacağıma inanıyorum.


Verdiğiniz taskı elimden geldiğince yapmaya çalıştım.Fazla vaktim yoktu. Frontendde bir şeyler yapmayı isterdim ama zaten backend ile frontend arasında verileri axios ile
almaya çalıştım(react native ile mobil yapmayı denedim.).@cross origin verdiğim halde mobilde veriyi alamadım. React kullanarak da internet sitesi yapmayı denemedim.

## Ana yapı ##
![Alt text](https://i.hizliresim.com/509dnut.jpeg)


## Ali adlı yeni bir kullanıcı kayıt oluyor. ##
![Alt text](https://i.hizliresim.com/29n186g.jpeg)

## Burada da getall içinde aliyi görebiliyoruz. ##
![Alt text](https://i.hizliresim.com/bk6pqek.jpeg)


Yeni kullanıcı kayıt yapılırken frontendci hemen emaile göre arama yapıp daha önce bu e mail alınmış gibi bir uyarı çıkartabilir. Veya kayıt olma ekranında şifreleri 
karşılaştırıken iki şifre uyuşmuyor uyarıları yapabilir. Daha önce firebase ile böyle bir authentication yapmıştım.

Burada yapılacaklar listesine eklenecek olayın post metodu var. Frontendde kayıt olunduktan sonra kullanıcının id'sini tutmamız lazım bir değişkende. 
Çünkü herhangi bir şey eklemek istediğimizde request boddy de hangi kullanacının listesine eklemek istediğimizi burada kullanıcı id olarak da yazmalıyız.
## Görselde aliye eve gel olayını ekliyorum. ##


![Alt text](https://i.hizliresim.com/5xz4l62.jpeg)

## item için getall çalıştırdığımızda alinin eve gel olayını görebiliyoruz. ##

![Alt text](https://i.hizliresim.com/8938t6t.jpeg)

![Alt text](https://i.hizliresim.com/gmhbox7.jpeg)


Burada kullanıcı uygulamya giriş yaptıktan sonra idsini değişkende tutup. Item tablosundan o kişinin tüm listesini çekmeyi denedim. Fakat bu sorgu
**SELECT * From "items"  INNER JOIN "users" ON "items"."user_id"="users"."id"** 
datebasede çalışmasına rağmen java spring bootta koda dökemedim. Kendim QUARY yazmayı denedim ama
item tablosu içinde user_id olarak tutulan kısım user tipinde olduğu için sorgumu atarken bir tip uyuşmazlığı çıkıyor. Bunun için ara sınıf yapmam gerekiyor sanırım.





